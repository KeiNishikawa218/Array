import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args){
        int[] src1 = {8, 2, 3, 4, 7};
        int[] src2 = {18, 23, 100};

//        int[] dst = new int[src1.length+src2.length];
//        System.arraycopy(src1, 0, dst, 0, src1.length);
//        System.arraycopy(src2,0, dst, src1.length, src2.length);

//        System.out.println(Arrays.toString(dst));

//        Arrays.fill(dst, 0);

//        System.out.println(Arrays.toString(dst));

        IntStream stream1 = Arrays.stream(src1);
        IntStream stream2 = Arrays.stream(src2);

        IntStream stream3 = IntStream.concat(stream1, stream2);
        int[] dst = stream3.toArray();
        System.out.println(Arrays.toString(dst));

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(Arrays.equals(a,b));
    }
}
