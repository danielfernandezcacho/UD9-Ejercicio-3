/*
 * @author Joan Hurtado Garcia / Jose Antonio Gonzalez Alcantara / Daniel Fernandez Cacho
 * version 1.0
 */
public class Ej3 {

	public static void main(String[] args) {
		
		//los dos libros creados
		Libro libro1 = new Libro("01", "El Nombre del Viento", "Patrick Rothufuss", 1600);
		Libro libro2 = new Libro("02", "El Temor de un hombre sabio", "Patrick Rothufuss", 1500);
		
		//metodo comparar paginas
		compararPaginas(libro1, libro2);

	}

	public static void compararPaginas(Libro a, Libro b) {
		//comparar las paginas del libro a i el b 
		if (a.getnPaginas() > b.getnPaginas()) {
			//gana libro a 
			System.out.println(a.getTitulos() + " tiene mas paginas que " + b.getTitulos());
		}
			//gana libro b
		else {
		System.out.println(b.getTitulos() + " tiene mas paginas que " + a.getTitulos());
		}
	}
}
