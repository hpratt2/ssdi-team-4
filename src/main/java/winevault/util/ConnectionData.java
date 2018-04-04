package winevault.util;

public class ConnectionData implements IConnectionData {
	private static final String url = "jdbc:mysql://localhost/winevaultdb";
	private static final String user = "root";
	private static final String password = "password";
	
	@Override
	public String getURL() { return url; }
	
	@Override
	public String getUser() { return user; }
	
	@Override
	public String getPassword() { return password; }
}
