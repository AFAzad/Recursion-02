/*Print all the subsequences [abc] */
public class SubsequencesStr {

    public static void subsequences(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currCh = str.charAt(idx);

        // to be add ch
        subsequences(str, idx+1, newString+currCh);

        //not be add ch
        subsequences(str, idx+1, newString);


    }
    public static void main(String[] args){
        System.out.println("The new String is: ");

        String str = "abc";

        subsequences(str, 0, "");        
    }
    // Time complexity: O(2^n)
}
