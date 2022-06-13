package selfTest;

import java.util.Scanner;

public class carNumberCheck {
    /*
        card number convert

         */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        do {

            System.out.println("enter the card number:");
            String c = input.nextLine().replaceAll("[\\s\\D]", "");
            StringBuilder str = new StringBuilder(c);
            if (c.length() == 16) {
                for (int i = 4; i <= str.length() - 1; i += 5) {
                    str.insert(i, '-');
                }
                String result = str.toString();
                System.out.println("your card number is :" + result.substring(0, 15).replaceAll("\\d", "*") + result.substring(15));
                break;
            } else {
                System.out.println("please enter 16 digits card number");
            }
        } while (true);
        System.out.println("cart number confirmed");
    }

}
