# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table contact (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  constraint pk_contact primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table contact;

SET FOREIGN_KEY_CHECKS=1;

