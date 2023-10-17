drop user c##servertest1 cascade;
--계정생성
CREATE USER c##servertest1 IDENTIFIED BY servertest1
    DEFAULT TABLESPACE users
    TEMPORARY TABLESPACE temp
    PROFILE DEFAULT;
--권한부여
GRANT CONNECT, RESOURCE TO c##servertest1;
GRANT CREATE VIEW, CREATE SYNONYM TO c##servertest1;
GRANT UNLIMITED TABLESPACE TO c##servertest1;
--락 풀기
ALTER USER c##servertest1 ACCOUNT UNLOCK;




drop table product;
create table product(
    product_id  number(10),
    pname       varchar(30),
    quantity    number(10),
    price       number(10)
);
--기본키
alter table product add constraint product_product_id_pk primary key(product_id);

--시퀀스생성
drop sequence product_product_id_seq;
create sequence product_product_id_seq;


--생성--
insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '컴퓨터', 1, 1000000);

insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '모니터', 2, 200000);

insert into product(product_id,pname,quantity,price)
     values(product_product_id_seq.nextval, '마우스', 3, 300000);

--조회--
select product_id, pname, quantity, price
  from product
 where product_id = 2;

--수정--
update product
   set pname = '키보드',
       quantity = 12,
       price = 1000000;

--삭제
delete from product where product_id = 1;

--전체조회-
select product_id,pname,quantity,price from product;

commit;