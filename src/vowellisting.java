import java.util.Scanner;

public class vowellisting {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String aa = scc.nextLine();
        String a = aa.toLowerCase();
        for (int i=0;i<a.length();i++) {
            if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                System.out.println("The element is " + a.charAt(i));

            } else {

            }

        }
    }
}
