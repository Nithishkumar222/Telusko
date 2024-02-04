package telusko_package;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first input");
        int num1=sc.nextInt();
        System.out.println("enter second input");
        int num2=sc.nextInt();
        System.out.println("Enter any operator +,-,*,%,/");
        char operator = sc.next().charAt(0);
        int res=0;
        switch(operator) {
        case '+':
        	res=num1+num2;
        	break;
        case '-':
        	res=num1-num2;
        	break;
        case '*':
        	res=num1*num2;
        	break;
        case '%':
        	res=num1%num2;
        	break;
        case '/':
        	res=num1/num2;
        	break;
        default:
        	System.out.println("Wrong input");
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+ res);
	}

}
