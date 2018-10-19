import java.util.Scanner;
public class NumericConversion {
    public static void main(String[] args)
    {
        int menuChoice = 0;
        String number;
        Scanner newscanner = new Scanner(System.in);

        while (menuChoice != 4)
        {
            System.out.println("Decoding Menu");
            System.out.println("-------------");
            System.out.println("1. Decode hexadecimal");
            System.out.println("2. Decode binary");
            System.out.println("3. Convert binary to hexadecimal");
            System.out.println("4. Quit" + "\n");
            System.out.print("Please enter an option: ");

            menuChoice = newscanner.nextInt();
            if (menuChoice == 1)
            {
                number = newscanner.next();
                hexStringDecode(number);

            }
        }

    }
    //Converts hexadecimal to decimal
    public static long hexStringDecode(String hex)
    {
        if (length(hex) == 8)
        {
            //Takes individual hexadecimal digits and converts them to their decimal value, hex.charAt() inclusively counts, we exclusively count the digits
            int tempDigit;
            tempDigit = hex.charAt(6);
            int digSeven = tempDigit * 16;
            tempDigit = hex.charAt(5);
            int digSix = tempDigit * 16 * 16;
            tempDigit = hex.charAt(4);
            int digFive = tempDigit * 16 * 16 * 16;
            tempDigit = hex.charAt(3);
            int digFour = tempDigit * 16 * 16 * 16 * 16;
            tempDigit = hex.charAt(2);
            int digThree = tempDigit * 16 * 16 * 16 *16 * 16;
        }


    }
}

