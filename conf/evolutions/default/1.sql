# --- First database schema

# --- !Ups

create table company (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_company primary key (id))
;

create table computer (
  id                        bigint not null,
  name                      varchar(255),
  introduced                timestamp,
  discontinued              timestamp,
  company_id                bigint,
  constraint pk_computer primary key (id))
;

create table users (
  email                     varchar(255) not null,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  address_1                 varchar(255),
  address_2                 varchar(255),
  city                      varchar(80),
  state                     varchar(80),
  zip_code                  varchar(20),
  cell_phone                varchar(20),
  home_phone                varchar(20),
  constraint pk_users primary key (email))
;

create table payment (
  id                        bigint not null,
  cc_number                 varchar(255),
  cc_address_1              varchar(255),
  cc_address_2              varchar(255),
  cc_city                   varchar(80),
  cc_state                  varchar(80),
  cc_zip_code               varchar(20),
  cc_phone                  varchar(20),
  users_email               varchar(255),
  constraint pk_payment primary key (id))
;

create sequence company_seq start with 1000;

create sequence computer_seq start with 1000;

create sequence users_seq start with 1000;

create sequence payment_seq start with 1000;

alter table computer add constraint fk_computer_company_1 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_1 on computer (company_id);

alter table payment add constraint fk_payment_users_1 foreign key (users_email) references users (email) on delete restrict on update restrict;
create index ix_payment_users_1 on payment (users_email);

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists company;

drop table if exists computer;

drop table if exists users;

drop table if exists payment;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists company_seq;

drop sequence if exists computer_seq;

drop sequence if exists users_seq;

drop sequence if exists payment_seq;

