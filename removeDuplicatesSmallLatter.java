public class removeDuplicatesSmallLatter {
    public static void removeDuplicatesSmallLatter(String str , int idx, StringBuilder newStr , boolean map []){
        if (idx == str.length()){
         System.out.println(newStr);
         return;
        }
        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar-'a']== true){
            removeDuplicatesSmallLatter(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicatesSmallLatter(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String s="aabcc";
        
        removeDuplicatesSmallLatter(s,0, new StringBuilder(""),new boolean [26] );
    }
}
