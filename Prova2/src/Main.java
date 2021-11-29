import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);

		Filmes filme = new Filmes();

		filme.cadastraFilmes("Upgrade", "Fic��o Cient�fica", 2018);
		filme.cadastraFilmes("Tenet", "Fic��o Cient�fica", 2020);
		filme.cadastraFilmes("Ad Astra - Rumo �s estrelas", "Fic��o Cient�fica", 2019);
		filme.cadastraFilmes("Blade Runner 2049", "Fic��o Cient�fica", 2017);
		filme.cadastraFilmes("A chegada", "Fic��o Cient�fica", 2016);
		filme.cadastraFilmes("Aniquila��o", "Fic��o Cient�fica", 2018);
		filme.cadastraFilmes("Desculpe te incomodar", "Fic��o Cient�fica", 2018);
		filme.cadastraFilmes("Interstellar", "Fic��o Cient�fica", 2014);
		filme.cadastraFilmes("Paprika", "Fic��o Cient�fica", 2006);
		filme.cadastraFilmes("Ex Machina", "Fic��o Cient�fica", 2014);
		filme.cadastraFilmes("Filhos da esperan�a", "Fic��o Cient�fica", 2006);
		filme.cadastraFilmes("A origem", "Fic��o Cient�fica", 2010);
		filme.cadastraFilmes("Mad Max: Estrada da f�ria", "Fic��o Cient�fica", 2015);
		filme.cadastraFilmes("Bilho eterno de uma mente sem lembran�as", "Fic��o Cient�fica", 2004);
		filme.cadastraFilmes("Distrito 9", "Fic��o Cient�fica", 2009);
		filme.cadastraFilmes("Ela", "Fic��o Cient�fica", 2013);
		filme.cadastraFilmes("Minority Report - A nova lei", "Fic��o Cient�fica", 2002);
		filme.cadastraFilmes("A.I:. Intelig�ncia artificial", "Fic��o Cient�fica", 2001);
		filme.cadastraFilmes("Donnie Darko", "Fic��o Cient�fica", 2001);
		filme.cadastraFilmes("Laranja mec�nica", "Fic��o Cient�fica", 1971);

		filme.filtraFilmes();

		filme.excluiFilmes();

		scan.close();

	}
}
