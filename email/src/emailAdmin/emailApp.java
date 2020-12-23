package emailAdmin;

import java.util.Scanner;

public class emailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first name: ");
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		System.out.println("Enter last name: ");
		String last = in.nextLine();
		Email em1 = new Email(first, last);
		System.out.println(em1.showInfo());

	}

}
