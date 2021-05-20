create database db_escola;

use db_escola;

create table tb_alunos (
	id bigint auto_increment,
    nome varchar(240) not null,
    idade int not null,
    cpf int not null,
    nota float not null,
   
    primary key(id)    
);

insert into tb_alunos (nome, idade, cpf, nota) values ("Fernando", 11, 0263, 7);
insert into tb_alunos (nome, idade, cpf, nota) values ("Augusto", 11, 0264, 5);
insert into tb_alunos (nome, idade, cpf, nota) values ("Luis", 12, 0265, 8);
insert into tb_alunos (nome, idade, cpf, nota) values ("Ana", 11, 0266, 6.5);
insert into tb_alunos (nome, idade, cpf, nota) values ("Lucas", 11, 0267, 10.0);
insert into tb_alunos (nome, idade, cpf, nota) values ("Debora", 12, 0268, 7.0);
insert into tb_alunos (nome, idade, cpf, nota) values ("Lilian", 11, 0269, 4.0);
insert into tb_alunos (nome, idade, cpf, nota) values ("Rosana", 11, 0270, 6.5);

select* from tb_alunos;

select* from tb_alunos where nota > 7;
select* from tb_alunos where nota < 7;

update tb_alunos set nota = 7 where id = 9;
