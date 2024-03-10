create database friends;

use friends;

-- backup database friends to disk = 'E:\Desktp\SQL' with differential;

select * from friends;

drop table friends;
create table friends(
	id int auto_increment not null primary key,
    -- auto increament does not increment the id value when rows are deleted in-between the row
    f_name varchar(50),
    age int,
    check (age>=19),
    address varchar(50),
    school varchar(50),
    college varchar(50),
    martial_status varchar(50)
);
insert into friends values (1,"surya", 21, "attur", "rasi", "mec", "single");
insert into friends values (2,"selva", 22, "attur", "rasi", "kec", "commited");
insert into friends values (3, "moha",21,"salem", "rasi", "mec","single");
insert into friends values (4, "karthi", 22,"malliakarai","rasi","kcet", "commited");
insert into friends values (5,"sibi",21,"attur","rasi","kce","single");
insert into friends values (6,"vimal",21,"attur","rasi","ias","single");
insert into friends values (7,"sakthi",22,"attur","rasi","ca","single");
insert into friends values (8,"chandru",22,"malai kaadu","rasi","sret","morattu single");

alter table friends add column degree varchar(50);
select distinct college from friends;

update friends set degree = "mba" where college="kcet";

-- update friends set degree = "engineer" where college = "mec";

-- update friends set degree = "engineer" where college = "kec";

-- update friends set degree = "engineer" where college = "kce"; 

UPDATE friends
SET degree = 'engineer'
WHERE college IN ('mec', 'kec', 'kce','sret'); -- where condition executed

update friends set degree = "ias" where college ="ias";
update friends set degree = "ca" where college ="ca";

select f_name from friends order by f_name desc; -- reverse order
select f_name from friends order by id desc; -- reverse order
select f_name from friends order by f_name asc; -- ascending order

select * from friends where degree = "engineer" and college = "mec"; -- and 
select * from friends where degree = "engineer" or college = "mec"; -- or

select f_name from friends where school = "rasi" and f_name like "s%";

select * from friends where not martial_status = "committed";

select f_name from friends where address is not null; -- retrieve not null values

select f_name from friends where address is null; -- null values

select * from friends limit 5;

-- AGGREGATE FUNCTIONS

-- select 
select min(age) from friends;

select max(age) from friends;

select min(age) from friends where college = "mec";

select max(age) from friends where degree = "engineer";

select degree as Tharkurukis_at from friends; 

select address as Area, age from friends where address = "attur" order by degree asc;

select count(*) from friends where age = 22;

select count(degree) from friends where age = 21;

select count(distinct degree) from friends;

select count(martial_status) from friends where martial_status = "single";

select sum(age) from friends;

select avg(age) from friends;

select avg(degree) from friends; -- reusult will be 0 when taking average for varchar

select f_name from friends where f_name like "m_ha";

select * from friends where college in ("mec", "kec","kce");

select f_name from friends where address in ("attur","salem");

select f_name from friends where age between 0 and 21;

-- ALIAS

select upper(f_name) as Friends_Name from friends; -- upper case


-- GETTING INTO JOINS CONCEPT

create table friends_job(
	id int not null auto_increment,
    f_name varchar(50),
    job_status varchar(20),
    job_location varchar(20),
    foreign key(id) references friends(id)
);

insert into friends_job values(1,"surya","selected","chennai");
insert into friends_job values(2,"selva","business","africa");
insert into friends_job values(3,"moha","pending","chennai");
insert into friends_job values(4,"karthi","not selected","none");
insert into friends_job values(5,"sibi","masters","coimbatore");
insert into friends_job values(6,"vimal","government","chennai");
insert into friends_job values(7,"sakthi","ca","coimbatore");
insert into friends_job values(8,"chandru","selected","coimbatore");

select friends.f_name,friends.age,friends_job.job_location, job_status 
from friends_job 
inner join friends on friends_job.id = friends.id; 

select friends_job.job_location, job_status 
from friends
left join friends_job on friends_job.id = friends.id; 

select * from friends_job;
select * from friends;