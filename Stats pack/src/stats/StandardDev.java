package stats;

public class StandardDev {
    private double numbers[];
    private double sum;
    private double average;
    public double aveSqDist;
    private double sum2;

    public StandardDev(double[] d) {
        this.numbers = d;
        sumNums();
        getAverage();
        squareDist();
        sumSquaredNums();
        averageOfSquaredDists();
        stdv();
    }


    private void sumNums() {
        for (int counter=0;counter<numbers.length;counter++){ //makes the sum of numbers[]//
            sum=sum+numbers[counter];
        }
    }

    private void getAverage() {
        average=sum/numbers.length;
    }

    private void squareDist() {
        for (int counter2=0;counter2<numbers.length;counter2++){ //makes the squared distances//
            numbers[counter2]=Math.pow(numbers[counter2]-average, 2);
        }
    }

    private void sumSquaredNums() {
        for (int counter3=0;counter3<numbers.length;counter3++){ //makes the sum of squared distances represented by numbers[]//
            sum2=sum2+numbers[counter3];
        }
    }

    private void averageOfSquaredDists() {
        aveSqDist=sum2/numbers.length; //average of squared distances//
    }

    private void stdv(){
        aveSqDist=Math.sqrt(aveSqDist);//makes the SD//
    }
}
