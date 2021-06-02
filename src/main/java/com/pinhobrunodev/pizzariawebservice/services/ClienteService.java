package com.pinhobrunodev.pizzariawebservice.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.pinhobrunodev.pizzariawebservice.exceptions.ExceptionBusiness;
import com.pinhobrunodev.pizzariawebservice.exceptions.ExceptionNotFound;
import com.pinhobrunodev.pizzariawebservice.mapper.ClienteMapper;
import com.pinhobrunodev.pizzariawebservice.model.Cliente;
import com.pinhobrunodev.pizzariawebservice.model.Pedido;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteDTO;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteInsertDTO;
import com.pinhobrunodev.pizzariawebservice.repository.ClienteRepository;
import com.pinhobrunodev.pizzariawebservice.utils.MessageUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteMapper mapper;

    @Transactional
    public ClienteDTO save(ClienteInsertDTO dto) {

        Optional<Pedido> validarIdPedido  = repository.findByPedidoId(dto.getPedidoId());

        Optional<Cliente> o1 = repository.findByTelefone(dto.getTelefone());
        Optional<Cliente> o2 = repository.findByEmail(dto.getEmail());
        if (o1.isPresent()) {
            throw new ExceptionBusiness(MessageUtils.TELEFONE_JA_CADASTRADO);
        }
        if (o2.isPresent()) {
            throw new ExceptionBusiness(MessageUtils.EMAIL_JA_CADASTRADO);
        }
        if(!validarIdPedido.isPresent()){
            throw new ExceptionNotFound();
        }
        Cliente entity = mapper.toEntity(dto);
        repository.save(entity);
        return mapper.toClienteDTO(entity);

    }

    public List<ClienteDTO> findAll() {
        return repository.findAll().stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
    }

}
