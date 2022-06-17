import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        int width = 0;
        int length = 0;
        int area =0;
        int diagonalLength = 0;
        String trash = "";

        System.out.print("Please enter the width of your rectangle: ");
        if(in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid integer: " + trash);
            System.out.println("Run the program again and enter a valid integer!");
            System.exit(0);
        }

        System.out.print("Please enter the length of your rectangle: ");
        if(in.hasNextInt())
        {
            length = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid integer: " + trash);
            System.out.println("Run the program again and enter a valid integer!");
            System.exit(0);
        }

        area = length * width;
        System.out.println("The area of your rectangle is: " + area);

        diagonalLength = (length * length)
    }
}
