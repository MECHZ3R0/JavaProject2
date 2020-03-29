package interfaces;

public class Dice implements Dices {
    protected int numberOfFaces;
    protected int biasFactor;
    Dice(int numberOfFaces, int biasFactor){
        this.numberOfFaces=numberOfFaces;
        this.biasFactor=biasFactor;
    }
    public int roll(){
        return ((int)(Math.random()*this.numberOfFaces)+1);
    }
    public int[] rollTwice(){
        return new int[]{roll(),roll()};
    }
    public int[] rollTriple(){
        return new int[]{roll(),roll(),roll()};
    }
    void biasedRoll(){
        if (this.biasFactor>numberOfFaces&&this.biasFactor<0){
            System.out.println("This Bias factor should be between 0 and "+(numberOfFaces+1));
        }
        else {
            System.out.println((int)(Math.random()*(numberOfFaces-biasFactor+1))+biasFactor);
        }
    }
}
