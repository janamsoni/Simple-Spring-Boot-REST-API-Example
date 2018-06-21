***********************************************
Simple Spring Boot REST API Example
***********************************************
This is Simple Spring Boot REST API Example with MYSQL JPA CrudRepository which can perform basic CRUD Operations


---------------------------------------------------------------------------------------------------
Update DATASOURCE Details In application.properties

/springbootrestapiexample/src/main/resources/application.properties
---------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------
CRUD OPERATION
---------------------------------------------------------------------------------------------------

POST (Add) Employee  
http://localhost:8080/company/employees/1


{"name":"ABC","designation":"Manager","expertise":"Management","createdAt":"2018-06-20T17:12:55.000+0000"}

GET All Employees 
http://localhost:8080/company/employees/

GET Employee by ID
http://localhost:8080/company/employees/1

DELETE Employee by ID
http://localhost:8080/company/employees/1

PUT (Update) Employee by ID
http://localhost:8080/company/employees/1

{"name":"ABC","designation":"HR","expertise":"Humen Resource Management","createdAt":"2018-06-20T17:12:55.000+0000"}
---------------------------------------------------------------------------------------------------
