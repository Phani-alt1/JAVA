import java.util.Scanner;
class NumberPattern {
    public static void main(String[] args) {
        int num=123;
        int rem=0;
        while(num>0){
            int r=num%10;
            rem=rem*10+r;
            num=num/10;
        }
        System.out.print(rem);
    }
}
