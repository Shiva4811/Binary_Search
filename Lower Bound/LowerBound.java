class LowerBound{
    public static void main(String args[]){
        int[] arr={1,3,3,7,8,9,22,44,55,66,66};
        int target=66;
        int n=arr.length;
        int lb=n;
        int lo=0; int hi=n-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(n, mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}