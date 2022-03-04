# SpringDataJpa

#Description
This project is used to provide save data into database using springData-jpa.

#technology
Java,SpringBoot,Spring-data-jpa,H2,junit test

#ProjectManagemnt
Maveen

#Tools
STS

#VersionControl
Git

----------------------------------------------------------------------------------------------------------------------------------------------------

#Description about JPA

#What is JPA?

1) Spring Boot JPA is a Java specification for managing relational data in Java applications. 
2) It allows us to access and persist data between Java object/ class and relational database. 
3) JPA follows Object-Relation Mapping (ORM). It is a set of interfaces. 
4) It also provides a runtime EntityManager API for processing queries and transactions on the objects against the database. 
5) It uses a platform-independent object-oriented query language JPQL (Java Persistent Query Language).

====================================================================================================================================================================

#In the context of persistence, it covers three areas:

1) The Java Persistence API
2) Object-Relational metadata
3) The API itself, defined in the persistence package
4) JPA is not a framework. It defines a concept that can be implemented by any framework.



#Why should we use JPA?
1) JPA is simpler, cleaner, and less labor-intensive than JDBC, SQL, and hand-written mapping. 
2) JPA is suitable for non-performance oriented complex applications. 
3) The main advantage of JPA over JDBC is that, in JPA, data is represented by objects and classes while in JDBC data is represented by tables and records. 
4) It uses POJO to represent persistent data that simplifies database programming.
=====================================================================================================================================================================

#JPA	
1) JPA is a Java specification for mapping relation data in Java application.	
2) JPA does not provide any implementation classes.	
3) It uses platform-independent query language called JPQL (Java Persistence Query Language).
4) It is defined in javax.persistence package.	
5) It is implemented in various ORM tools like Hibernate, EclipseLink, etc.	
6) JPA uses EntityManager for handling the persistence of data.
===============================================================================================================================================================================
#Hibernate

1) Hibernate is an ORM framework that deals with data persistence.
2) It provides implementation classes.
3) It uses its own query language called HQL (Hibernate Query Language).
4) It is defined in org.hibernate package.
5) Hibernate is the provider of JPA.
6) In Hibernate uses Session for handling the persistence of data.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#JDBC: 
1) JDBC stands for Java Database Connectivity. It is a java application programming interface to provide a connection between the Java programming language and a wide range of databases (i.e), 
2) it establishes a link between the two so that a programmer could send data from Java code and store it in the database for future use.
=============================================================================================================================================================================================================

#Hibernate: 
1) Hibernate is an open-source, non-invasive, light-weight java ORM(Object-relational mapping) framework to develop objects which are independent of the database software and make independent persistence logic in all JAVA, JEE. 
2) It simplifies the interaction of java applications with databases. Hibernate is an implementation of JPA(Java Persistence API).

====================================================================================================================================================================================================================================================
#JDBC:

1) In JDBC, one needs to write code to map the object model’s data representation to the schema of the relational model.
2) JDBC enables developers to create queries and update data to a relational database using the Structured Query Language (SQL).
3) JDBC code needs to be written in a try catch block as it throws checked exception(SQLexception).
4) JDBC is database dependent i.e. one needs to write different codes for different database.
5) Creating associations between relations is quite hard in JDBC.

=========================================================================================================================================================================================================================================================
#Hibernate: 

1) Hibernate maps the object model’s data to the schema of the database itself with the help of annotations.
2) Hibernate uses HQL (Hibernate Query Language) which is similar to SQL but understands object-oriented concepts like inheritance, association etc.
3) Whereas Hibernate manages the exceptions itself by marking them as unchecked.
4) Whereas Hibernate is database independent and same code can work for many databases with minor changes.
5) Associations like one-to-one, one-to-many, many-to-one, and many-to-many can be acquired easily with the help of annotations.


============================================================================================================================================================================================================================================================