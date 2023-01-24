import java.util.HashSet;
public class Combination_Keypad {
   public static String[] keypad ={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
   
   public static void printComb(String str, int idx, String combination){
    if(idx == str.length()){
        System.out.println(combination);
        return;
    }
    char currentCh = str.charAt(idx);
    String maping = keypad[currentCh - '0'];

    for(int i=0; i <maping.length(); i++){
        printComb(str, idx+1, combination+maping.charAt(i));
    }
   }

   public static void main(String[] args){

    String str = "23";
    printComb(str, 0, "");
    }

}
