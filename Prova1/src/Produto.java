import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private int quantidade;
	private double preco;

	ConnectionFactory connectionFactory = null;
	Connection connection = null;

	public void cadastra(String nome, String descricao, int quantidade, double preco) throws SQLException {

		connectionFactory = new ConnectionFactory();
		connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection
				.prepareStatement("INSERT INTO PRODUTO (nome, descricao, quantidade, preco) VALUES (?,?,?,?)");

		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setInt(3, quantidade);
		stm.setDouble(4, preco);

		stm.execute();

	}

	public void altera(String nome, String descricao, int quantidade, double preco) throws SQLException {

		connectionFactory = new ConnectionFactory();
		connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement(
				"UPDATE PRODUTO SET nome = ?, descricao = ?, quantidade = ?, preco = ?  WHERE id = (select id from (select id FROM PRODUTO ORDER BY ID ASC LIMIT 1)x);");

		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setInt(3, quantidade);
		stm.setDouble(4, preco);

		stm.execute();

	}

	public void remove() throws SQLException {

		connectionFactory = new ConnectionFactory();
		connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement(
				"DELETE FROM PRODUTO WHERE id = (select id from (select id FROM PRODUTO ORDER BY ID ASC LIMIT 1 OFFSET 1)x)");

		stm.execute();

	}

}
