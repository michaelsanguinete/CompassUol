import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		  
		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		int opcao;

		do {

			System.out.println("1 - Cadastrar produtos na base");
			System.out.println("2 - Atualizar produto");
			System.out.println("3 - Excluir produto");
			System.out.println("0 - Encerrar aplicação");
			System.out.print("Escolha uma opção: ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				produto.cadastra("Miojo", "Turma da Mônica", 10, 1.50);
				produto.cadastra("Betoneira", "400 litros", 5, 3800.00);
				produto.cadastra("Detergente", "Ypê", 20, 2.30);
				System.out.println("Os três produtos foram inseridos.");
				break;

			case 2:

				produto.altera("Celular", "POCO F3", 1, 2080.48);
				System.out.println("Produto 1 atualizado.");
				break;

			case 3:
				
				produto.remove();
				System.out.println("Produto 2 removido.");
				break;
				
			default:
				System.out.println("Opção inválida. Por favor escolha uma opção da lista.");
				break;
			}
			
		
		} while (opcao !=0);

		PreparedStatement stm = connection
				.prepareStatement("SELECT id, nome, descricao, quantidade, preco from produto");

		stm.execute();

		ResultSet rst = stm.getResultSet();
		
		System.out.println("Produtos cadastrados:");
		while (rst.next()) {
			int id = rst.getInt("id");
			System.out.print(id + " ");
			String nome = rst.getString("nome");
			System.out.print(nome + " ");
			String descricao = rst.getString("descricao");
			System.out.print(descricao + " ");
			int quantidade = rst.getInt("quantidade");
			System.out.print(quantidade + " ");
			double preco = rst.getDouble("preco");
			System.out.print("R$ " + preco);

			System.out.println();

		}

		scan.close();
	}
}
