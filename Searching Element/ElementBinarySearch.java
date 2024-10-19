class ElementBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,23,44,55,65,78,90};
        int target=66;
        int n=arr.length;
        int lo=0; int hi=n-1;
        boolean flag=false;
        System.out.println("hii");
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target) {
                flag=true;  
                break;
            }
            else if(arr[mid]<target){
                    lo=mid+1;
            }
            else if(arr[mid]>target) hi=mid-1;
        }
        if(flag==true) 
        System.out.println("Target element found.");
        else 
        System.out.println("Target element not found.");
    }
}
