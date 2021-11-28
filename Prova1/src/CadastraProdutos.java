import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastraProdutos {

	public void cadastra(String nome, String descricao, int quantidade, double preco) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection
				.prepareStatement("INSERT INTO PRODUTO (nome, descricao, quantidade, preco) VALUES (?,?,?,?)");

		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setInt(3, quantidade);
		stm.setDouble(4, preco);
		
		stm.execute();

	}

}