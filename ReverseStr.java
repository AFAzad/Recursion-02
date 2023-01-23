public class ReverseStr {
     public static void strReverse(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        strReverse(str, index-1);
     }

    public static void main(String[] args){
        String str = "a i d n i";
        System.out.println("Original String is : "+str);
        System.out.print("After reverse : ");
        strReverse(str, str.length()-1);
    }
    // time compexity : O(n)
}
