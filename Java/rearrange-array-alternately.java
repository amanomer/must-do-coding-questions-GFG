    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        int low=0; 
        int high=n-1;
        long ar[]=new long[n];
        int index=0;
        int mid=n/2;
        if(n>1){
        while(low<high){
            ar[index++]=arr[high--];
            ar[index++]=arr[low++];
        }
        if(n%2!=0){
            ar[n-1]=arr[mid];
        }
        for(int i=0; i<n; i++){
            arr[i]=ar[i];
        }
        }
    }
    
