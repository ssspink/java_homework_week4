package java_Homework_week4;

/**Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * * *
 *
 */
public class Left_AngleStar_15

{
    public static void Test15()
    {
        int numRows =5;

        for (int i=0; i<=numRows; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args)
    {
        Test15();
    }
}
