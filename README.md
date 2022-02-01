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

What is JPA?
Spring Boot JPA is a Java specification for managing relational data in Java applications. 
It allows us to access and persist data between Java object/ class and relational database. 
JPA follows Object-Relation Mapping (ORM). It is a set of interfaces. 
It also provides a runtime EntityManager API for processing queries and transactions on the objects against the database. 
It uses a platform-independent object-oriented query language JPQL (Java Persistent Query Language).


In the context of persistence, it covers three areas:

The Java Persistence API
Object-Relational metadata
The API itself, defined in the persistence package
JPA is not a framework. It defines a concept that can be implemented by any framework.



Why should we use JPA?
JPA is simpler, cleaner, and less labor-intensive than JDBC, SQL, and hand-written mapping. 
JPA is suitable for non-performance oriented complex applications. 
The main advantage of JPA over JDBC is that, in JPA, data is represented by objects and classes while in JDBC data is represented by tables and records. 
It uses POJO to represent persistent data that simplifies database programming.


JPA	
JPA is a Java specification for mapping relation data in Java application.	
JPA does not provide any implementation classes.	
It uses platform-independent query language called JPQL (Java Persistence Query Language).
It is defined in javax.persistence package.	
It is implemented in various ORM tools like Hibernate, EclipseLink, etc.	
JPA uses EntityManager for handling the persistence of data.

Hibernate

Hibernate is an ORM framework that deals with data persistence.
It provides implementation classes.
It uses its own query language called HQL (Hibernate Query Language).
It is defined in org.hibernate package.
Hibernate is the provider of JPA.
In Hibernate uses Session for handling the persistence of data.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
JDBC: JDBC stands for Java Database Connectivity. It is a java application programming interface to provide a connection between the Java programming language and a wide range of databases (i.e), 
it establishes a link between the two so that a programmer could send data from Java code and store it in the database for future use.
=============================================================================================================================================================================================================