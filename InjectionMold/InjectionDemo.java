//63103600
import java.util.Scanner;

public class InjectionDemo {
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("========Menu=========");
            System.out.println("1. ToyDuckMold");
            System.out.println("2. ToyCarMold");
            System.out.println("Please Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    InjectionMold toyDuckMold = new ToyDuckMold();
                    toyDuckMold.inject(new ToyDuckMold());
                    break;
                case 2:
                    InjectionMold toyCarMold = new ToyCarMold();
                    toyCarMold.inject(new ToyCarMold());
                    break;
            }
            System.out.println("Complete!!");
            System.out.println("Do you want to continue? (Yes/No)");
        } while (sc.next().equalsIgnoreCase("Yes"));
        System.out.println("Thank you . Bye!");
    }
}
