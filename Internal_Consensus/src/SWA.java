public class SWA {

    char[] seq1 = {'X', 'A', 'T', 'T', 'G', 'G', 'G', 'C', 'A', 'C', 'A', 'T', 'T', 'G', 'G', 'G', 'A', 'T', 'T'};
    char[] seq2 = {'X', 'A', 'T', 'T', 'G', 'G', 'G', 'A', 'T', 'G', 'A', 'T', 'T', ' ', ' ', ' ', ' ', ' ', ' '};
    public int[][] score = new int[seq1.length][seq2.length];

    public void buildMatrix() {
        score[0][0] = 0;
        for (int i = 1; i < seq1.length; i++) {
            score[i][0] = score[i - 1][0] + -2;
        }
        for (int j = 1; j < seq2.length; j++) {
            score[0][j] = score[0][j - 1] + -2;
        }
        for (int i = 1; i < seq1.length; i++) {
            for (int j = 1; j < seq2.length; j++) {
                if (seq1[i] == seq2[j]) {
                    if (Math.max(score[i - 1][j] + -2, score[i][j - 1] + -2) > score[i - 1][j - 1] + 5) {
                        score[i][j] = Math.max(score[i - 1][j] + -2, score[i][j - 1] + -2);
                    } else {
                        score[i][j] = score[i - 1][j - 1] + 5;
                    }
                    if (seq1[i] != seq2[j]) {
                        if (Math.max(score[i - 1][j] + -2, score[i][j - 1] + -2) > score[i - 1][j - 1] + -1) {
                            score[i][j] = Math.max(score[i - 1][j] + -2, score[i][j - 1] + -2);
                        } else {
                            score[i][j] = score[i - 1][j - 1] + -1;
                        }
                    }
                }
            }
        }
    }
    public void traceBack() {
        /*Go backwards through the matrix. What char is added to "align" is based on the max value in
        the surrounding cells
         */
        String align = "";
        for (int i = seq1.length; i > 0; i--) {
            for (int j = seq2.length; j > 0; j--){

            }
        }
        System.out.println(align);
    }

    public void display(int[][]x){
        for (int row = 0; row < x.length; row++){
            for (int column = 0; column < x[row].length; column++){
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
