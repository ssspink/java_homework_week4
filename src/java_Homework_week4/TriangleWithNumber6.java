package java_Homework_week4;

import java.util.Scanner;

/**Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 *
 */
public class TriangleWithNumber6
{
       public void Test6(){
           int num =10;
           Scanner in =new Scanner(System.in);
           System.out.println(" Input the number of raw:   ");
           num =in.nextInt();
           // loop for rows
            for(int i=1; i<=num; i++){

                     for(int j=1;j<=i;j++){

                            System.out.print(j);

                }
                                 System.out.println(" ");
              }
       }

       public static void main(String[] args)
    {
        TriangleWithNumber6 t1 =new TriangleWithNumber6();
        t1.Test6();
    }


}
