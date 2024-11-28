CREATE TABLE cliente (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT,
    email VARCHAR(255),
    telefone VARCHAR(50)
);

INSERT INTO cliente (nome, idade, email, telefone) VALUES
('Alice', 30, 'alice@example.com', '1234-5678'),
('Bob', 25, 'bob@example.com', '2345-6789');