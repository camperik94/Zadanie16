
public class Obliczanie {
	private int liczba;

	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}

	public Obliczanie(int liczba) {
		this.liczba = liczba;
	}

	public int funkcja() {
		int zwrocona = liczba;
		int n;
		int count = 0;

		while (zwrocona > 0) {
			System.out.println("Zwrocona = " + zwrocona);
			count++;
			zwrocona = zwrocona / 10;
			System.out.println("Count = " + count);
		}
		return count;
	}
}
