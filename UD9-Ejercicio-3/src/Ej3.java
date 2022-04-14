
public class Ej3 {

	public static void main(String[] args) {

		Libro libro1 = new Libro("01", "El Nombre del Viento", "Patrick Rothufuss", 1600);
		Libro libro2 = new Libro("02", "El Temor de un hombre sabio", "Patrick Rothufuss", 1500);
		
		compararPaginas(libro1, libro2);
		
	}

	public static void compararPaginas(Libro a, Libro b) {
		
		if (a.getnPaginas() > b.getnPaginas()) {
			System.out.println(a.getTitulos() + " tiene mas paginas que " + b.getTitulos());
		}
		else {
		System.out.println(b.getTitulos() + " tiene mas paginas que " + a.getTitulos());
		}
	}
}
