import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fact = 1;
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+ fact);
    }
}
