class Solution {
    ArrayList<String> al = new ArrayList<>();
    HashSet<String> hs = new HashSet<>();
    
    public List<String> find_permutation(String S) {
        // Code here
        permute(S,"");
        for(String s:hs) {
            al.add(s);
        }
        Collections.sort(al);
        return al;
    }
    
    public void permute(String S, String ans) {
        if(S.length()==0) {
            hs.add(ans);
            return;
        }
        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            String rem=S.substring(0,i) + S.substring(i+1);
            permute(rem, ans+c);
        }
    }
}
