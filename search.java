import java.util.Arrays;
class search{
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int n=a.length;
        int k=3;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.print("Element found at index : "+i);
            }
        }
    }
}
