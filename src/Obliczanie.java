
public class Obliczanie {
	private int liczba;
	private int ilosc;
	
	
	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

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
		ilosc = count;
		return count;
	}
	public int suma() {
		int i = 0;
		while (liczba != 0) {
			i = i +(liczba % 10);
			//System.out.println(i);
			liczba = liczba / 10;
		}
		return i;
	}
}
