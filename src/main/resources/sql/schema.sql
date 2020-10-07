create table product 
{
	 product_id int,       
     product_name varchar(255),  
     color_id int,         
     size int,
     measurement_unit_id int
};


create table measurement_unit
{
	measurement_unit_id int, 
	measurement_unit_name varchar(50)
}

create table color
{
	color_id int, 
	color_name varchar(50)
}

create table supplier
{
	supplier_id int, 
	supplier_name varchar(50)
}

create table seller
{
	seller_id int, 
	seller_name varchar(50)
}

create table product_supplier
{
	product_supplier_id int, 
	product_id int, 
	supplier_id int
}

create table product_seller
{
	product_seller_id int, 
	product_id int, 
	seller_id int 
}


