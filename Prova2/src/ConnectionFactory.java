import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/prova2?useTimezone=true&serverTimezone=UTC", "root", "97060590");
	}
	
	

}
