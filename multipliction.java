import java.util.Scanner;;

class multipliction {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        System.out.println("Enter the size of table: ");
        int size = s.nextInt();
        for (int i=1; i<=size; i++){
            System.out.println(a+"*"+i+"="+ i*a);
        }

    }
}
