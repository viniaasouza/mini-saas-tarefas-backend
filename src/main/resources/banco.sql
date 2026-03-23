DROP TABLE IF EXISTS tb_tarefa CASCADE;
CREATE TABLE tb_tarefa (id SERIAL PRIMARY KEY, titulo VARCHAR(100) NOT NULL, descricao VARCHAR(255));
INSERT INTO tb_tarefa (titulo, descricao) VALUES ('Teste Postgres', 'Conexao limpa e funcionando');