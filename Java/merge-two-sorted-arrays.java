//Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=n-1, j=0;
        if(arr1[i] < arr2[j]) {
            return;
        }
        
        while(j<m && i>=0) {
            if(arr1[i] > arr2[j]) {
               swap(arr1, arr2, i, j); 
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void swap(long arr1[], long arr2[], int i, int j) {
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
