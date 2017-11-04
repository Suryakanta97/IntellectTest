## Simple REST API with Spring Boot and MongoDB.
### Technology Stack:

* Maven, SLF4J, Logback, Lombok;
* Spring Boot, Spring Web;
* Spring Data MongoDB;
* MongoDB embedded database;
* Spring Security (as basic authentication).

#####To run this application use:

```bash
mvn spring-boot:run
```
Security Username :user;
         Password :user;
###  published API 
* Post:   localhost:8080/api/customer/Create ;
{"id":1,"fname":"Surya1","lname":"Sahoo","pincode":560100,"birthDate":"04-Nov-2017, Saturday","isActive":true,"email":"Surya@infosys.com"};
* Get :  localhost:8080/api/customer/{id} ;
* Get :  localhost:8080/api/customer/getall  -----get all;
* Delete :  localhost:8080/api/customer/Delete/{id}  -- delete BY Id;
* Delete :  localhost:8080/api/customer              -- delete All;

##  Note:
* the Auto increment of id is not implemented ;
*  the Upadte is not implemented as of Now ; 
