create database db_rh;

use db_rh;

create table tb_funcionaries(
	id bigint auto_increment,
    nome varchar(240) not null,
    idade int not null,
    matricula int not null,
    doc int not null,
    salario float not null,
    
    primary key(id)    
);

insert into tb_funcionaries (nome, idade, matricula, doc, salario) values ("Cibele",25,0231,72,3200.00);
insert into tb_funcionaries (nome, idade, matricula, doc, salario) values ("Ariel",25,0231,76,1200.00);
insert into tb_funcionaries (nome, idade, matricula, doc, salario) values ("Joel",25,0231,75,2000.00);
insert into tb_funcionaries (nome, idade, matricula, doc, salario) values ("Moana",25,0231,74,3200.00);
insert into tb_funcionaries (nome, idade, matricula, doc, salario) values ("Mario",25,0231,73,2200.00);

select*from tb_funcionaries where salario > 2000.00;

select*from tb_funcionaries where salario < 2000.00;

update tb_funcionaries set salario = 1700.00 where id =2;

select*from tb_funcionaries;











