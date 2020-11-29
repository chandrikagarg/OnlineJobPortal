create table USER_ACCOUNT (
ID number(20) primary key,
EMAIL varchar(255),
PASSWORD varchar(100),
DATE_OF_BIRTH date,
GENDER char(1),
IS_ACTIVE char(1),
CONTACT_NUMBER number(10),
REGISTRATION_DATE date
)



create table USER_LOG (
USER_ACCOUNT_ID not null primary key,
LAST_LOGIN_DATE date,
foreign key (USER_ACCOUNT_ID) references USER_ACCOUNT(ID)
)

create table COMPANY (
ID number primary key,
COMPANY_NAME varchar(100),
PROFILE_DESCRIPTION varchar(100),
ESTABLISHMENT_DATE date,
COMPANY_WEBSITE varchar(500))



create table JOB_TYPE (
ID number primary key,
JOB_TYPE varchar(20))

create table JOB_LOCATION (
ID number primary key,
STREET_ADRESS varchar(100),
CITY varchar(50),
STATE varchar(50),
COUNTRY varchar(50),
ZIP varchar(50))




create table SKILL_SET(
id NUMBER primary key,
SKILL_SET_NAME varchar(50))

create table JOB_POST (
ID number AUTO_INCREMENT primary key,
POSTED_BY_ID number,
JOB_TYPE_ID number,
COMPANY_ID number,
IS_COMPANY_NAME_HIDDEN char(1),
CREATED_DATE date,
JOB_DESCRIPTION varchar(500),
JOB_LOCATION_ID number,
IS_ACTIVE char(1),
foreign key (POSTED_BY_ID) references USER_ACCOUNT(ID),
foreign key (JOB_TYPE_ID) references JOB_TYPE(ID),
foreign key (COMPANY_ID) references COMPANY(ID),
foreign key (JOB_LOCATION_ID) references JOB_LOCATION(ID)
)



create table JOB_POST_SKILL_SET(
SKILL_SET_ID NUMBER,
JOB_POST_ID NUMBER,
SKILL_LEVEL NUMBER,
foreign key (SKILL_SET_ID) references SKILL_SET(ID),
foreign key (JOB_POST_ID) references JOB_POST(ID))

INSERT INTO JOB_POST VALUES (1,1,1,1,'Y',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),'sports company',1,'Y');
select * from JOB_POST

INSERT INTO JOB_POST_SKILL_SET VALUES(1,1,1)
select * from JOB_POST_SKILL_SET

INSERT INTO SKILL_SET VALUES (1,'JAVA');
select * from SKILL_SET;

INSERT INTO JOB_TYPE VALUES (1,'Permanent');
select * from JOB_TYPE;

INSERT INTO USER_ACCOUNT VALUES(1,'chandrika@gmail.com','test',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),'F','Y',9958432212,TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));
select * from USER_ACCOUNT

INSERT INTO USER_LOG VALUES(1,TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));
select * from USER_LOG;

INSERT INTO COMPANY VALUES (1,'Stats','Sports Company',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),'stats');
select * from COMPANY;

INSERT INTO JOB_LOCATION VALUES(1,'banglore','banglore','banglore','India','560095');
select * from JOB_LOCATION

CREATE UNIQUE INDEX unique_job_post_idx
ON JOB_POST (JOB_TYPE_ID,COMPANY_ID);