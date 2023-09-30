import java.util.Scanner;

class palindrome
{
    public static void main(String args[])
    {
        String orginal, ogCopy;
        Scanner s = new Scanner(System.in);
        int flag = 1;

        System.out.print("Enter the string: ");
        orginal = s.nextLine();
        ogCopy = orginal.toLowerCase();
        int stringLen = ogCopy.length();

        for(int i=0; i<stringLen; i++){
            if (ogCopy.charAt(i) != ogCopy.charAt(stringLen-i-1)){
                flag = 0;
                break;
            }
        }
        
        if (flag == 1){
            System.out.println("The given string: " + orginal +" is palindrome...!");
        }else{
            System.out.println("The given string: " + orginal + " is not palindrome...!");
        }
    }

}
