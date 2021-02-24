-- �� ��Ű��
DROP SCHEMA IF EXISTS shopping;

-- �� ��Ű��
CREATE SCHEMA shopping;

-- ȸ��
CREATE TABLE shopping.customer (
	cusNo   CHAR(5)     NOT NULL COMMENT 'ȸ����ȣ', -- ȸ����ȣ
	cusName VARCHAR(20) NULL     COMMENT '�̸�', -- �̸�
	birth   CHAR(8)     NULL     COMMENT '�������', -- �������
	callNo  CHAR(13)    NULL     COMMENT '�޴���ȭ', -- �޴���ȭ
	gender  CHAR(2)     NULL     COMMENT '����' -- ����
)
COMMENT 'ȸ��';

-- ȸ��
ALTER TABLE shopping.customer
	ADD CONSTRAINT PK_customer -- ȸ�� �⺻Ű
		PRIMARY KEY (
			cusNo -- ȸ����ȣ
		);

-- ��ǰ����
CREATE TABLE shopping.Product (
	product  CHAR(2)     NOT NULL COMMENT '��ǰ�ڵ�', -- ��ǰ�ڵ�
	proName  VARCHAR(20) NULL     COMMENT '��ǰ��', -- ��ǰ��
	proPrice INT         NULL     COMMENT '�ܰ�' -- �ܰ�
)
COMMENT '��ǰ����';

-- ��ǰ����
ALTER TABLE shopping.Product
	ADD CONSTRAINT PK_Product -- ��ǰ���� �⺻Ű
		PRIMARY KEY (
			product -- ��ǰ�ڵ�
		);

-- �Ǹ� ����
CREATE TABLE shopping.sale (
	date     DATE    NULL     COMMENT '��¥', -- ��¥
	cusNo    CHAR(5) NOT NULL COMMENT 'ȸ����ȣ', -- ȸ����ȣ
	product  CHAR(2) NOT NULL COMMENT '��ǰ�ڵ�', -- ��ǰ�ڵ�
	saleRate INT     NULL     COMMENT '�Ǹż���' -- �Ǹż���
)
COMMENT '�Ǹ� ����';

-- �Ǹ� ����
ALTER TABLE shopping.sale
	ADD CONSTRAINT FK_customer_TO_sale -- ȸ�� -> �Ǹ� ����
		FOREIGN KEY (
			cusNo -- ȸ����ȣ
		)
		REFERENCES shopping.customer ( -- ȸ��
			cusNo -- ȸ����ȣ
		);

-- �Ǹ� ����
ALTER TABLE shopping.sale
	ADD CONSTRAINT FK_Product_TO_sale -- ��ǰ���� -> �Ǹ� ����
		FOREIGN KEY (
			product -- ��ǰ�ڵ�
		)
		REFERENCES shopping.Product ( -- ��ǰ����
			product -- ��ǰ�ڵ�
		);
		
grant all 
   on shopping.*
   to 'user_shopping'@'localhost'
identified by 'rootroot';

