CREATE table category(

	id Identity,
	name varchar(50),
	description varchar(255),
	image_url varchar(50),
	is_active boolean,

	constraint pk_category_id PRIMARY KEY (id)
);
insert into category (name, description, image_url,is_active)
values(
'windows',
' bla bla window',
'www.windows.com',
true
);