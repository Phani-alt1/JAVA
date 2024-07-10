import java.util.Scanner;
class evenandodd{
    public static void main(String[] args){
        int n=10;
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }
        }
        System.out.println("Sum of even numbers = "+evensum);
        System.out.println("Sum of odd numbers = "+oddsum);
    }
}
