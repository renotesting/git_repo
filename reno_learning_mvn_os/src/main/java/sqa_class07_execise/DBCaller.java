package sqa_class07_execise;
//Exercise 18: Write Interface DBOperations, 
//It declare 4 methods,  create, update, delete and read.
//Implementing classes are MySQLDBOperation, OracleDBOperation 
//which implement the DBOperations interface. 
//Both these classes provides the implementation of all the 4 methods.

//Now create an abstract class SomeDBOperations implements interface and
//provides the implementation of create method and leave other 3 methods as abstract.  
//MySQLDBOP.. and Oracle DB operation should not have the implementation for create 
//method

public class DBCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLDBOperation mysql = new MySQLDBOperation("MySql DB connection", "rliu", "2324324");
		OracleDBOperation oracle = new OracleDBOperation("Oracle DB connection", "rliu", "2324324");
		
		mysql.create();
		mysql.read("select XXX from bbb where ccc = 45");
		
		oracle.create();
		oracle.read("select XXX from bbb where ccc = 45");

	}

}
