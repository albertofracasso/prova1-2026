//Versione PROVA FINALE-Da online a locale
public class Libro {

	private String titolo;
	private String autore;
	private String codice;
	private int pagine;
	
	
	
	
	public Libro(String titolo, String autore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getCodice() {
		return codice;
	}


	public int getPagine() {
		return pagine;
	}


	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", codice=" + codice + ", pagine=" + pagine + "]";
	}


	public static void main(String[] args) {
		Libro lib1= new Libro("I promessi sposi", "Frax");
		lib1.setCodice("11aa08");
		lib1.setPagine(11);
		System.out.println(lib1);
	}

}

