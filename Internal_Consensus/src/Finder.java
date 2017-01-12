public class Finder {

    char[] forward = {'A', 'T', 'T', 'T', 'T', 'G', 'C', 'C', 'A', 'A', 'A', 'A', 'T'};
    char[] reverse = new char[forward.length];
    char[] comp = new char[forward.length];

    public Finder() {
        getReverse();
        complement();
        System.out.println(forward);
        System.out.println(comp);
        System.out.println(reverse);
    }

    public void getReverse() {
        int counter = 0;
        for (int counter2 = forward.length-1; counter2 >= 0; counter2--) {
            reverse[counter2] = forward[counter];
            counter++;
        }
    }

    public void complement(){
        for (int counter = 0; counter < forward.length; counter++) {
            switch (forward[counter]) {
                case 'A':
                    if (reverse[counter] != 'T') {
                        comp[counter] = ' ';
                    } else {
                        comp[counter] = '|';
                    }break;
                case 'T':
                    if (reverse[counter] != 'A') {
                        comp[counter] = ' ';
                    } else {
                        comp[counter] = '|';
                    }break;
                case 'G':
                    if (reverse[counter] != 'C') {
                        comp[counter] = ' ';
                    } else {
                        comp[counter] = '|';
                    }break;
                case 'C':
                    if (reverse[counter] != 'G') {
                        comp[counter] = ' ';
                    } else {
                        comp[counter] = '|';
                    }break;
            }
        }
    }
}
