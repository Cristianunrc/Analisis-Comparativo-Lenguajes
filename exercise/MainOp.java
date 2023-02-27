package exercise;

public class MainOp {

	public static void main(String[] args) {
		
		//Operaciones var = new Operaciones(); esta sentencia no se puede realizar ya que no se permiten instancias de una clase abstracta.
		
		Operaciones1 op = new Operaciones1();
		
		System.out.println(op.suma(3, 5));
		System.out.println(op.resta(4, 9));

	}

}
