import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj liczbe calkowita");
		
		int liczba = in.nextInt();
		
		Obliczanie obl = new Obliczanie(liczba);
		
		System.out.println(obl.funkcja());
		
	}
}
