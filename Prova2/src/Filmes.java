import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Filmes {

	public void cadastraFilmes(String nome, String descricao, int ano) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("INSERT INTO filmes (nome, descricao, ano) VALUES (?,?,?)");

		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setInt(3, ano);

		stm.execute();

	}

	public void excluiFilmes() throws SQLException { // Método para excluir todos os filmes ao final da execução, para
														// não gerar duplicidade quando o código for executado novamente

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("DELETE FROM filmes WHERE ID > 0");

		stm.execute();
	}

	public void filtraFilmes() throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite quantos filmes você deseja ver: ");
		int quantidade = scan.nextInt();
		System.out.print("Digite de qual página deseja filtrar? Pág 1 a 2: ");
		int pagina = scan.nextInt();

		if (pagina == 1) {

			PreparedStatement stm1 = connection
					.prepareStatement("select nome, descricao, ano FROM filmes ORDER BY id ASC LIMIT ? OFFSET 0");

			stm1.setInt(1, quantidade);

			stm1.execute();

			ResultSet rst1 = stm1.getResultSet();

			while (rst1.next()) {
				String nome = rst1.getString("nome");
				System.out.print(nome + " ");
				String descricao = rst1.getString("descricao");
				System.out.print(descricao + " ");
				int ano = rst1.getInt("ano");
				System.out.print(ano + " ");

				System.out.println();

			}
		}

		else if (pagina == 2) {

			PreparedStatement stm2 = connection
					.prepareStatement("select nome, descricao, ano FROM filmes ORDER BY id ASC LIMIT ? OFFSET 10");

			stm2.setInt(1, quantidade);

			stm2.execute();

			ResultSet rst2 = stm2.getResultSet();

			while (rst2.next()) {
				String nome = rst2.getString("nome");
				System.out.print(nome + " ");
				String descricao = rst2.getString("descricao");
				System.out.print(descricao + " ");
				int ano = rst2.getInt("ano");
				System.out.print(ano + " ");

				System.out.println();

			}

		}

		else {
			System.out.println("Nenhum filme encontrado nos parametros digitados!");
		}
		scan.close();
	}

}
