package inheritance;

public class StatArrays extends ArrayOps{
    private int x;
    private int y;
    public StatArrays(int[] arrInt, String[] arrString) {
        super(arrInt, arrString);
        x=0;
        x=0;
    }
    int max(){
        int x=arrInt[0];
        for (int i=0;i<super.arrInt.length;i++){
            if (x<arrInt[i]){
                x=arrInt[i];
            }
        }
        return x;
    }
    int min(){
        int y=arrInt[0];
        for (int i=0;i<super.arrInt.length;i++){
            if (y>arrInt[i]){
                y=arrInt[i];
            }
        }
        return y;
    }
    int average(){
        int x=arrInt[0];
        int y=arrInt[0];
        for (int i=0;i<super.arrInt.length;i++){
            if (x<arrInt[i]){
                x=arrInt[i];
            }
            if (y>arrInt[i]){
                y=arrInt[i];
            }
        }
        return (x+y)/2;
    }
    void maxIndex(){
        super.indexFinder(this.max());
    }
}
