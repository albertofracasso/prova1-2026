import java.util.Arrays;

public class Libreria {

	// private int maxLibri;
	private String nome;
	private Libro[] libri;
	private int numLibri;

	public Libreria(String nome, int maxLibri) {
		libri = new Libro[maxLibri];
		numLibri = 0;
		this.nome = nome;
	}
/*
	public boolean addLibro(Libro lib1) {
		libri[numLibri]=lib1;
		numLibri++;
		return false;
	}
*/
	public boolean addLibro(Libro lib1) {
		if(numLibri<libri.length) {
		libri[numLibri]=lib1;
		numLibri++;
		return true;
	}
		else
		return false;
	}
	/*
	public String toString() {
		return "Libreria [nome=" + nome + ", libri=" + Arrays.toString(libri) + "]";
	}
*/
	//elimina libri per posizione senza controllo
	public void delLibroPos(int pos) {
		libri[pos]=null;
		
		
	}
	public String toString() {
		String s="Nome Libreria: "+nome+"\n";
		for(int i=0;i<libri.length;i++) {
			if(libri[i]!=null) {
				s=s+ libri[i]+"\n";
			}
		}
		return s;
	}
	public static void main(String[] args) {
Libreria libCentrale= new Libreria("Libreria viale Ferrari",1);
Libro lib1=new Libro("Primo Libro","Primo Autore");
Libro lib2=new Libro("Secondo Libro","Secondo Autore");
Libro lib3=new Libro("Terzo Libro","Terzo Autore");
System.out.println(libCentrale.addLibro(lib1));
System.out.println(libCentrale.addLibro(lib2));
System.out.println(libCentrale.addLibro(lib3));
System.out.println(libCentrale);
	}

}
