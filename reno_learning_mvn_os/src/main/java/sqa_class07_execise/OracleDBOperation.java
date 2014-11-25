package sqa_class07_execise;
//Exercise 18: Write Interface DBOperations, 
//It declare 4 methods,  create, update, delete and read.
//Implementing classes are OracleDBOperation, OracleDBOperation 
//which implement the DBOperations interface. 
//Both these classes provides the implementation of all the 4 methods.
//Now create an abstract class SomeDBOperations implements interface and
//provides the implementation of create method and leave other 3 methods as abstract.  
//OracleDBOP.. and Oracle DB operation should not have the implementation for create 
//method.

public class OracleDBOperation implements IDBOperations{
	static String OracleDB = "oracle";
	private String connectionString;
	private String userName;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	private String passWord;
	
	public OracleDBOperation(String connectionString, String userName, String passWord){
		this.connectionString = connectionString;
		this.userName = userName;
		this.passWord = passWord;
		System.out.println("Oracle constructor called");
	}
	
//	@Override
	public int create(){
		System.out.println("Oracle connectted successfully with "+getConnectionString());
		System.out.println("Oracle connectted successfully with "+getUserName());
		System.out.println("Oracle connectted successfully with "+getPassWord());;
		return 0;
	}
	
//	@Override
	public int update(String sqlScript){
		System.out.println("Oracle records updated successfully with "+sqlScript);
		return 0;
	}
	
//	@Override
	public int delete(String sqlScript){
		System.out.println("Oracle records deleted successfully with "+sqlScript);
		return 0;
	}
	
//	@Override
	public String read(String sqlScript){
		System.out.println("Oracle records read successfully with "+sqlScript);
		return null;
	}
}
