package java_Homework_week4;

/**
 *Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 */
public class Fibonacci_Number9
{

    public void Test9()
    {
        int n = 9, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args)
    {
        Fibonacci_Number9 f1 =new Fibonacci_Number9();
        f1.Test9();
    }
}
