import java.util.Scanner;

public class logingwadd {



        public static void main(String[] args) {
            String Store_user = "aadarshakhatri1@gmail.com";
            String Store_pass = "adarsha123";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Email address");
            String a = sc.nextLine();
            System.out.println("Enter your password :");
            String b = sc.nextLine();
            if(Store_user.equals(a)){
                if(Store_pass.equals(b)){
                    if(b.length()>=8){
                        if(a.indexOf('@')!=-1){
                            System.out.println("Logged In Sucessfully");
                        }else{
                            System.out.println(" @ is missing");
                        }

                    }else{
                        System.out.println(" Invalid Password");
                    }
                }else{
                    System.out.println("Incorrect Password");
                }
            }else {
                System.out.println("Invalid Email");
            }
        }
    }

