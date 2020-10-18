package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import model.Busdetails;
import controller.Main;

public class Useroperation {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			System.in));

	public void userMenu() throws IOException {
		boolean flag = true;

		while (flag) {

			System.out
					.println("\t\t\tUser Menu\n\t\t\t1.Based on availablity You got allocated to buss \n\t\t\t2. Exit");

			int choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1:
				townbus_fn();
				break;
			case 2:
				Main.start();
				break;
			default:
				System.out.println("Wrong press keys");
				Main.start();
				break;
			}

		}
	}

	// if(busType.equalsIgnoreCase("Townbus"))
	// {
	// townbus_fn(busDestination,busTiming);
	//
	// }
	// else
	// {
	// Intercitybus_fn(busDestination,busTiming);
	// }
	//
	// }
	public void townbus_fn() throws IOException {
		Adminoperation busDestination = new Adminoperation();
		List<Busdetails> busdetails = busDestination.getAllDetails();
		System.out.println("Enter your Bus Destination");
		String destination = bufferedReader.readLine();
		System.out.println("Enter your Bus timing");
		float busTiming = Float.parseFloat(bufferedReader.readLine());
		for (Busdetails bus : busdetails) {

			if (bus.getBusDestination().equalsIgnoreCase(destination)
					&& (bus.getBusTiming() == (busTiming))) {
				System.out.println("TownBus available");
			} else {
				System.out.println("Intercity Bus available");
			}
		}
	}

}