import java.util.arrays;

public class Convolution{
    public static void main(String[] args){

        int TC = 0;//test cases
        int TCP = 0;//test cases passed

        int[] f1 = new int[]{3,1,4,1,5};
        int[] k1 = new int[]{0,1,1,0,0};
        int[] out = convol(f1, k1);

        TC++;
        if(out[0] == 5 && out[1] == 5 && out[2] == 6 && out[3] ==5 && out[4] == 0)TCP++;

        System.out.println();
        System.out.println("Passed: "+TCP+"/"+TC+" test cases.");
        System.out.println();

    }

    public static int[] convol(int[] func, int[] kernal){
        int[] out = new int[func.length];
        for (int i = 0; i<5; i++){//i = offset
            for(int k = 0; k<5; k++){
                out[i] += func[k]*kernal[k];
            }
            for (int j = kernal.length-1; j > 0; j--) {//shift the kernal by 1
                kernal[j] = kernal[j-1];
            }
            kernal[0] = 0;//fill the "gap" with zeros from the shift
        }
        return out;
    }
}