import java.util.Scanner;
class factors{
    public static void main(String[] args) {
        int n=100;
        int count=0;
        for(int i=1;i<=100;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
