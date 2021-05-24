create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id bigint auto_increment,
    tipoCurso varchar(255) not null,
    duracao varchar(255) not null,
    ativo boolean not null,
    
    primary key(id)
);

insert tb_categoria(tipoCurso, duracao, ativo) values ("Saúde e Lazer", "1 mes" ,true);
insert tb_categoria(tipoCurso, duracao, ativo) values ("Investimentos", "2 meses" ,true);
insert tb_categoria(tipoCurso, duracao, ativo) values ("Gestão de Contabilidade", "2 meses" ,true);
insert tb_categoria(tipoCurso, duracao, ativo) values ("Planejamento pessoal", "1 mes" ,true);
insert tb_categoria(tipoCurso, duracao, ativo) values ("Vida em Sociedade", "2 meses" ,true);


create table tb_curso(
	id bigint auto_increment,
    nome varchar(255) not null,
    valor int not null,
    certificado boolean not null,
    categoria_id bigint,
    
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert tb_curso (nome, valor, certificado, categoria_id) values ("Alongamento e Yoga Inciante", 250.00, false, 1);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Investimentos de Renda Fixa", 300.00, false, 2);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Investimentos de Renda Variavel", 300.00, false, 2);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Balanço Patrimonial", 200.00, true, 3);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Declarando IR", 89.90, true, 3);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Montando um planner do zero", 60.00, false, 4);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Gestão de Tempo", 50.00, false, 4);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Diversidade", 150.00, false, 5);
insert tb_curso (nome, valor, certificado, categoria_id) values ("Noção Básica de Contabilidade", 150.00, true, 3);

select * from tb_curso where valor > 50;
select * from tb_curso where valor between 3 and 60;
select * from tb_curso where nome like "%J%";

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id
	where tb_categoria.tipoCurso like "%M%";

