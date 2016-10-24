package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		NissanTiida Tiida=new NissanTiida();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n=keyboard.nextInt();
		for(x=1;x<=n;x++){
			System.out.println("\n");
			Tiida.Tiida(x);
			System.out.println("\n\n");
		}
		keyboard.close();
		
	}

}
