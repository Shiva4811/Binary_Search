public class UpperBound {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,24,45,67};
        int target=67;
        int n=arr.length;
        int hb=n;                   //higher bound
        int lo=0; int hi=n-1;           //lower and higher index of array
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                hb=Math.min(n, mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(hb);
    }
}
