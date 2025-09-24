class Solution {
    public boolean wordPattern(String pattern, String s) {
        String stringarr[]=s.split(" ");

        if(pattern.length()!=stringarr.length){return false;}
        Map<Character,String> map=new HashMap<>();
        Set<String>set=new HashSet<>();


          for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=stringarr[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){return false;}
            }
            else{
                if(set.contains(word)){ return false;}
            }

            map.put(ch,word);
            set.add(word);
              


          }
             return true;


    }
}