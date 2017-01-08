# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table t_user (
  id                            bigint auto_increment not null,
  user_name                     varchar(255) not null,
  password                      varchar(255) not null,
  created_at                    timestamp not null,
  updated_at                    timestamp not null,
  constraint pk_t_user primary key (id)
);


# --- !Downs

drop table if exists t_user;

