create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id bigint auto_increment,
    classe varchar(255) not null,
	habilidade varchar(255) not null,
    cenario varchar(255) not null,
    
    primary key (id)
);

insert tb_classe (classe, habilidade, cenario) values ("Sacerdote", "Poder divino", "Grupo do Éden");
insert tb_classe (classe, habilidade, cenario) values ("Alquimista", "Transmutação", "Amestris");
insert tb_classe (classe, habilidade, cenario) values ("Templario", "Combatente", "Sede da Ordem");
insert tb_classe (classe, habilidade, cenario) values ("Odalisca", "Dança do Ventre", "Fauna Mistica");
insert tb_classe (classe, habilidade, cenario) values ("Mercenário", "Invisibilidade", "Katar");

create table tb_personagem (
	id bigint auto_increment,
    	nome varchar(255) not null,
	idade int not null,
	defesa int not null,
	ataque int not null,	
	classe_id bigint not null, 
   
	primary key (id),
	foreign key (classe_id) references tb_classe (id)
);

insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Kero", 35, 1000, 3000, 1);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Chimmy", 80, 2500, 1000, 2);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Sakura", 55, 3000, 800, 3);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Meilin", 37, 1500, 1500, 4);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Conan", 89, 3500, 500, 5);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Shoran", 65, 2000, 1000, 4);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Yukito", 10, 2000, 2000, 1);
insert tb_personagem (nome, idade, defesa, ataque, classe_id) values ("Tomoyo", 26, 2500, 1200, 2);

select * from tb_personagem where ataque > 2000;
select * from tb_personagem where ataque between 1000 and 2000;
select * from tb_personagem where nome like "%C%";

select * from tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id;
select * from tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id
	where tb_classe.habilidade = "Transmutação";
   