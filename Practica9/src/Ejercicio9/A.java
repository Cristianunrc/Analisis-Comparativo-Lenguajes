package Ejercicio9;

public class A {
	
	/**
	 * metodo publico que imprime un string.
	 */
	public void type () {
		System.out.println ("Soy A");
	}
	
	/**
	 * metodo publico que invoca el metodo type().
	 * @param _a
	 */
	public void type (A _a) {
		_a.type();
	}
	
}
