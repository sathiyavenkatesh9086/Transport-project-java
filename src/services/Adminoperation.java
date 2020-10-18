package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import controller.Main;
import model.Busdetails;

public class Adminoperation {
	static List<Busdetails> buslist = new ArrayList<Busdetails>();
	Busdetails busdetails = new Busdetails();

	public void adminn() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag1 = true;
		while (flag1) {
			System.out.println("Select the Operation");
			System.out.println("1.Add bus \n2.Remove bus \n3.Display \n4.Exit");
			int name =0;
			try{
			 name = Integer.parseInt(br.readLine());
			}catch(Exception exception){
				System.out.println("Invalid Key");
			}
			switch (name) {
			case 1:
				System.out.println("enter bus type");
				String busType = br.readLine();
				System.out.println("enter bus timing");
				float busTiming = Float.parseFloat(br.readLine());
				System.out.println("enter bus destination");
				String busDestination = br.readLine();
				busdetails.setBusType(busType);
				busdetails.setBusTiming(busTiming);
				busdetails.setBusDestination(busDestination);
				buslist.add(busdetails);
				break;

			case 2:
				System.out.println("Enter the bus type");
				String type = br.readLine();
				Iterator<Busdetails> iterator = buslist.iterator();
				boolean flag = true;
				while (iterator.hasNext()) {
					if (iterator.next().getBusType().equalsIgnoreCase(type)) {
						iterator.remove();
						System.out.println("DELETED SUCESSFULLY!!!");
						flag = false;
					}
				}
				if (flag) {
					System.out.println("Invalid Bus type");
				}
				break;

			case 3:
				System.out.println(buslist);
				break;
			case 4:
				Main.start();
				break;
			default:
				System.out.println("Invalid Choice!!!");
			}

			System.out.println("Do you want to continue? 1.Yes 2.No");
			int temp = Integer.parseInt(br.readLine());
			if (temp == 1)

			{
				continue;
			}
			if (temp == 2) {
				break;
			}
		}
	
	}
	
	public List<Busdetails> getAllDetails(){
		return buslist;
	}
}
