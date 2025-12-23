import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char opr;
        int n1,n2;
        System.out.println("'+'-Addition \n '-'-Subtraction \n '*'-Multiplication \n '/'-Divide");
        System.out.print("Enter 1st number: ");
        n1= sc.nextInt();
        System.out.print("Enter the operator: ");
        opr= sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        n2= sc.nextInt();
        double res=0;
        switch (opr) {
            case '+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            case '/':
                res=n1/n2;
                break;
        }
        System.out.print("Result: "+res);
    }
}