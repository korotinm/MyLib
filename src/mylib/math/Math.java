package mylib.math;

/**
 * @author M.Korotin
 *         Date: 10.07.11
 *         Time: 23:12
 */
public class Math {

    private Math(){
    }

    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c){
        if(a < b){
            if(a < c){
                return a;
            }
        }else{
            if(b < c){
                return b;
            }
        }
        return c;
    }

}
