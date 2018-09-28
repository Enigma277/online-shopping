CREATE table category(

	id Identity,
	name varchar(50),
	description varchar(255),
	image_url varchar(50),
	is_active boolean,

	contraint pk_category_id PRIMARY KEY (id)
);
