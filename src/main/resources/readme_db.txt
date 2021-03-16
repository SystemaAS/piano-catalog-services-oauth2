(1) By putting a file named: main/resources/data.sql Springboot will pick this upp automatically
(2) The db is just a memory db perfectly suitable for testing. The default user is sa and an empty password.
	If we want to change this we should expand the application.properties with:
	...
	spring.datasource.url=jdbc:h2:mem:testdb
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=password
	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
	...
	
(3) The reference is found in the build.gradle file: 
		... 
		runtimeOnly 'com.h2database:h2'
		...