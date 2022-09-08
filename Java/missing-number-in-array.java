    int MissingNumber(int array[], int n) {
        int sum=(n+1)*(n)/2;
        for(int i=0;i<array.length;i++){
            sum-=array[i];
        }
        return sum;
    }
