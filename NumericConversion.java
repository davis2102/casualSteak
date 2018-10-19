import java.util.Scanner;
public class NumericConversion {

public static void main(String [] args)
{
    int menuChoice = 0;
    String number;
    Scanner scanMenu = new Scanner(System.in);
    //prints out menu options, stops the loop if option four is chosen
    while (menuChoice != 4)
    {
        System.out.println("Decoding Menu");
        System.out.println("-------------");
        System.out.println("1. Decode hexadecimal");
        System.out.println("2. Decode binary");
        System.out.println("3. Convert binary to hexadecimal");
        System.out.println("4. Quit" + "\n");
        System.out.print("Please enter an option: ");
        menuChoice = scanMenu.nextInt();
        //calls method for decoding hexadecimal strings to decimal values if option 1 is chosen
        if (menuChoice == 1)
        {
            System.out.println("Please enter the numeric string to convert: ");
            number = scanMenu.next();
            //Almost got me here, have to check if the string has more characters then 1 in order to remove the two prefixes if they exist at 0 and 1
            if (number.length() >1)
            {   //removes the prefixes at 0 and 1
                if (number.charAt(1) == 'x')
                {
                    number = number.substring(2);
                }
            }
            //calls method for decoding hexadecimal characters to decimal values if the length of the string is 1
            if (number.length() == 1)
            {
                char hexChar = number.charAt(0);
                hexCharDecode (hexChar);
            }
            else
            {
                hexStringDecode(number);
            }
        }
        //calls method for decoding binary strings to decimal values if option 2 is chosen
        if (menuChoice == 2)
        {
                System.out.print("Please enter the numeric string to convert: ");
                number = scanMenu.next();
                binaryStringDecode(number);

        }
        if (menuChoice == 4)
        {
            System.out.println("Goodbye!");
        }
    }

}
    //method that converts hexadecimal strings to decimal values
    public static Long hexStringDecode (String hex)
    {   //Doesn't acknowledge 0x prefix if it exists
        if (hex.charAt(1) == 'x')
        {
            hex = hex.substring(2);
        }
        int count = 0;
        long hexStringDecode = 0;
        int hexPosition = hex.length()-1;
        while (count <= hex.length()-1)
        {   //Gets value of string characters individually from left to right, multiplies them by 16 to the power appropriate for each digit; adds their value to an accumulated total; ignores the digit if it's a 0 and moves on to the next
            if (Character.getNumericValue (hexPosition) != 0)
            {
            hexStringDecode = (long)(hexStringDecode + Character.getNumericValue(hex.charAt(hexPosition))*Math.pow(16, count));
            hexPosition--;
            count++;
            }
            else
            {
            hexPosition--;
            count++;
            }

        }

            System.out.println("Result: " + hexStringDecode + "\n");
            return hexStringDecode;
    }

    //method that converts hexadecimal characters to decimal values
   public static short hexCharDecode (char digit)
    {
    short hexCharDecode = 0;
    int i = (int)digit;
    hexCharDecode = (short)(Character.getNumericValue(i));
    System.out.print("Result: "+ Character.getNumericValue(i) + "\n");
    return hexCharDecode;
    }

    //Method that converts binary strings to decimal values
    public static short binaryStringDecode(String binary)
    {
        //removes binary prefix if it exists
        if (binary.charAt(1) == 'b')
        {
            binary = binary.substring(2);
        }
        int count = 0;
        short binaryStringDecode = 0;
        int binaryPosition = binary.length()-1;
        while (count <= binary.length()-1)
        {   //Gets value of string characters individually from left to right, multiplies them by 16 to the power appropriate for each digit; adds their value to an accumulated total; ignores the digit if it's a 0 and moves on to the next
            if (Character.getNumericValue(binary.charAt(binaryPosition)) == 1)
            {
                binaryStringDecode = (short) (binaryStringDecode + Math.pow(2, count));
                binaryPosition--;
                count++;
            } else
            {
                binaryPosition--;
                count++;
            }
        }
            System.out.println("Result: " + binaryStringDecode + "\n");
            return binaryStringDecode;
    }
}