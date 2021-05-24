create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table  tb_categoria (
	id bigint auto_increment,
	depto varchar (255) not null,
	ativo boolean not null,
    
    primary key(id)
);

insert tb_categoria (depto, ativo) values ("Pisos e Revestimentos", true);
insert tb_categoria (depto, ativo) values ("Material Hidráulico", true);
insert tb_categoria (depto, ativo) values ("Metais e Acessórios", true);
insert tb_categoria (depto, ativo) values ("Decoração", true);
insert tb_categoria (depto, ativo) values ("Tintas e Acessórios", true);

create table tb_produto (
	id bigint auto_increment,
	nome varchar (255) not null,
	preco float not null,
	quantidade int not null,
    categoria_id bigint,
    
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (nome, preco, quantidade, categoria_id) values ("Quadro", 40.69, 5, 4);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Almofada", 89.99, 5, 4);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Piso Laminado", 44.90, 30, 1);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Torneira para lavatório", 1144.90, 10, 2);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Cantoneira em L", 56.99, 8, 1);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Massa corrida branca", 67.90, 6, 5);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Chuveiro", 112.60, 4, 2);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Assento", 104.90, 2, 3);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and  60;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id 
	where categoria_id = 2;



