package java_Homework_week4;

/**Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@*
 */
public class Right_triangle8
{
    public void Test8()
    {

            for (int i =1 ;i<=5 ;i++)
            {
                    for(int j= 1; j <=i; j++){
                        System.out.print("&");
                    }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        Right_triangle8 r1 =new Right_triangle8();
        r1.Test8();
    }

}
