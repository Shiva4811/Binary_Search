class SearchInRotatedArray{
    public static void main(String args[]){
        int[] arr={7,8,9,0,1,2,3,4,5,6};
        int target=9;
        int n=arr.length;
        int lo=0, hi=n-1;
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
        if(arr[mid]==target) {
            flag=true;
            break;
        }
            else if(arr[mid]<=arr[hi]){ // if mid element is in the right side sorted array .... i.e, 0-6
                if(target>arr[mid] && target<=arr[hi]){ // if the target element is in between 0-6
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            else if(arr[mid]>arr[hi]){  //if mid element is in the left side sorted array .....i.e, 7-9
                if(target>=arr[lo] && target<arr[mid]){   //if the target element is in between 7-9
                    hi=mid-1;
                }
                else lo=mid+1;
            }
        }
        if(flag==true){
            System.out.println("Element is found!");
        }
        else System.out.println("Element is not found!");
    }
}