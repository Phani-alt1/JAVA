import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string=in.next();
        int start=0;
        int last=string.length()-1;
        boolean palin=true;
        while(start<last){
            if(string.charAt(start)!=string.charAt(last)){
                palin=false;
                break;
            }
            start++;
            last--;
        }
        if(palin){
            System.out.print(string+" is a palindrome");
        }else{
            System.out.print(string+" is not a palindrome");
        }
        in.close();
    }
}
