import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);

		Filmes filme = new Filmes();

		filme.cadastraFilmes("Upgrade", "Ficção Científica", 2018);
		filme.cadastraFilmes("Tenet", "Ficção Científica", 2020);
		filme.cadastraFilmes("Ad Astra - Rumo às estrelas", "Ficção Científica", 2019);
		filme.cadastraFilmes("Blade Runner 2049", "Ficção Científica", 2017);
		filme.cadastraFilmes("A chegada", "Ficção Científica", 2016);
		filme.cadastraFilmes("Aniquilação", "Ficção Científica", 2018);
		filme.cadastraFilmes("Desculpe te incomodar", "Ficção Científica", 2018);
		filme.cadastraFilmes("Interstellar", "Ficção Científica", 2014);
		filme.cadastraFilmes("Paprika", "Ficção Científica", 2006);
		filme.cadastraFilmes("Ex Machina", "Ficção Científica", 2014);
		filme.cadastraFilmes("Filhos da esperança", "Ficção Científica", 2006);
		filme.cadastraFilmes("A origem", "Ficção Científica", 2010);
		filme.cadastraFilmes("Mad Max: Estrada da fúria", "Ficção Científica", 2015);
		filme.cadastraFilmes("Bilho eterno de uma mente sem lembranças", "Ficção Científica", 2004);
		filme.cadastraFilmes("Distrito 9", "Ficção Científica", 2009);
		filme.cadastraFilmes("Ela", "Ficção Científica", 2013);
		filme.cadastraFilmes("Minority Report - A nova lei", "Ficção Científica", 2002);
		filme.cadastraFilmes("A.I:. Inteligência artificial", "Ficção Científica", 2001);
		filme.cadastraFilmes("Donnie Darko", "Ficção Científica", 2001);
		filme.cadastraFilmes("Laranja mecânica", "Ficção Científica", 1971);

		filme.filtraFilmes();

		filme.excluiFilmes();

		scan.close();

	}
}
