    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>(2);
        
        int cSum,i,j;
        for (i = 0; i < n; i++) {
            cSum = arr[i];
            for (j=i+1; j<=n; j++){
                if(cSum==sum) {
                    result.add(i+1);
                    result.add(j);
                    return result;
                }
                if(cSum > sum || j==n) {
                    break;
                }
                cSum += arr[j];
            }
        }
        result.add(-1);
        return result;
    }
