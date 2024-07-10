import java.util.Scanner;
class perfectnum{
    public static boolean perfect(int n){
        int sum=0;
        int number=n;
        while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        if(sum==number){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int n=10;
        if(perfect(n)){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
