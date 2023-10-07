package BinarySearch;

public class searchindex {
    public static int binary(int[]arr,int n,int target) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
        public static void main(String[] args) {
            int arr[]={1,3,5,7,9};
            int n=arr.length;
            int target=9;
            int ans=binary(arr,n,target);
            System.out.println(ans);
        }

}
