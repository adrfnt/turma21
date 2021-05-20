create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment,
    tipo varchar(240) not null,
    preco float not null,
    tamanho int not null,
    codigo int not null,
   
    primary key(id)    
);

select*from tb_produtos;

insert into tb_produtos (tipo, preco, tamanho, codigo) values ("short",60.00,38,709);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("calça",120.00,48,716);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("short",600.00,38,715);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("blusa",800.00,42,714);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("calça",500.00,48,713);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("short",300.00,36,712);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("blusa",400.00,40,711);
insert into tb_produtos (tipo, preco, tamanho, codigo) values ("calça",220.00,42,710);

select*from tb_produtos where preco > 500.00;

select*from tb_produtos where preco < 500.00;

UPDATE tb_produtos set preco = 550.00 WHERE id = 5;

select*from tb_produtos;







