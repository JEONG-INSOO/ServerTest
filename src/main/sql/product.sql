drop user c##servertest1 cascade;
--��������
CREATE USER c##servertest1 IDENTIFIED BY servertest1
    DEFAULT TABLESPACE users
    TEMPORARY TABLESPACE temp
    PROFILE DEFAULT;
--���Ѻο�
GRANT CONNECT, RESOURCE TO c##servertest1;
GRANT CREATE VIEW, CREATE SYNONYM TO c##servertest1;
GRANT UNLIMITED TABLESPACE TO c##servertest1;
--�� Ǯ��
ALTER USER c##servertest1 ACCOUNT UNLOCK;




drop table product;
create table product(
    product_id  number(10),
    pname       varchar(30),
    quantity    number(10),
    price       number(10)
);
--�⺻Ű
alter table product add constraint product_product_id_pk primary key(product_id);

--����������
drop sequence product_product_id_seq;
create sequence product_product_id_seq;


--����--
insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '��ǻ��', 1, 1000000);

insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '�����', 2, 200000);

insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '���콺', 3, 300000);

--��ȸ--
select product_id, pname, quantity, price
  from product
 where product_id = 2;

--����--
update product
   set pname = 'Ű����',
       quantity = 12,
       price = 1000000;

--����
delete from product where product_id = 1;

--��ü��ȸ-
select product_id,pname,quantity,price from product;

commit;