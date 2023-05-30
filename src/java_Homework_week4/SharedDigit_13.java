package java_Homework_week4;

/** Shared Digit
 Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false*
 *
 *
 */
public class SharedDigit_13 {
    public static boolean hasSharedDigit(int numA, int numB) {
        if (!isValidRange(numA) || !isValidRange(numB)) {
            return false;
        }

        while (numA > 0) {
            int x = numA % 10;

            int tempNum = numB;
            while (tempNum > 0) {
                int y = tempNum % 10;

                if (x == y) {
                    return true;
                }

                tempNum /= 10;
            }

            numA /= 10;
        }

        return false;
    }

    public static boolean isValidRange(int number) {
        return number >= 10 && number <= 99;
    }


    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,23));
    }

}


