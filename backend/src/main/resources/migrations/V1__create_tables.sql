CREATE TABLE users (
    id serial primary key not null,
    name varchar(255) not null,
    surname varchar(255),
    username varchar(50) not null,
    password varchar(255) not null,
    birthday timestamp not null
)
