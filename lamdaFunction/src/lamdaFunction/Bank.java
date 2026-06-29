package lamdaFunction;

import java.util.Scanner;

public interface Bank {
	double getIntrest();

	public static void main(String[] args) {

	}

	class demo {
		static void DisplayIntrest(String name, Bank b) {
			System.out.println("name" + b.getIntrest());
	

			DisplayIntrest("nithin", () -> {
				return 3.142;
			});
		}
	}

}
