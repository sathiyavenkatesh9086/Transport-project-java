package controller;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import services.Adminoperation;
import services.Useroperation;
import utility.Validation;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		start();
	}

	public static void start() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		while(true){
		System.out.println("Who is this");
		System.out.println("1. Admin \n2. User\n3. Exit");
		int name=Integer.parseInt(br.readLine());
		switch(name)
		{
		case 1:
			System.out.println("Enter username");
			String username=br.readLine();
			System.out.println("enter password");
			String password=br.readLine();
			Validation validation=new Validation();
			boolean checkAdmin=validation.checkAccess(username,password);
			if(checkAdmin)
			{
			Adminoperation admin= new Adminoperation();
			admin.adminn();
			}
			else
			{
				System.out.println("Incorrect password");
			}
			break;
		case 2:Useroperation useroperation = new Useroperation();
					useroperation.userMenu();
			break;
			default: System.out.println("Thank - You");
				System.exit(0);
				break;
		}
		}
	}
}
