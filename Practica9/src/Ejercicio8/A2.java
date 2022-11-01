package Ejercicio8;

public class A2 {

	/**
	 * Metodo publico m1.
	 * @param x de tipo A2, el tipo es recursivo..
	 * @return String
	 */
	public String m1 (A2 x) {
		
		return ("AA2");
	}
	
	/**
	 * Metodo publico m2
	 * @param x de tipo A2 recursivo.
	 * @return un String con lo que retorna el metodo m1.
	 */
	public String m2 (A2 x) {
		
		return ("Paso por A - m2 (A2)" + this.m1(x));
	}
}
