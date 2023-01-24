import java.util.HashSet;

/*Print all the unique subsequences of a string */
public class Unique_SubsequencesStr {

    public static void unSubsequences(String str, int idx, String newString, HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);

            }
            return;
        }

        char currCh = str.charAt(idx);


        // to be add ch
        unSubsequences(str, idx+1, newString+currCh,set);

        //not be add ch
        unSubsequences(str, idx+1, newString, set);


    }
    public static void main(String[] args){
        System.out.println("The new String is: ");

        String str = "aaa";

        HashSet<String> set = new HashSet<>();

        unSubsequences(str, 0, "", set);        
    }
}
