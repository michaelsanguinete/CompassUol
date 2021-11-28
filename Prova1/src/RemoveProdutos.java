import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveProdutos {

	public void remove() throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > 0");

		stm.execute();

	}

}
