drop table PG560_SEARCH;

create table PG560_SEARCH(
	id integer generated by default as identity primary key,
	technology varchar(80) not null, 
	jsr varchar(20) not null,
	url varchar(100) not null,
	acrynom varchar(20) not null,
	version varchar(20) not null,
	description varchar(300) not null
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java API for RESTful Web Services', 
	'311', 
	'http://jcp.org/en/jsr/detail?id=311',
	'JAX-RS',
	'1.1',
	'This JSR will develop an API for providing support for RESTful(Representational State Transfer) Web Services in the Java Platform.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Implementing Enterprise Web Services', 
	'109', 
	'http://jcp.org/en/jsr/detail?id=109',
	'JSR',
	'1.3',
	'This specification defines the programming model and runtime architecture for implementing web services in Java. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java API for XML-Based Web Services', 
	'224', 
	'http://jax-ws.java.net/',
	'JAX-WS',
	'2.2',
	'Welcome to the JAX-WS Reference Implementation (RI) Project. This project provides the core of Metro project, inside GlassFish community.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Architecture for XML Binding', 
	'222', 
	'http://jaxb.java.net/',
	'JAXB',
	'2.2',
	'The goal of the JAXB project is to develop and evolve the code base for the Reference Implementation (RI) of JAXB, the Java Architecture for XML Binding. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Web Services Metadata for the Java Platform', 
	'181', 
	'http://jcp.org/en/jsr/detail?id=181',
	'JSR',
	'2.7',
	'This JSR defines an annotated JavaTM format that that uses JavaTM Language Metadata (JSR 175) to enable easy definition of Java Web Services in a J2EE container. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java API for XML-Based RPC', 
	'101', 
	'http://java.net/projects/jax-rpc/',
	'JAX-RPC',
	'1.1',
	'The Standard Implementation for JAX-RPC is a subproject of Metro - Webservice toolkit, was started in November 2010 and has 284 members.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java APIs for XML Messaging', 
	'67', 
	'http://jcp.org/en/jsr/detail?id=67',
	'JAXM',
	'1.3',
	'JAXM provides an API for packaging and transporting business transactions using on-the-wire protocols being defined by ebXML.org, Oasis, W3C and IETF. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java API for XML Registries', 
	'93', 
	'http://jcp.org/en/jsr/detail?id=93',
	'JAXR',
	'1.0',
	'JAXR provides an API for a set of distributed Registry Services that enables business-to-business integration between business enterprises, using the protocols being defined by ebXML.org, Oasis, ISO 11179. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Servlet', 
	'315', 
	'http://www.oracle.com/technetwork/java/index-jsp-135475.html',
	'JSP',
	'3.0',
	'Java Servlet technology provides Web developers with a simple, consistent mechanism for extending the functionality of a Web server and for accessing existing business systems.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'JavaServer Faces', 
	'314', 
	'http://www.oracle.com/technetwork/java/javaee/javaserverfaces-139869.html',
	'JSF',
	'2.0',
	'Developed through the Java Community Process under JSR - 314, JavaServer Faces technology establishes the standard for building server-side user interfaces.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'JavaServer Pages / Expression Language', 
	'245', 
	'http://www.oracle.com/technetwork/java/jsp-138432.html',
	'JSP',
	'2.2',
	'JavaServer Pages (JSP) technology provides a simplified, fast way to create dynamic web content. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Standard Tag Library for JavaServer Pages', 
	'52', 
	'http://www.oracle.com/technetwork/java/jstl-137486.html',
	'JSTL',
	'1.2',
	'The JavaServer Pages Standard Tag Library (JSTL) encapsulates as simple tags the core functionality common to many Web applications.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Debugging Support for Other Languages', 
	'45', 
	'http://jcp.org/en/jsr/detail?id=45',
	'JCP',
	'2.1',
	'This specification establishes standardized tools for correlating JavaTM virtual machine byte code to source code of languages other than the JavaTM programming language. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Contexts and Dependency Injection for Java', 
	'299', 
	'http://jcp.org/en/jsr/detail?id=299',
	'JSF',
	'2.7',
	'The purpose of this specification is to unify the JSF managed bean component model with the EJB component model, resulting in a significantly simplified programming model for web-based applications. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Dependency Injection for Java 1.0', 
	'330', 
	'http://jcp.org/en/jsr/detail?id=330',
	'JSR',
	'2.7',
	'We propose to maximize reusability, testability and maintainability of Java code by standardizing an extensible dependency injection API. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Bean Validation 1.0', 
	'303', 
	'http://www.oracle.com/technetwork/java/javaee/ejb-141389.html',
	'EJB',
	'3.1',
	'Enterprise JavaBeans (EJB) technology is the server-side component architecture for Java Platform, Enterprise Edition (Java EE).'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java EE Connector Architecture 1.6', 
	'322', 
	'http://jcp.org/en/jsr/detail?id=322',
	'JSR',
	'2.7',
	'The Java EE Connector Architecture 1.5 defines a standard architecture for connecting to Enterprise Information Systems. This JSR will enhance the existing specification with features requested by experts and community. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Persistence 2.0', 
	'317', 
	'http://www.jcp.org/en/jsr/detail?id=317',
	'JCP',
	'2.7',
	'The Java Persistence API is the Java API for the management of persistence and object/relational mapping for Java EE and Java SE environments. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Common Annotations for the Java Platform', 
	'250', 
	'http://jcp.org/en/jsr/detail?id=250',
	'JSR',
	'2.7',
	'This JSR will develop annotations for common semantic concepts in the J2SE and J2EE platforms that apply across a variety of individual technologies. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Message Service API 1.1', 
	'914', 
	'http://www.oracle.com/technetwork/java/jms-136181.html',
	'JMS',
	'4.3',
	'The Java Message Service (JMS) API is a messaging standard that allows application components based on the Java 2 Platform, Enterprise Edition (J2EE) to create, send, receive, and read messages.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Transaction API (JTA) 1.1', 
	'907', 
	'http://www.oracle.com/technetwork/java/javaee/tech/jta-138684.html',
	'JTA',
	'1.1',
	'Java Transaction API (JTA) specifies standard Java interfaces between a transaction manager and the parties involved in a distributed transaction system: the resource manager, the application server, and the transactional applications. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'JavaMail 1.4', 
	'919', 
	'http://www.oracle.com/technetwork/java/javamail/javamail-138606.html',
	'JAF',
	'1.4.5',
	'The JavaMail API provides a platform-independent and protocol-independent framework to build mail and messaging applications.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Authentication Service', 
	'196', 
	'http://jcp.org/en/jsr/detail?id=196',
	'JSR',
	'2.7',
	'This JSR seeks to define a standard interface by which authentication modules may be integrated with containers and such that these modules may establish the authentication identities used by containers. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Authorization Contract for Containers', 
	'115', 
	'http://jcp.org/en/jsr/detail?id=115',
	'JSR',
	'2.7',
	'This JSR seeks to define a contract between containers and authorization service providers that will result in the implementation of providers for use by containers. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java EE Application Deployment', 
	'88', 
	'http://jcp.org/en/jsr/detail?id=88',
	'J2EE',
	'2.6',
	'This specification provides a complete description of the APIs required by the J2EE platform to enable development of platform-independent deployment tools. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'J2EE Management 1.1', 
	'77', 
	'http://jcp.org/en/jsr/detail?id=77',
	'J2EE',
	'2.6',
	'The JavaTM 2 Platform, Enterprise Edition Management Specification will provide server vendors and tool vendors with a standard model for managing the J2EE Platform. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Database Connectivity 4.0', 
	'221', 
	'http://jcp.org/en/jsr/detail?id=221',
	'JCP',
	'2.7',
	'This specification seeks to improve Java application access to SQL data stores by the provision of ease-of-development focused features and improvements at both the utility and API level. '
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Java Management Extensions', 
	'255', 
	'http://www.oracle.com/technetwork/java/javase/tech/javamanagement-140525.html',
	'JMX',
	'5.0',
	'The JMX technology provides the tools for building distributed, Web-based, modular and dynamic solutions for managing and monitoring devices, applications, and service-driven networks.'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'JavaBeans Activation Framework', 
	'925', 
	'http://www.oracle.com/technetwork/java/javase/jaf-135115.html',
	'JAF',
	'1.1.1',
	'JavaBeans Activation Framework (JAF) is a standard extension to the Java platform that lets you take advantage of standard services to..'
);

insert into PG560_SEARCH(technology, jsr, url, acrynom, version, description) values(
	'Streaming API for XML', 
	'173', 
	'http://jcp.org/en/jsr/detail?id=173',
	'StAX',
	'2.1',
	'The Streaming API for XML (StAX) is a Java based API for pull-parsing XML. '
);