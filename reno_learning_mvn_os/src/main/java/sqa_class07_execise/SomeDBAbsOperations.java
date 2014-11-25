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

public abstract class SomeDBAbsOperations implements IDBOperations{

	
//	@Override
	public int create(){
		System.out.println("Abstract DB records created successfully.");
		return 0;
	}

}
