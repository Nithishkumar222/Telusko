package telusko_package;
import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter principal amount");
    	int principal_amount=sc.nextInt();
    	System.out.println("Enter number of years");
    	int time=sc.nextInt();
    	System.out.println("Enter rate of interest");
        int roi = sc.nextInt();
        int simple_interest = principal_amount * time * roi /100;
        System.out.println(simple_interest);
    }
}
