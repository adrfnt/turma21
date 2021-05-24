create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
	tipo varchar (255),
	estoque varchar (255),
	ativo boolean not null,
    
	primary key(id)
);

insert tb_categoria (tipo, estoque, ativo) values ("Verduras", "30 caixas", true);
insert tb_categoria (tipo, estoque, ativo) values ("Outros"," 0 caixas", false);
insert tb_categoria (tipo, estoque, ativo) values ("Legumes", "25 caixas", true);
insert tb_categoria (tipo, estoque, ativo) values ("Frutas", " 50 caixas", true);
insert tb_categoria (tipo, estoque, ativo) values ("Cereais", "3 sacos", true);

create table tb_produto (
	id bigint auto_increment,
	nome varchar (255) not null,
	quantidade varchar (255) not null,
	preco float not null,
	categoria_id bigint,
    
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (nome, quantidade, preco, categoria_id) values ("Caqui", "5 caixas", 43.00, 4);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Abacate", "6 unidades", 50.00, 4);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Mandioquinha", "4 caixas", 37.00, 3);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Brócolis", "3 unidades", 10.00, 3);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Cenoura", "2 caixas", 20.00, 1);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Cebolinha", "0 caixas", 5.50, 2);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Batata", "10 unidades", 53.50, 3);
insert tb_produto (nome, quantidade, preco, categoria_id) values ("Aveia", "    ", 0.00, 5);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select *from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
	where tb_categoria.tipo = "Cereais";


