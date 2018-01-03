create table navigation(
  id int(11) not null PRIMARY KEY AUTO_INCREMENT,
  href VARCHAR(100),
  text VARCHAR(100),
  class VARCHAR(100),
  icon VARCHAR(255)
)ENGINE InnoDB;

insert into navigation values(null, './employees', 'Employees', "" , "");
insert into navigation values(null, './companies', 'Companys', "" , "");