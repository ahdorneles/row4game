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




