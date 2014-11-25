/**
 * 
 */
package sqa_class07_execise;

/**
 * @author renostudio
 *
 */
public class Execise18Dbcaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String connectionString, String userName, String passWord
		MySQLDBOperation mysql = new MySQLDBOperation("mysql_connection", "rliu", "dfsdfds");
		OracleDBOperation oracle = new OracleDBOperation("oracle_connection", "rliu", "dfsdfds");
		
		SqlServerDBOp sqlsrv = new SqlServerDBOp();
		
		mysql.create();
		oracle.create();
		oracle.update("update oracle");
		sqlsrv.create();
		sqlsrv.read("read sql server");
		
		

	}

}
