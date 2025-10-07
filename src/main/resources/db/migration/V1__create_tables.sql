create schema if not exists payment_service;

create table if not exists payments (
  id           bigserial primary key,
  amount       numeric(18,2) not null check (amount > 0),
  customer_id  varchar(64)   not null,
  status       varchar(20)   not null check (status in ('CREATED','AUTHORIZED','CAPTURED','FAILED')),
  created_at   timestamptz   not null default now(),
  updated_at   timestamptz   null
);

create index if not exists idx_payments_customer on payments (customer_id);
create index if not exists idx_payments_status   on payments (status);