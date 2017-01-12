import java.util.Random;

public class Bootstrap {
    Random randomNucleotide = new Random();
    String seq1 = "AAAAAAAAAAA";
    char[] seq2 = new char[seq1.length()];
    int numberOfTests = 5000000;
    double match;
    double probability;

    public void makeRandomSequence(){
        int number;

        for (int counter = 0; counter < seq1.length(); counter++){
            number = randomNucleotide.nextInt(4);
            switch (number){
                case 0: seq2[counter] = 'A';
                    break;
                case 1: seq2[counter] = 'T';
                    break;
                case 2: seq2[counter] = 'G';
                    break;
                case 3: seq2[counter] = 'C';
                    break;
            }
        }
    }
    public void test(){
        for (int i = 1; (i <= numberOfTests); i++){
            makeRandomSequence();
            String s = String.valueOf(seq2);
            if (s.equals(seq1)){
                match = match +1;
            }
        }
        probability = match / numberOfTests;
        System.out.println((int)(match));
        System.out.println(probability);
    }
}