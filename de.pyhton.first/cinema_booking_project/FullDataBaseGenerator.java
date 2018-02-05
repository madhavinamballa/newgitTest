package cinema_booking_project;

public class FullDataBaseGenerator {
	//method tha takes a string from the film time 
	//returns a string 
	public static String returnFileName(String input) {
		String timeFileName = input;
		if (input.equals("1.00 PM")) {
			timeFileName = "SEAT DATABASE 1.00 PM.txt";
		}
		else if(input.equals("3.00 PM")) {
			timeFileName = "SEAT DATABASE 3.00 PM.txt";
		}
		else if(input.equals("5.00 PM")) {
			timeFileName = "SEAT DATABASE 5.00 PM.txt";
		}
		else if(input.equals("7.00 PM")) {
			timeFileName = "SEAT DATABASE 7.00 PM.txt";
		}
		return timeFileName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
