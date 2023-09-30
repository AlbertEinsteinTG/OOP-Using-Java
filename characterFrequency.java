import java.util.Scanner;

class characterFrequency {
    public static void main(String args[]){
        
        String string;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        string = s.nextLine();
        String stringCopy = string.toLowerCase();

        System.out.print("Enter the character to search: ");
        char charToSearch = s.next().charAt(0);
        char charToSearchCopy = Character.toLowerCase(charToSearch);

        char array[] = stringCopy.toCharArray();
        int count = 0;
        for (char ch: array){
            if (ch == charToSearchCopy){
                count++;
            }
        }
        
        System.out.println("The frequency of: " + charToSearch + " in string: " + string + " is: " + count);
    }
}
