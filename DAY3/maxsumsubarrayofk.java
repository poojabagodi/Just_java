package DAY3;

public class maxsumsubarrayofk {
    public static int maxsubarray(int arr[],int k){
        int n=arr.length;
        int maxsum=0;
        int wind=0;
        for(int i=0;i<k;i++){
            wind+=arr[i];
        }
        maxsum=wind;
        for(int i=k;i<n;i++){
            wind+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,wind);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[]={5,3,6,7,3,5,6};
        int k=3;
        System.out.println(maxsubarray(arr,k));
    }
}
