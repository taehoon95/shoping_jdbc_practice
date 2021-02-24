use shopping;

desc customer;
desc product;
desc sale;

insert into customer 
     values ('12001','홍길동','19770405','010-9741-5821','남자'),
     	    ('12002','김연수','19850301','010-4568-5581','여자'),
     	    ('12003','김지원','19860708','010-9111-5556','여자');
     	
select * from customer;

insert into product 
     values ('PA','책상',10000),
     	    ('PB','냉장고',36000),
     	    ('PC','세탁기',22000);
     	    
select * from product;

insert into sale 
	 values ('2012.03.24','12003','PA',2),
	        ('2012.03.27','12001','PA',1),
	        ('2012.04.03','12003','PC',1);

select * from sale;

select date_format(date, "%Y.%m.%d") from sale; 
