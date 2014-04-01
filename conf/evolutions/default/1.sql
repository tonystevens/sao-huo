# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table orders (
  id                        bigint not null,
  item_name                 varchar(255),
  buy_dt                    timestamp,
  deliver_dt                timestamp,
  unit_price                varchar(255),
  quantity                  integer,
  item_source               varchar(255),
  note                      varchar(255),
  tracking_number           varchar(255),
  post_dt                   timestamp,
  users_email               varchar(255),
  constraint pk_orders primary key (id))
;

create table payment (
  id                        bigint not null,
  cc_name                   varchar(255),
  cc_number                 varchar(255),
  cc_address_1              varchar(255),
  cc_address_2              varchar(255),
  cc_city                   varchar(255),
  cc_state                  varchar(255),
  cc_zip_code               varchar(255),
  users_email               varchar(255),
  constraint pk_payment primary key (id))
;

create table users (
  email                     varchar(255) not null,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  address_1                 varchar(255),
  address_2                 varchar(255),
  city                      varchar(255),
  state                     varchar(255),
  zip_code                  varchar(255),
  cell_phone                varchar(255),
  home_phone                varchar(255),
  role                      varchar(255),
  constraint pk_users primary key (email))
;

create sequence orders_seq;

create sequence payment_seq;

create sequence users_seq;

alter table orders add constraint fk_orders_users_1 foreign key (users_email) references users (email) on delete restrict on update restrict;
create index ix_orders_users_1 on orders (users_email);
alter table payment add constraint fk_payment_users_2 foreign key (users_email) references users (email) on delete restrict on update restrict;
create index ix_payment_users_2 on payment (users_email);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists orders;

drop table if exists payment;

drop table if exists users;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists orders_seq;

drop sequence if exists payment_seq;

drop sequence if exists users_seq;

