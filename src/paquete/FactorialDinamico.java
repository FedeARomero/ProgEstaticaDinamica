package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FactorialDinamico {
	
	private Map<Integer, BigInteger> vector = new TreeMap<Integer, BigInteger>();

	public FactorialDinamico() {
		vector.put(0, new BigInteger("1"));
	}
	
	public BigInteger numero(int n) {
		if( vector.containsKey(n) ) return vector.get(n);
		
		if( n == 0 )
			vector.put(0, new BigInteger("1"));
		else
			vector.put(n, numero(n-1).multiply(new BigInteger(Integer.toString(n))));
		
		return vector.get(n);
	}
	
	public BigInteger last() {
		return vector.get(vector.size()-1);
	}
	
	private void mostrar() {
		System.out.println();
		System.out.println("Factorial " + vector.size());
		for (int numero : vector.keySet())
			System.out.println("" + numero/10 + numero%10 + "! = " + vector.get(numero));
//		System.out.println();
	}
	
	public static void main(String[] args) {
		FactorialDinamico f = new FactorialDinamico();

		f.mostrar();
		System.out.println(f.last());
		System.out.println( 5 + " " + f.numero( 5));
		f.mostrar();
		System.out.println(f.last());
		System.out.println(15 + " " + f.numero(15));
		f.mostrar();
		System.out.println(f.last());
		System.out.println(10 + " " + f.numero(10));
		f.mostrar();
		System.out.println(f.last());
		System.out.println(25 + " " + f.numero(25));
		f.mostrar();
		System.out.println(f.last());
		System.out.println(20 + " " + f.numero(20));
		f.mostrar();
		System.out.println(f.last());
//		System.out.println(f.numero(100));
//		f.mostrar();
	}


}
