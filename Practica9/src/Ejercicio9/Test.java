package Ejercicio9;

public class Test {

	public static void main(String[] args) {
		
		// objeto a de clase A que referencia a la clase A
		A a = new A();
		
		// objeto b de clase B que referencia a la clase B
		B b = new B();
		
		// objeto c de clase B 
		B c = new C();
		
		a.type(b); // Soy B
		b.type(a); // Soy A
		b.type(b); // Soy B
		c.type((A) c); // Soy C
		c.type((C) c); // Soy C
	}

}
