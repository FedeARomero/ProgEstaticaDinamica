package paquete;

public class FibonacciEstatico {

	private long[] vector;

	public FibonacciEstatico(int n) {
		vector = new long[Math.min(n, 92) + 1];
		vector[0] = 0;
		vector[1] = 1;
		for (int i = 2; i < vector.length; i++)
			vector[i] = vector[i - 1] + vector[i - 2];
	}

	public FibonacciEstatico() {
		this(92);
	}

	public long numero(int n) {
		return n < 93 ? vector[n] : -1;
	}

	public long last() {
		return vector[vector.length - 1];
	}

	public void mostrar() {
		for (int i = 1; i < vector.length; i++)
			System.out.println("f(" + i / 10 + i % 10 + ") = " + vector[i]);
	}

	public static void main(String[] args) {
		
		FibonacciEstatico f = new FibonacciEstatico();
		
		f.mostrar();
		
		System.out.println(f.last());
		
	}

}
