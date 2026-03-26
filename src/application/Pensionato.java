package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {

		int feedback = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rooms = new Rent[10];

		do {

			System.out.println("1 - Rent\n2 - Busy Rooms\nOption: ");
			feedback = sc.nextInt();

			switch (feedback) {

			case 1:

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

					rooms[room] = new Rent(name, email, room);
				}
				break;

			case 2:
				System.out.println("\nBusy rooms: \n");

				for (int i = 0; i < 10; i++) {

					if (rooms[i] != null) {
						System.out.println(rooms[i].getRoom() + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
					}
				}
				
				break;
			}
		} while (feedback != 999);

		sc.close();
	}

}
