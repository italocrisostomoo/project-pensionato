package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Service;

public class Pensionato {

	public static void main(String[] args) {

		int feedback = 0;
		Service service = new Service();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1 - Rent\n2 - Busy Rooms");
			System.out.print("\nOption: ");
			feedback = sc.nextInt();

			switch (feedback) {

			case 1:

				service.registerRent();
				break;

			case 2:
				
				service.busyRooms();
				
				break;
			}
		} while (feedback != 999);

		sc.close();
	}

}
