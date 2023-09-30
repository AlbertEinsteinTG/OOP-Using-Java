import java.util.Scanner;

class sumAverage {
    public static void main(String args[]){

        int sum=0;
        float avg;
        Scanner s  = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        System.out.print("Enter the third number: ");
        int c = s.nextInt();
        
        sum = a+b+c;
        avg = sum/3;

        System.out.println("Sum = "+ sum +"\nAverge = "+ avg);

    }
}
