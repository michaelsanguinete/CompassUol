import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Filmes {
	
	private int id;
	private String nome;
	private String descricao;
	private int ano;
	
	public void cadastraFilmes(String nome, String descricao, int ano) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection
				.prepareStatement("INSERT INTO filmes (nome, descricao, ano) VALUES (?,?,?)");

		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setInt(3, ano);
		
		stm.execute();
		
	}
	
	public void excluiFilmes() throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM filmes WHERE ID > 0");
		
		stm.execute();
	}

}
