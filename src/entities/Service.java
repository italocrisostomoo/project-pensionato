package entities;

import java.util.Scanner;

public class Service {

	private Scanner sc = new Scanner(System.in);
	private Rent[] rooms = new Rent[10];

	public void registerRent() {

		System.out.print("How many rooms will be rented? ");
		int rentsQtt = sc.nextInt();

		for (int i = 0; i < rentsQtt; i++) {

			System.out.println("\nRent #" + (i + 1));

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			while(isAvailable(room) == false) {
				
				System.out.println("This room is not available. Please select an available room. ");
				System.out.print("Room: ");
				room = sc.nextInt();
				
			}
			
			rooms[room] = new Rent(name, email, room);
			System.out.println("New rent registered: " 
			+ "Room " 
			+ rooms[room].getRoom() 
			+ ", "
			+ rooms[room].getName() 
			+ ", " 
			+ rooms[room].getEmail());

		}
	}

	public void busyRooms() {

		System.out.println("\nBusy rooms: \n");

		for (int i = 0; i < 10; i++) {

			if (rooms[i] != null) {

				System.out.println(rooms[i].getRoom() + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());

			}
		}
	}

	public boolean isAvailable(int room) {

		if (rooms[room] == null && room >= 1 && room<=10) {
			return true;
		} else {			
			return false;
		}
	}
}
