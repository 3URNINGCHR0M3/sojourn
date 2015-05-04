create sequence sq_artist
    as int
     start with 1000
     increment by 1;

create table artist (
    artist_id int not null,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    stage_name varchar(50)
);