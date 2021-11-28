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
		
		cnema.cadastraFilmes("Upgrade", "Ficção Científica", 2018);
		cnema.cadastraFilmes("Tenet", "Ficção Científica", 2020);
		cnema.cadastraFilmes("Ad Astra - Rumo às estrelas", "Ficção Científica" , 2019);
		cnema.cadastraFilmes("Blade Runner 2049", "Ficção Científica" , 2017);
		cnema.cadastraFilmes("A chegada" , "Ficção Científica" , 2016);
		cnema.cadastraFilmes("Aniquilação" , "Ficção Científica" , 2018);
		cnema.cadastraFilmes("Desculpe te incomodar" , "Ficção Científica" , 2018);
		cnema.cadastraFilmes("Interstellar" , "Ficção Científica" , 2014);
		cnema.cadastraFilmes("Paprika" , "Ficção Científica" , 2006);
		cnema.cadastraFilmes("Ex Machina", "Ficção Científica" , 2014);
		cnema.cadastraFilmes("Filhos da esperança" , "Ficção Científica" , 2006);
		cnema.cadastraFilmes("A origem" , "Ficção Científica" , 2010);
		cnema.cadastraFilmes("Mad Max: Estrada da fúria" , "Ficção Científica" , 2015);
		cnema.cadastraFilmes("Bilho eterno de uma mente sem lembranças" , "Ficção Científica" , 2004);
		cnema.cadastraFilmes("Distrito 9" , "Ficção Científica" , 2009);
		cnema.cadastraFilmes("Ela" , "Ficção Científica" , 2013);
		cnema.cadastraFilmes("Minority Report - A nova lei", "Ficção Científica" , 2002);
		cnema.cadastraFilmes("A.I:. Inteligência artificial" , "Ficção Científica" , 2001);
		cnema.cadastraFilmes("Donnie Darko", "Ficção Científica" , 2001);
		cnema.cadastraFilmes("Laranja mecânica" , "Ficção Científica" , 1971);
		
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
