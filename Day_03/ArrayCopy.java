import java.util.*;

public class ArrayCopy {
    public static void main(String[] args)
    {
        int[] a= {1,2,3,4};
        int[] b=new int[a.length];

        System.arraycopy(a, 2, b, 2, 2);
        System.out.println(Arrays.toString(b));
    }  
}


// System.arraycopy(src,src_position,des,des_position,length)
// Most Efficient Method for copying values in array