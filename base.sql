drop table Tarea;
drop table Proyecto;
create table Proyecto (cveProyecto varchar(10) not null, nombre varchar(150), primary key (cveProyecto));
comment on column Proyecto.nombre is 'Es el nombre con el que se identifica al proyecto';
create table Tarea (cveProyecto varchar(10) not null, nombre varchar(200), duracion int4, predecesor int4, avance int4, fechaInicio timestamp);
alter table Tarea add constraint FKTarea234388 foreign key (cveProyecto) references Proyecto;