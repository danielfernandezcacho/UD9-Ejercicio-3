
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
