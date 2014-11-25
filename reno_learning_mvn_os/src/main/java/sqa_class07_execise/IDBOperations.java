package sqa_class07_execise;

//Exercise 18: Write Interface DBOperations, 
//It declare 4 methods,  create, update, delete and read.
//Implementing classes are MySQLDBOperation, OracleDBOperation 
//which implement the DBOperations interface. 
//Both these classes provides the implementation of all the 4 methods.

//Now create an abstract class SomeDBOperations implements interface and
//provides the implementation of create method and leave other 3 methods as abstract.  
//MySQLDBOP.. and Oracle DB operation should not have the implementation for create 
//method.


public interface IDBOperations {
	// DB will response a integer for create, update and delete action in DB.
	int create();
	int update(String sqlScript);
	int delete(String sqlScript);
	String read(String sqlScript);

}
