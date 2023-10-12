import java.util.Scanner;
class prime {
    public static void main(String args[]){
        int a, i, flag=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Input the no: ");
        a = s.nextInt();

        for (i=2; i<a/2; i++){
            if (a%i==0){
                flag=1;
                break;
            }
        }

        if (flag == 1){
            System.out.println("Is not prime...!");
        }else{
            System.out.println("Is Prime...!");
        }


    }
}
