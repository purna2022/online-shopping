CREATE TABLE CATAGORY
(
	id identity,
	name varchar(50),
	description varchar(300),
	image_URL varchar(100),
	is_active boolean,
	constraint pk_catagory_id primary key (id)
);

insert into catagory (name, description, image_url, is_active) values ('Mobile', 'This is some mobile description', 'CAT_3.png', true );