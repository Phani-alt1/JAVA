import java.util.Arrays;
class SecondLargest {
    public static void main(String[] args){
     int a[]={1,2,3,4,5};
    int n=a.length;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
    }
    int avg=sum/n;
    System.out.print("Average : "+avg);
    }
}