package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		Scanner keyboard=new Scanner(System.in);
		PasswordEncorder gg=new PasswordEncorder();
		do{
			
		System.out.println("Please enter a Password:");
		password = keyboard.nextLine();
		
		if(password.equalsIgnoreCase("exit")){
			continue;
		}
		System.out.println(gg.encode(password));
		}while(!password.equalsIgnoreCase("exit"));
		System.out.println("end close...");
		keyboard.close();
	}

}
