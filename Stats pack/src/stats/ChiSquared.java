package stats;

public class ChiSquared {
    double observed[];
    double expected[];
    double chiSq;

    public ChiSquared(double ob[], double ex[]){
        this.observed = ob;
        this.expected = ex;
        sumOMinusE();
        oMinusESq();
        oMinusESqDivE();
        chiSq();
    }

    public double chiSq(){
        for (int counter5=0;counter5<observed.length;counter5++){
            chiSq=chiSq+observed[counter5];
        }
        return chiSq;
    }

    private void sumOMinusE(){
        for (int counter2=0;counter2<observed.length;counter2++){
            observed[counter2]=observed[counter2]-expected[counter2];
        }
    }

    private void oMinusESq(){
        for (int counter3=0;counter3<observed.length;counter3++){
            observed[counter3]=Math.pow(observed[counter3], 2);
        }
    }

    private void oMinusESqDivE(){
        for (int counter4=0;counter4<observed.length;counter4++){
            observed[counter4]=observed[counter4]/expected[counter4];
        }
    }
}
