package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int rentsQtt = sc.nextInt();

		Rent[] rooms = new Rent[10];

		for (int i = 0; i < rentsQtt; i++) {

			System.out.println("\nRent #" + (i + 1));

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			rooms[room] = new Rent(name, email, room);
		}

		System.out.println("\nBusy rooms: \n");

		for (int i = 0; i < 10; i++) {

			if (rooms[i] != null) {
				System.out.println(rooms[i].getRoom() + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}
		
		sc.close();
	}

}
