package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FactorialDinamico {
	
	private Map<Integer, BigInteger> factoriales;

	public FactorialDinamico() {
		factoriales = new TreeMap<Integer, BigInteger>();
		factoriales.put( 0, BigInteger.valueOf(1) );
	}
	
	public BigInteger numero(int n) {
		if( factoriales.containsKey(n) ) return factoriales.get(n);
		
		factoriales.put( n, numero(n-1).multiply( BigInteger.valueOf(n) ) );
		
		return factoriales.get(n);
	}
	
	public BigInteger last() {
		return factoriales.get(factoriales.size()-1);
	}
	
	private void mostrar() {
		System.out.println("\nFactoriales (" + factoriales.size() +")");
		for (int numero : factoriales.keySet())
			System.out.println("" + numero + "! = " + factoriales.get(numero));
	}
	
	public static void main(String[] args) {
		FactorialDinamico f = new FactorialDinamico();

		int numero = 20;
		System.out.println(numero + "! = " + f.numero(numero));
		f.mostrar();
		
	}


}
