This is the Powershell interaction that worked for my computer. After doing this, I added some customers to the database via PowerShell and also added from Postman. 

Don't forget to run "main.java"!





Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\Users\jackc> OneDrive\Desktop
OneDrive\Desktop : The module 'OneDrive' could not be loaded. For more
information, run 'Import-Module OneDrive'.
At line:1 char:1
+ OneDrive\Desktop
+ ~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (OneDrive\Desktop:String) []
   , CommandNotFoundException
    + FullyQualifiedErrorId : CouldNotAutoLoadModule

PS C:\Users\jackc> cd OneDrive\Desktop
PS C:\Users\jackc\OneDrive\Desktop> cd Eclipse
PS C:\Users\jackc\OneDrive\Desktop\Eclipse> cd spring-boot-example
PS C:\Users\jackc\OneDrive\Desktop\Eclipse\spring-boot-example> docker compose up -d
[+] Running 1/0
 ✔ Container postgres  Running                                         0.0s
PS C:\Users\jackc\OneDrive\Desktop\Eclipse\spring-boot-example> docker ps
CONTAINER ID   IMAGE      COMMAND                  CREATED        STATUS          PORTS                    NAMES
01074ec3f7b9   postgres   "docker-entrypoint.s…"   2 months ago   Up 13 minutes   0.0.0.0:5332->5432/tcp   postgres
PS C:\Users\jackc\OneDrive\Desktop\Eclipse\spring-boot-example> docker exec -it postgres bash
root@01074ec3f7b9:/# psql -U jack
psql (16.2 (Debian 16.2-1.pgdg120+2))
Type "help" for help.

jack=# CREATE DATABASE customer;
ERROR:  database "customer" already exists
jack=# \d customer
Did not find any relation named "customer".
jack=# psql -U jack -d customer
jack-# \dt
Did not find any relations.
jack-# INSERT INTO customer(id, name, email, age)
jack-# VALUES (nextval('customer_id_sequence'),'Alex','alex@gmail.com', 22);
ERROR:  syntax error at or near "psql"
LINE 1: psql -U jack -d customer
        ^
jack=# select * from customer;
ERROR:  relation "customer" does not exist
LINE 1: select * from customer;
                      ^
jack=# \d
Did not find any relations.
jack=# \dt
Did not find any relations.
jack=# \c customer
You are now connected to database "customer" as user "jack".
customer=# \d
                List of relations
 Schema |         Name         |   Type   | Owner
--------+----------------------+----------+-------
 public | customer             | table    | jack
 public | customer_id_sequence | sequence | jack
(2 rows)

customer=# \d customer
                     Table "public.customer"
 Column |          Type          | Collation | Nullable | Default
--------+------------------------+-----------+----------+---------
 age    | integer                |           |          |
 id     | integer                |           | not null |
 email  | character varying(255) |           |          |
 name   | character varying(255) |           |          |
Indexes:
    "customer_pkey" PRIMARY KEY, btree (id)

customer=# INSERT INTO customer(id, name, email, age)
customer-# VALUES (nextval('customer_id_sequence'), 'Alex', 'alex@gmail.com'
, 22);
INSERT 0 1
customer=# VALUES (nextval('customer_id_sequence'), 'Alex', 'alex@gmail.com', 22);
 column1 | column2 |    column3     | column4
---------+---------+----------------+---------
       2 | Alex    | alex@gmail.com |      22
(1 row)

customer=# VALUES (nextval('customer_id_sequence'), 'Alex', 'alex@gmail.com', 22);
 column1 | column2 |    column3     | column4
---------+---------+----------------+---------
       3 | Alex    | alex@gmail.com |      22
(1 row)

customer=# select * from customer
customer-# select * from customer
customer-# select * from customer
customer-#
\q
root@01074ec3f7b9:/# psql -U jack
psql (16.2 (Debian 16.2-1.pgdg120+2))
Type "help" for help.

jack=# \c customer
You are now connected to database "customer" as user "jack".
customer=# \d
                List of relations
 Schema |         Name         |   Type   | Owner
--------+----------------------+----------+-------
 public | customer             | table    | jack
 public | customer_id_sequence | sequence | jack
(2 rows)

customer=# Select * from customer
customer-# select * from customer;
ERROR:  syntax error at or near "select"
LINE 2: select * from customer;
        ^
customer=# select * from customer;
 age  | id |        email         |    name
------+----+----------------------+------------
   22 |  1 | alex@gmail.com       | Alex
  134 |  4 | jamiliasa@gmail.com  | Jamiliasa
 1345 |  5 | jamiliasan@gmail.com | Jamiliasan
(3 rows)

customer=#