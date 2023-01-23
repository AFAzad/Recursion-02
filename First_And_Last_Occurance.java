/*Find the First and Last Occurance of an element in String */
public class First_And_Last_Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println("First Occurance at index : "+first);
            System.out.println("Last Occurance at index : "+last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
   public static void main(String[] args){
    String str = "cbaacdeafaahaii";

    findOccurance(str,0,'a');

    /*Time compexity is: O(n) */
} 
}
