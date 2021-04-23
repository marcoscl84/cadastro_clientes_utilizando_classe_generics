package cadastro_clientes_esab;

public class Gen<T> {
	
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	void show() {
		 System.out.println("Value: " + ob.getClass().getName());
	}

}
