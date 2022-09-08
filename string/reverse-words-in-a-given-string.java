    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] s_arr = S.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i=s_arr.length-1; i>=0; i--) {
            sb.append(s_arr[i]);
            if(i!=0) {
                sb.append('.');
            }
        }
        return sb.toString();
    }
