public class Main {

    public static void main (String[] args){
        Finder finder = new Finder();
        SWA smith = new SWA();
        smith.buildMatrix();
        smith.display(smith.score);
        //smith.traceBack();
    }
}
