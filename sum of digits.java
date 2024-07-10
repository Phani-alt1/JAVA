import java.util.Scanner;
class sumofdigs{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scanner.nextInt();
        int number=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of "+number+" = "+sum);
    }
}
