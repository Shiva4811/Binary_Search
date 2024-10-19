import java.util.Scanner;
class SquareRoot{
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number: ");
            int num=sc.nextInt();
           
            // double a= Math.sqrt(num);
            // System.out.println("Square root of this number is: "+a);
            int low=-1;
            int lo=0; int hi=num;
            while(hi>=lo){
                int mid=lo+(hi-lo)/2;
                if(mid*mid==num)  {
                    low=mid;
                    break;

                }
                else if(mid*mid>num){
                    hi=mid-1;
                    low=mid;
                }
                else if(mid*mid<num){
                    lo=mid+1;
                    low=mid;
                }
            }
            System.out.println(low);

    }
}