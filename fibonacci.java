import java.util.Scanner;
class fib{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        for(int i=0;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
