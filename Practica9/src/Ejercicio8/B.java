package Ejercicio8;

public class B extends A2 {

	/**
	 * Metodo publico m1.
	 * @param x de tipo B recursivo
	 * @return String
	 */
	public String m1 (B x) {
		return "BA2";
	}
	
	/**
	 * Metodo publico m2.
	 * @param x de tipo B recursivo.
	 * @return un String y lo que retorna el metodo m1(x)
	 */
	public String m2 (B x) {
		return "Paso por B - m2(B)" + this.m1(x);
	}
	
	// Sobreescribir?
	public String m2 (A2 x) {
		return "Paso por B - m2(A2)" + this.m1(this);
	}
	
	public static void main(String[] args) {
		
		// objeto a de clase A2 que referencia a la clase A2
		A2 a = new A2();
		
		// objeto b2 de clase A2 que referencia a la clase B
		A2 b2 = new B();
		
		// objeto b3 de clase B que referencia a la clase B
		B b3 = new B();
		
		System.out.println(a.m2(b3)); // imprime "Paso por A - m2(A2) AA2"
		
		System.out.println(b2.m2(b2)); // imprime "Paso por B - m2(A2) BA2"
		
		System.out.println(b3.m2( (B) b2 )); // imprime "Paso por B - m2(B) BA2"
		
		System.out.println(b3.m2(a)); // imprime "Paso por B - m2(B) BA2"
	}

}
