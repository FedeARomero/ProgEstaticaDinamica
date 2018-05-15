package paquete;

import java.math.BigInteger;

public class CombinatorioBigInteger {

private BigInteger[][] matriz;

	public static final int tam = 200;
	
	public CombinatorioBigInteger() {
		this.matriz = new BigInteger[tam+1][tam+1];
		this.matriz[0][0] = BigInteger.valueOf(1);
	}
	
	public BigInteger numero(int n, int k) {
		
		if ( k > n ) return BigInteger.valueOf(0);

		if( n >= 0 && k == 0 || n == k ) matriz[n][0] = matriz[0][n] = BigInteger.valueOf(1);
		
		if( matriz[n-k][k] == null )
			matriz[n-k][k] = matriz[k][n-k] = numero(n-1,k-1).add(numero(n-1,k));
		
		return matriz[n-k][k];
	}
	
	public BigInteger last() {
//		System.out.println("C(" + 2*(matriz.length-1) + "," + (matriz.length-1) + ")");
		return numero(2*(matriz.length-1),matriz.length-1);
	}
	
	public void mostrar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		CombinatorioBigInteger c = new CombinatorioBigInteger();
		
//		c.mostrar();
		System.out.println(c.numero(400,200));
//		System.out.println(c.last());
//		c.mostrar();

	}

}
