import java.util.Scanner;
class lcm{
    public static void main(String[] args){
        int a=12;
        int b=30;
        int lcm=LCM(a,b);
        int gcd=GCD(a,b);
        System.out.println("LCM = "+lcm);
        System.out.println("GCD = "+gcd);
    }
    public static int LCM(int a,int b){
        return (a*b)/GCD(a,b);
    }
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
    
}
