create table user(
	email varchar(45) not null,
    firstaname varchar(15) not null,
    lastname varchar(15) not null,
    birth_day varchar(10) not null,
    city varchar(15) not null,
    photo blob,
    primary key(email));

create table friend(
	id_friend integer auto_increment,
    user varchar(45) not null,
    friend varchar(45) not null,
    primary key(id_friend),
    foreign key(user) references user(email),
    foreign key(friend) references user(email));
    
create table album(
	id_user varchar(45) not null,
    metatag varchar(45) not null,
    url varchar(45),
    primary key(id_user),
    foreign key(id_user) references user(email));