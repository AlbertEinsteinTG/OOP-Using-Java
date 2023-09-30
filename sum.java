import java.util.Scanner;

class sum 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        int c = a+b;

        System.out.println("Sum = " + c);

    }
}
