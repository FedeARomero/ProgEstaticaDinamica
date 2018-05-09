package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FibonacciDinamico {
	
	private Map<Integer, BigInteger> vector = new TreeMap<Integer, BigInteger>();
	
	public FibonacciDinamico() {
		vector.put(0, new BigInteger("0"));
		vector.put(1, new BigInteger("1"));
	}
	
	public FibonacciDinamico(int n) {
		for( int i = 0 ; i <= n ; i++ )
			numero(i);
	}
	
	public BigInteger numero(int n) {
		if( vector.containsKey(n) ) return vector.get(n);
		
		if( n < 2 )
			vector.put(n, new BigInteger(Integer.toString(n)));
		else
			vector.put(n, numero(n-1).add(numero(n-2)));
		
		return vector.get(n);
	}
	
	public int cantidad() {
		return vector.size();
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Fibonacci " + vector.size());
		for (int numero : vector.keySet())
			System.out.println("f(" + numero / 10 + numero % 10 + ") = " + vector.get(numero));
		System.out.println();
	}

	public static void main(String[] args) {

		FibonacciDinamico f = new FibonacciDinamico(2);
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
		
		System.out.println(f.numero(5));
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
		
		System.out.println(f.numero(3));
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
		
		System.out.println(f.numero(7));
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
		
		System.out.println(f.numero(150));
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
		
	}

}
