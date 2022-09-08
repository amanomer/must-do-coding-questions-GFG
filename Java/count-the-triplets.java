    int countTriplet(int arr[], int n) {
        int max = 0, ans=0;
        for(int i =0; i<n; i++) {
            max = (arr[i]>max) ?arr[i] :max;
        }
        int[] freq = new int[max+1];
        for(int i =0; i<n; i++) {
            freq[arr[i]]++;
        }
        for(int i=0; i<=max;i++) {
            if (freq[i]==0) {
                continue;
            }
            for(int j=i+1; i+j<=max; j++) {
                ans+= freq[i] * freq[j] * freq[i+j];
            }
        }
        return ans;
    }
