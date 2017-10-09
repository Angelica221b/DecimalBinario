package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un número");
		n=s.nextInt();
		System.out.println("Binario: "+bin(n));
	}
	public static String bin(int n){
		int resu=n%2;
		if(n<=1)
			return ""+resu;
		else
			return ""+bin((n-resu)/2)+resu;
	}
}