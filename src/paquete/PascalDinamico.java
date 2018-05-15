package paquete;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PascalDinamico {
	
	private Map<Integer, BigInteger[]> pascal;
	
	public PascalDinamico() {
		pascal = new TreeMap<Integer, BigInteger[]>();
		BigInteger[] vector = new BigInteger[1];
		vector[0] = BigInteger.valueOf(1);
		pascal.put(0, vector);
	}
	
	public BigInteger[] numeros(int n) {
//		System.out.println("Calculo combinatorios de " + n);
		if( pascal.containsKey(n) )
			return pascal.get(n);

		BigInteger[] vector = pascal.containsKey(n-1) ? pascal.get(n-1) : numeros(n-1);
		BigInteger[] vecpas = new BigInteger[n+1];
		
		vecpas[0] = vecpas[n] = BigInteger.valueOf(1);
		vecpas[1] = vecpas[n-1] = BigInteger.valueOf((long)n);
		
		for (int i = 2; i <= n/2; i++)
			vecpas[i] = vecpas[n-i] = vector[i-1].add(vector[i]);
		
		pascal.put(n, vecpas);
		
		return vecpas;
	}
	
	public BigInteger numero(int n, int k) {
		BigInteger[] vector = pascal.containsKey(n) ? pascal.get(n) : numeros(n-1);
		
		return k > n ? BigInteger.valueOf(0) : vector[k];
	}

	public static void main(String[] args) {

		PascalDinamico p = new PascalDinamico();
		
		System.out.println(Arrays.toString(p.numeros(7)));
		System.out.println(Arrays.toString(p.numeros(5)));
		System.out.println(Arrays.toString(p.numeros(9)));
	}

}
