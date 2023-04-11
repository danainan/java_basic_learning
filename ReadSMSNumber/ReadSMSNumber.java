import java.util.Scanner;
public class ReadSMSNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		char N = 'y' ;
		do {
			System.out.print( "SMS Number : ");
			String n = input.nextLine();
            if (n.length() <= 10) {
            	readSMS(n);
            }
            else {
            	System.out.println("Invalid Number");
            }
			
			System.out.print("Do you want to Continue [y/n] : ");
			N = input.next().charAt(0);
            input.nextLine();

		}while(N=='y');
			System.out.println("Bye Bye!!");
	}	
	public static void readSMS(String n) {
		System.out.print( "Read as : ");
		for(int i=0; i<n.length();i++) {
			char num = n.charAt(i);
		
		switch (num) {
		case '0' :
			System.out.print("Zero ");
			break;
		case '1' :
			System.out.print("One ");
			break;
		case '2' :
			System.out.print("Two ");
			break;
		case '3' :
			System.out.print("Three ");
			break;
		case '4' :
			System.out.print("Four ");
			break;
		case '5' :
			System.out.print("Five ");
			break;
		case '6' :
			System.out.print("Six ");
			break;
		case '7' :
			System.out.print("Seven ");
			break;
		case '8' :
			System.out.print("Eight ");
			break;
		case '9' :
			System.out.print("Nine ");
			break;
		}
		}
        System.out.println();
	}
}