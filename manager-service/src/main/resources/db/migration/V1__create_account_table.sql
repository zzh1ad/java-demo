CREATE TABLE account
(
    id       serial PRIMARY KEY,
    username varchar(30) not null,
    password varchar(30) not null
);