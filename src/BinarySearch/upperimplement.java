package BinarySearch;

public class upperimplement {
    public static int li(int[]arr,int n,int target){
        n=arr.length;
        int start=0;
        int end=n-1;
        int ans=arr.length;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={1,2,2,3};
        int n=arr.length;
        int target=2;
        int ans1=li(arr,n,target);
        System.out.println(ans1);
    }
}

