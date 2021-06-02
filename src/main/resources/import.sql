/* SEEDING PIZZA BRASILEIRA*/
INSERT INTO tb_produto (sabor,tamanho) values(0,0);
INSERT INTO tb_produto (sabor,tamanho) values(0,1);
INSERT INTO tb_produto (sabor,tamanho) values(0,2);

/* SEEDING PIZZA CALABRESA*/
INSERT INTO tb_produto (sabor,tamanho) values(1,0);
INSERT INTO tb_produto (sabor,tamanho) values(1,1);
INSERT INTO tb_produto (sabor,tamanho) values(1,2);

/* SEEDING PIZZA DE FRANGO*/
INSERT INTO tb_produto (sabor,tamanho) values(2,0);
INSERT INTO tb_produto (sabor,tamanho) values(2,1);
INSERT INTO tb_produto (sabor,tamanho) values(2,2);


INSERT INTO tb_pedido(preco,produto_id) values(15.0,1);
INSERT INTO tb_pedido(preco,produto_id) values(25.0,2);
INSERT INTO tb_pedido(preco,produto_id) values(35.0,3);

INSERT INTO tb_pedido(preco,produto_id) values(10.0,4);
INSERT INTO tb_pedido(preco,produto_id) values(20.0,5);
INSERT INTO tb_pedido(preco,produto_id) values(25.0,6);

INSERT INTO tb_pedido(preco,produto_id) values(15.0,7);
INSERT INTO tb_pedido(preco,produto_id) values(20.0,8);
INSERT INTO tb_pedido(preco,produto_id) values(25.0,9);


INSERT INTO tb_cliente(nome,telefone,email,endereco,pedido_id) values('Bruno','7599999999','bruno@gmail.com','Av.Artemia Pires-404',1);