create sequence student_seq start 1 increment 50;
create table Student (id int8 not null, course varchar(255), firstName varchar(255), lastName varchar(255), version int4 not null, primary key (id));
