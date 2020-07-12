package class02;

public class DataTypesDemo01 {
	public static void main(String[] args) {
		// 1. simple if statement
		boolean haveMony = false;
		if (haveMony) {
			System.out.println("I will eat outside");
		}
		// 2. if else statement
		boolean isRaining = false;
		if (isRaining) {
			System.out.println("Take the umbrella");
		} else {
			System.out.println("Don’t take umbrella");
		}
		System.out.println("*******************");
		// real time example
		boolean buttonIsEnabled = true;
		if (buttonIsEnabled) {
			System.out.println("Login Btn is enabaled");
		} else {
			System.out.println("Login Btn is disabled");
		}
		System.out.println("*****************");
		// if else ladder. Alex, Malika, Ummar
		String name = "Ummar";
		
		if (name.equals("Alex")) {
			System.out.println("User logged in as Alex");
			
		} else if (name.equals("Malika")) {
			System.out.println("User logged in as Malika");
		} else if (name.equals("Ummar")) {
			System.out.println("User logged in as Ummar");
			
		}else {
			System.err.println("Unknown User");
		}
		//Though it is a string it will return true/false
		boolean isJohn=name.equals("John");
		System.out.println(isJohn);
		
	}
}
		
		
	


