-- 내 스키마
DROP SCHEMA IF EXISTS shopping;

-- 내 스키마
CREATE SCHEMA shopping;

-- 회원
CREATE TABLE shopping.customer (
	cusNo   CHAR(5)     NOT NULL COMMENT '회원번호', -- 회원번호
	cusName VARCHAR(20) NULL     COMMENT '이름', -- 이름
	birth   CHAR(8)     NULL     COMMENT '생년월일', -- 생년월일
	callNo  CHAR(13)    NULL     COMMENT '휴대전화', -- 휴대전화
	gender  CHAR(2)     NULL     COMMENT '성별' -- 성별
)
COMMENT '회원';

-- 회원
ALTER TABLE shopping.customer
	ADD CONSTRAINT PK_customer -- 회원 기본키
		PRIMARY KEY (
			cusNo -- 회원번호
		);

-- 제품정보
CREATE TABLE shopping.Product (
	product  CHAR(2)     NOT NULL COMMENT '제품코드', -- 제품코드
	proName  VARCHAR(20) NULL     COMMENT '제품명', -- 제품명
	proPrice INT         NULL     COMMENT '단가' -- 단가
)
COMMENT '제품정보';

-- 제품정보
ALTER TABLE shopping.Product
	ADD CONSTRAINT PK_Product -- 제품정보 기본키
		PRIMARY KEY (
			product -- 제품코드
		);

-- 판매 내역
CREATE TABLE shopping.sale (
	date     DATE    NULL     COMMENT '날짜', -- 날짜
	cusNo    CHAR(5) NOT NULL COMMENT '회원번호', -- 회원번호
	product  CHAR(2) NOT NULL COMMENT '제품코드', -- 제품코드
	saleRate INT     NULL     COMMENT '판매수량' -- 판매수량
)
COMMENT '판매 내역';

-- 판매 내역
ALTER TABLE shopping.sale
	ADD CONSTRAINT FK_customer_TO_sale -- 회원 -> 판매 내역
		FOREIGN KEY (
			cusNo -- 회원번호
		)
		REFERENCES shopping.customer ( -- 회원
			cusNo -- 회원번호
		);

-- 판매 내역
ALTER TABLE shopping.sale
	ADD CONSTRAINT FK_Product_TO_sale -- 제품정보 -> 판매 내역
		FOREIGN KEY (
			product -- 제품코드
		)
		REFERENCES shopping.Product ( -- 제품정보
			product -- 제품코드
		);
		
grant all 
   on shopping.*
   to 'user_shopping'@'localhost'
identified by 'rootroot';

