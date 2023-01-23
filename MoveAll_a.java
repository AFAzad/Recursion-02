/*Move All a to the end of the String(abagacd) */
public class MoveAll_a {
    
    public static void moveAllA(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'a';
            }
            System.out.println(newString);
            return;
        }
        char crrChar = str.charAt(idx);
        if(crrChar == 'a'){
            count++;
            moveAllA(str, idx+1, count, newString);
        }else{
            newString += crrChar;
            moveAllA(str, idx+1, count, newString);
        }
    }

    public static void main(String args[]){
        String str = "abagacad";
        moveAllA(str, 0, 0, "");
    }
}
