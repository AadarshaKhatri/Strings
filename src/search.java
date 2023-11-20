import java.util.Scanner;
import java.lang.String;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String aa = sc.nextLine();
        String a = aa.toLowerCase();
        System.out.println("Your string is " + a );
        System.out.println("Enter the character:");
        String bb = sc.nextLine();
        String b = bb.toLowerCase();
        int c = a.indexOf(b);
        System.out.println("Your character " + b + " lies at : " + c );


    }
}
