package paquete;

public class FactorialEstatico {

	private long[] vector;

	public FactorialEstatico(int n) {
		vector = new long[n + 1];
		vector[0] = 1;
		for (int i = 1; i < vector.length; i++)
			vector[i] = i < 21 ? i * vector[i - 1] : -1;
	}

	public FactorialEstatico() {
		this(20);
	}

	public long numero(int n) {
		return n < vector.length ? vector[n] : -1;
	}

	public long last() {
		return vector[vector.length - 1];
	}

	public void mostrar() {
		for (int i = 0; i < vector.length; i++)
			System.out.println("" + (i / 10) + (i % 10) + " = " + vector[i]);
	}

	public static void main(String[] args) {

		FactorialEstatico f = new FactorialEstatico();

		f.mostrar();
		System.out.println(f.last());

	}

}
