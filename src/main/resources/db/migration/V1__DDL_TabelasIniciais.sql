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
	ds_cpf varchar(11) NOT NULL,
	ds_email varchar(100) NOT NULL,
	dt_nascimento timestamp with time zone NULL,
    ds_foto_base64 text,
	CONSTRAINT tb_pessoa_pkey PRIMARY KEY (id_pessoa),
	CONSTRAINT tb_pessoa_ds_cpf_unique UNIQUE (ds_cpf)
);
