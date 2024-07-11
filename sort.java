import java.util.Arrays;
class ArmstrongNumber {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int n=a.length;
        Arrays.sort(a);
        System.out.print("{");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("}");
    }
}
