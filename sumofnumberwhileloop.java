import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        int sum=0;
        int count=0;
        while(count<num+1){
            sum+=count;
            count++;
        }
        System.out.print("Sum of numbers till "+num+" is "+sum);
    }
}
