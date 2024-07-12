import java.util.Arrays;
class diagonal {
    public static void main(String[] args){
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int n=a.length;
        int sum=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];
            sum2+=a[i][n-i-1];
        }
        System.out.print("Sum of main diagonal: "+sum);
        System.out.println();
        System.out.print("Sum of another diagonal: "+sum2);
    }
}
