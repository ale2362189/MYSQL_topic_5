create database if not exists recipes;
drop table if exists recipes;

use recipes;


drop table if exists flavors;

drop table if exists recipes;


create table recipes (
  id int(10) not null auto_increment,
  name varchar(100) not null,
  primary key(id)
);

create table flavors (
  id int(10) not null auto_increment,
  name varchar(50) not null,
  recipes_id int(10) not null,
  primary key(id),
  foreign key(recipes_id) references recipes(id)
  );