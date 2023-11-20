import java.util.Scanner;
import java.lang.String;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String aa = sc.nextLine();
        String a = aa.toLowerCase();
        for (int i=a.length()-1;i>=0;i=i-1) {
            System.out.println( a.charAt(i));


        }


    }
}




