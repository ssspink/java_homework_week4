package java_Homework_week4;

import java.util.Scanner;

/**Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 error message.
 For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 *
 */

public class Single_Character_3
{
    public void Test3()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = input.toLowerCase().charAt(0);
            //use Vowel letters
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Please enter a single letter.");
        }
    }

    public static void main(String[] args)
        {
            Single_Character_3 s3 = new Single_Character_3();
            s3.Test3();
    }
}
