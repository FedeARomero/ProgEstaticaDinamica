package paquete;

public class FactorialEstatico {

	private long[] factoriales;

	public FactorialEstatico(int n) {
		factoriales = new long[ Math.min(20, n) + 1 ];
		factoriales[0] = 1;
		
		for (int i = 1; i < factoriales.length; i++)
			factoriales[i] = i * factoriales[i - 1];
	}

	public FactorialEstatico() {
		this(20);
	}

	public long numero(int n) {
		return -1 < n && n < factoriales.length ? factoriales[n] : -1;
	}

	public long last() {
		return factoriales[factoriales.length - 1];
	}

	public void mostrar() {
		System.out.println("\nFactoriales (" + factoriales.length +")");
		for (int i = 0; i < factoriales.length; i++)
			System.out.println("" + (i / 10) + (i % 10) + "! = " + factoriales[i]);
	}

	public static void main(String[] args) {
		FactorialEstatico f = new FactorialEstatico();

		f.mostrar();

	}

}
