/*RULES: 1. Only one disk transfered in one time
         2. Smaller disks are always kept on top of larger disks
 */
// import java.util.*;

public class Tower_of_Honoi{
    public static void towerOfHonoi(int n, String src, String helper, String dest){
        if(n ==1){
            System.out.println("Transfer disk " +n+ " from "+src+" to "+dest);
            return;
        }
        towerOfHonoi(n-1,src, dest, helper);
        System.out.println("Transfer disk " +n+ " from "+src+" to "+dest);
        towerOfHonoi(n-1, helper,src, dest);

    }
    public static void main(String[] args){

        int n = 3;

        towerOfHonoi(n, "S", " H", "D");

    }
}
