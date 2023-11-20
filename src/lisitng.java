import java.util.Scanner;
public class lisitng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String aa = sc.nextLine();
        String a = aa.toLowerCase();

        for (int i=0;i<a.length();i++) {


            System.out.println("The element is " +a.charAt(i));

        }



    }
}
