drop database if exists register;
create database register;
use register;

create table users(
    user_name char(50) not null,
    user_pass char(50) not null,
    user_email char(50) not NULL,
    primary key (user_name)
);


insert into users( user_name, user_pass, user_email) values ("FREDU", "FREDP", "FREDE");
insert into users( user_name, user_pass, user_email) values ("ALEXU", "ALEXP", "ALEXE");



/*insert into book(book_id, book_title, book_publisher, book_date) values (1, "Sexta_Feira", "MuitoBom", "2017-01-10");
insert into book(book_id, book_title, book_publisher, book_date) values (2, "Quinta_Feira", "MuitoBom", "2017-02-03");
insert into book(book_id, book_title, book_publisher, book_date) values (3, "Quarta_Feira", "MaisOuMenos", "2011-06-16");

insert into user(user_id, user_name, user_address) values (2, "ALEX FRED", "Fundão");
insert into user(user_id, user_name, user_address) values (3, "Pais Geraldes", "Guarda");


insert into loan(loan_date, book_id, user_id) values ("2017-03-09", 1, 2);
insert into loan(loan_date, book_id, user_id) values ("2017-01-16", 3, 2);*/
