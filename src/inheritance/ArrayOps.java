package inheritance;

public class ArrayOps {
    protected int[] arrInt;
    protected String[] arrString;

    public ArrayOps(int[] arrInt, String[] arrString) {
        this.arrInt = arrInt;
        this.arrString = arrString;
    }

    public void indexFinder(int indexI){
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i]==indexI) System.out.println(i);
        }
    }
    public void indexFinder(String indexS){
        for (int i=0;i<arrString.length;i++){
            if (arrString[i].equalsIgnoreCase(indexS)) System.out.println(i);
        }
    }
}
