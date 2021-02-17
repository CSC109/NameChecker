import java.util.Scanner;

public class NameChecker {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = keyboardInput.nextLine();
		if (name.toLowerCase().equals("alex")) {
			System.out.println("Nice name! Wow! Love it!");
		}
		else {
			System.out.println("That's an okay name I guess.");
		}
	}

}