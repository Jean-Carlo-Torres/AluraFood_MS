CREATE TABLE pagamentos (
    id SERIAL PRIMARY KEY,
    valor numeric(19,2) NOT NULL,
    nome varchar(100),
    numero varchar(19),
    expiracao varchar(7),
    codigo varchar(3),
    status varchar(255) NOT NULL,
    forma_de_pagamento_id bigint NOT NULL,
    pedido_id bigint NOT NULL
);
