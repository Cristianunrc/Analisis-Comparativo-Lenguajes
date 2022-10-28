
public class TestSuma {

	public static void main(String[] args) {
		
		/**
		 * obj1 estaticamente pertenece a A y dinamicamente pertenece a B
		 */
		A obj1 = new B();
		
		System.out.println("Suma: " + obj1.suma()); // muestra por pantalla un 15

	}

}
