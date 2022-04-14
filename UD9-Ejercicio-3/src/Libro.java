
public class Libro {

	private String isbn;
	private String titulos;
	private String autor;
	private int nPaginas;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	@Override
	public String toString() {
		return " El Libro con isbn " + isbn + " creado por el autor " + autor + " tiene " + nPaginas + " páginas";
	}
	
	
	
}
