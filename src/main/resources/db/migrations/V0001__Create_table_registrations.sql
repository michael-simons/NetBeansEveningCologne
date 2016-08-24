create table registrations (
    id                 serial primary key,
    email              varchar(1024) not null,    
    name               varchar(512) not null,
    CONSTRAINT registrations_uk UNIQUE (email)
);
