package cadastro_clientes_esab;

public class Principal {

	public static void main(String[] args) {
		//nome, sobrenome, idade, e-mail
		
		Gen<String> nomeOb;
		nomeOb = new Gen<String>("Marcos");
		nomeOb.show();
		String n = nomeOb.getOb();
		System.out.println("value: " + n);
		System.out.println();
		
		Gen<String> sobreNomeOb;
		sobreNomeOb = new Gen<String>("Lima");
		sobreNomeOb.show();
		String sn = sobreNomeOb.getOb();
		System.out.println("value: " + sn);
		System.out.println();
		
		Gen<Integer> idadeOb;
		idadeOb = new Gen<Integer>(36);
		idadeOb.show();
		int i = idadeOb.getOb();
		System.out.println("value: " + i);
		System.out.println();
		
		Gen<String> emailOb;
		emailOb = new Gen<String>("marcos.lima@email.com.br");
		emailOb.show();
		String e = emailOb.getOb();
		System.out.println("value: " + e);
	}

}
