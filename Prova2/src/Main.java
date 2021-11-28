import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Filmes cnema = new Filmes();
		
		cnema.cadastraFilmes("Upgrade", "Fic��o Cient�fica", 2018);
		cnema.cadastraFilmes("Tenet", "Fic��o Cient�fica", 2020);
		cnema.cadastraFilmes("Ad Astra - Rumo �s estrelas", "Fic��o Cient�fica" , 2019);
		cnema.cadastraFilmes("Blade Runner 2049", "Fic��o Cient�fica" , 2017);
		cnema.cadastraFilmes("A chegada" , "Fic��o Cient�fica" , 2016);
		cnema.cadastraFilmes("Aniquila��o" , "Fic��o Cient�fica" , 2018);
		cnema.cadastraFilmes("Desculpe te incomodar" , "Fic��o Cient�fica" , 2018);
		cnema.cadastraFilmes("Interstellar" , "Fic��o Cient�fica" , 2014);
		cnema.cadastraFilmes("Paprika" , "Fic��o Cient�fica" , 2006);
		cnema.cadastraFilmes("Ex Machina", "Fic��o Cient�fica" , 2014);
		cnema.cadastraFilmes("Filhos da esperan�a" , "Fic��o Cient�fica" , 2006);
		cnema.cadastraFilmes("A origem" , "Fic��o Cient�fica" , 2010);
		cnema.cadastraFilmes("Mad Max: Estrada da f�ria" , "Fic��o Cient�fica" , 2015);
		cnema.cadastraFilmes("Bilho eterno de uma mente sem lembran�as" , "Fic��o Cient�fica" , 2004);
		cnema.cadastraFilmes("Distrito 9" , "Fic��o Cient�fica" , 2009);
		cnema.cadastraFilmes("Ela" , "Fic��o Cient�fica" , 2013);
		cnema.cadastraFilmes("Minority Report - A nova lei", "Fic��o Cient�fica" , 2002);
		cnema.cadastraFilmes("A.I:. Intelig�ncia artificial" , "Fic��o Cient�fica" , 2001);
		cnema.cadastraFilmes("Donnie Darko", "Fic��o Cient�fica" , 2001);
		cnema.cadastraFilmes("Laranja mec�nica" , "Fic��o Cient�fica" , 1971);
		
		PreparedStatement stm = connection
				.prepareStatement("SELECT id, nome, descricao, ano from filmes");

		stm.execute();

		ResultSet rst = stm.getResultSet();
		

		while (rst.next()) {
			int id = rst.getInt("id");
			System.out.print(id + " ");
			String nome = rst.getString("nome");
			System.out.print(nome + " ");
			String descricao = rst.getString("descricao");
			System.out.print(descricao + " ");
			int ano = rst.getInt("ano");
			System.out.print(ano + " ");

			System.out.println();

		}
		
		cnema.excluiFilmes();

		scan.close();
		

	}

}
