import java.util.Arrays;
class secondlar{
    public static void main(String[] args){
        int a[]={1,5,4,2,8,9};
        int n=a.length;
        Arrays.sort(a);
        System.out.print("Second maximum element is : "+a[n-2]);
    }
}
