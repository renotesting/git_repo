package sqa_class07_execise;

public class SqlServerDBOp extends SomeDBAbsOperations{

//	@Override
	public int update(String sqlScript) {
		System.out.println("sql server records updated successfully with "+sqlScript);
		return 0;
	}

//	@Override
	public int delete(String sqlScript) {
		System.out.println("sql server  records deleted successfully with "+sqlScript);
		return 0;
	}

//	@Override
	public String read(String sqlScript) {
		System.out.println("sql server records read successfully with "+sqlScript);
		return null;
	}

}
