    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        int max=-10000000, curr=0;
        for (int i=0;i<n;i++) {
            curr+=arr[i];
            if(max<curr) {
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
