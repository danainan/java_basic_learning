//63103600
import java.util.Scanner;

public class MilkTeaShop {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            BubbleOption[] bubbleOption = new BubbleOption[3];
            bubbleOption[0] = new BubbleOption("Brown Bubble", 5);
            bubbleOption[1] = new BubbleOption("Black Bubble", 10);
            bubbleOption[2] = new BubbleOption("White Bubble", 15);
            TeaOption[] teaOption = new TeaOption[3];
            teaOption[0] = new TeaOption("Thai Tea", 20);
            teaOption[1] = new TeaOption("Taiwan Tea", 30);
            teaOption[2] = new TeaOption("Mutcha Tea", 50);
            int total = 0;
            int bubble = 0;
            int tea = 0;
            int bubblePrice = 0;
            int teaPrice = 0;
            String bubbleName = "";
            String teaName = "";

           
            System.out.println("Please select your tea");
            for (int i = 0; i < teaOption.length; i++) {
                System.out.println((i + 1) + ". " + teaOption[i].getName() + " " + teaOption[i].getPrice() + " Baht");
            }
            System.out.print("Select your tea: ");
            tea = input.nextInt();
            teaName = teaOption[tea - 1].getName();
            teaPrice = teaOption[tea - 1].getPrice();
            for (int i = 0; i < bubbleOption.length; i++) {
                System.out.println((i + 1) + ". " + bubbleOption[i].getName() + " " + bubbleOption[i].getPrice() + " Baht");
            }
            System.out.print("Select your bubble: ");
            bubble = input.nextInt();
            bubbleName = bubbleOption[bubble - 1].getName();
            bubblePrice = bubbleOption[bubble - 1].getPrice();
            total = bubblePrice + teaPrice;
            System.out.println("" + teaName + " " + bubbleName+ " " + total + " Baht");
        }
}
