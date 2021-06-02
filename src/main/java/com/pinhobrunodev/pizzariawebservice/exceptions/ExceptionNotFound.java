package com.pinhobrunodev.pizzariawebservice.exceptions;

import com.pinhobrunodev.pizzariawebservice.utils.MessageUtils;

public class ExceptionNotFound  extends  RuntimeException{


    public ExceptionNotFound(){
        super(MessageUtils.PEDIDO_NAO_ENCONTRADO);
    }
    
}
