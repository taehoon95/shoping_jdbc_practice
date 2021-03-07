insert into customer values ('12004','�����','19800108','010-9111-5556','����');

select * from customer;

insert into sale values ('2012.02.05','12004','PB',3);

select user(),database();


-- 
select * from customer;
select cusNo,cusName,birth,callNo,gender from customer;
-- 
select * from product;

-- 
select * from sale;

-- Main ȭ�� ���� sql��
create view vw_main
as
select date_format(date, "%Y.%m.%d") as date 
	   ,c.cusNo,c.cusName,callNo,p.product,salerate,proPrice*salerate*1.1 as sale
  from sale s join product p on s.product = p.product join customer c on s.cusNo = c.cusNo
  order by date, c.cusNo desc;
 
select * from vw_main;
-- ��ǰ�� ��ȸ
create view vw_product
as
select c.cusNo,date_format(date, "%Y.%m.%d") as date 
	   ,p.product,p.proName,salerate,p.proPrice
	   ,p.proPrice*salerate*1.1 as sale
	   ,p.proPrice*salerate*1.1 - p.proPrice*saleRate as profit 
  from sale s join product p on s.product = p.product join customer c on s.cusNo = c.cusNo
  order by date, p.product;


drop view vw_product;
 
select date,product,proName,salerate,proPrice,sale,profit from vw_product;

-- �� ��ȸ 
create view vw_detail
as
select  date_format(date, "%Y.%m.%d") as date 
	   ,p.product,p.proName,c.cusName ,salerate,p.proPrice,c.cusno
	   ,p.proPrice*salerate*1.1 as sale
	   ,p.proPrice*salerate*1.1 - p.proPrice*saleRate as profit 
  from sale s join product p on s.product = p.product join customer c on s.cusNo = c.cusNo
  order by date, c.cusNo;
 
select * from vw_detail;
select cusno,date,product,proName,cusName,salerate,proPrice,sale,profit from vw_detail;

drop view vw_detail;

select * from sale;

select * from product;

-- �� �ֹ�����
select sum(saleRate) as totalOrderQuantity from sale; 

-- �� �Ǹž�
select sum(saleRate*proPrice*1.1) as sale from product p join sale s on p.product = s.product; 

-- �� ���ͱݾ�
select sum(p.proPrice*salerate*1.1 - p.proPrice*saleRate) as profit from product p join sale s on p.product = s.product; 

-- �� �ֹ� �Ǽ�
select count(saleRate) as saleRate from sale; 

