import java.util.Scanner;

class largest 
{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();

        if (a>b){
            System.out.println("Largest number is " + a);
        }else if (b>a){
            System.out.println("Largest number is " + b);
        }else{
            System.out.println("Both numbers are equal");
        }

    }
}
