
-- cria a tabela do Artista

CREATE TABLE artista (
	codigo_artista INT NOT NULL AUTO_INCREMENT,
	nome_artista VARCHAR(80) NOT NULL,
	PRIMARY KEY (codigo_artista)
);

-- cria table genero
CREATE TABLE genero (
	codigo_genero INT NOT NULL AUTO_INCREMENT,
	nome_genero VARCHAR(80) NOT NULL,
	PRIMARY KEY (codigo_genero)
);


-- cria table cd
CREATE TABLE cd (
	codigo_cd INT NOT NULL AUTO_INCREMENT,
	codigo_artista INT NOT NULL,
	codigo_genero INT NOT NULL,
	titulo VARCHAR(80) NOT NULL,
	preco DECIMAL(4,2),
	PRIMARY KEY (codigo_cd),
	FOREIGN KEY (codigo_artista) REFERENCES artista(codigo_artista),
	FOREIGN KEY (codigo_genero) REFERENCES genero(codigo_genero)
);
