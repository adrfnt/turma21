create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    tamanho varchar(255) not null,
	tipo varchar(255) not null,
    promocao boolean not null,
    
	primary key (id)
);

insert tb_categoria (tamanho,tipo,promocao) values ("Grande", "Especial", true);
insert tb_categoria (tamanho,tipo,promocao) values ("Grande", "Simples", false);
insert tb_categoria (tamanho,tipo,promocao) values ("Média", "Especial", false);
insert tb_categoria (tamanho,tipo,promocao) values ("Média", "Simples", false);
insert tb_categoria (tamanho,tipo,promocao) values ("Broto", "Simples", true);

create table tb_pizza(
	id bigint auto_increment,
	sabor varchar (255) not null,
	borda boolean not null,
	bebida boolean not null,
	preco float not null,
	delivery boolean not null,
	categoria_id bigint,
    
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Frango", true, true, 54.90, false, 1);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Caipira", false, true, 56.90, true, 2);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Napolitana", true, true, 46.00, true, 3);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Palmito", false, false, 52.50, false, 4);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Calabresa", false, true, 27.90, true, 5);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Marguerita", true, false, 44.20, false, 3);
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Lombo", false, true, 24.50, true, 2 );
insert tb_pizza (sabor, borda, bebida, preco, delivery, categoria_id) values ("Brocolis", true, false, 43.50, false, 5);

select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco between 29.00 and 60.00;
select * from tb_pizza where sabor like "%C%";

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
    where tb_categoria.tamanho = "Grande";

select sum(preco) from tb_pizza;
select avg (preco) as media_preco from tb_pizza;