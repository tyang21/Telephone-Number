import java.util.Scanner;
/**
 * Telephone Number HW
 * @author Tyler Yang
 * Period 7
 */
public class TelephoneNumber {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name: "); //Display Prompt
		String name = in.next();
		in.nextLine();
		System.out.println("Enter your Phone Number: "); //Display Prompt
		String phone = in.next();
		in.nextLine();
		
		String first = phone.substring(0,3);
		String second = phone.substring(3,6);
		String last = phone.substring(6,10);
		
		System.out.printf("Name: %-20s", name );
		System.out.print("(" + first + ")" + second + "-" + last);
		in.close();
		

	}

}
