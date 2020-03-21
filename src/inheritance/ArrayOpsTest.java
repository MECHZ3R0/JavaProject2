package inheritance;

public class ArrayOpsTest {
    public static void main(String[] args) {
        int[] arrInt={1,2,3,4,5,6,7};
        String[] arrStr = {"asdasdc","afwqe", "xsdfan", "sdfhg"};
        ArrayOps x = new ArrayOps(arrInt, arrStr);
        StatArrays y = new StatArrays(arrInt,arrStr);
        x.indexFinder(3);
        x.indexFinder("afwqe");
        System.out.println(y.max());
        System.out.println(y.min());
        System.out.println(y.average());
        y.maxIndex();
    }
}
