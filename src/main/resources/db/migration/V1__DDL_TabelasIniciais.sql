-- Sequence pessoa
CREATE SEQUENCE sq_tb_pessoa
    START WITH 1 
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


-- Tabela Pessoa
CREATE TABLE tb_pessoa (
	id_pessoa int4 NOT NULL,
	ds_nome varchar(250) NOT NULL,
	ds_cpf varchar(11) NULL,
	ds_email varchar(100) NULL,
	dt_nascimento timestamp with time zone NOT NULL,
	ex_foto varchar(4) NULL,
	md_foto bytea NULL,
	CONSTRAINT tb_pessoa_pkey PRIMARY KEY (id_pessoa),
	CONSTRAINT tb_pessoa_ds_cpf_unique UNIQUE (ds_cpf)
);
