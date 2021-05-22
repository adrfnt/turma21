create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id bigint auto_increment,
	tipo varchar (255) not null,
	setor varchar(255) not null,
	disponibilidade boolean not null,

primary key (id)
);

insert tb_categoria (tipo, setor, disponibilidade) values ("Analgésico", "Farmácia", true);
insert tb_categoria (tipo, setor, disponibilidade) values ("Creme Hidratante", "Dermo-cosmético", true);
insert tb_categoria (tipo, setor, disponibilidade) values ("Antibiótico", "Farmácia", true);
insert tb_categoria (tipo, setor, disponibilidade) values ("Mascara facial", "Dermo-cosmético", true);
insert tb_categoria (tipo, setor, disponibilidade) values ("Tinta capilar", "Cosméticos", false);

create table tb_produto (
	id bigint auto_increment,
	nome varchar (255) not null,
	quantidade int not null,
	marca varchar (255) not null,
	preco float not null,
	categoria_id bigint,

	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Vitamina D", 2 , "Bayer", 120.50, 1);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Creme hidratante olhos", 1 , "Vichy", 65.00, 2);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Bactrin", 5, "Bayer", 60.50, 3);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Mascara chá verde", 1, "Risca", 13.50, 4);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Tinta Vermelha", 2, "Koleston", 26.50, 5);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Advil", 6 , "Bayer", 18.00, 1);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Creme corpo", 3, "Nivea", 72.50, 2);
insert tb_produto (nome, quantidade, marca, preco, categoria_id) values ("Mascara carvão", 5, "Neutrogena", 65.90,4);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
	where tb_categoria.setor =  "Dermo-cosmético"