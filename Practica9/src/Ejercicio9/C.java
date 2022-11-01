package Ejercicio9;

public class C extends B {
	
	/**
	 * Metodo publico que imprime un mensaje
	 */
	public void type () {
		System.out.println ("Soy C");
	}
	
	/**
	 * Metodo publico que invoca en su cuerpo el metodo type() de la clase B
	 * @param _b
	 */
	public void type(B _b) {
		_b.type();
	}

}
