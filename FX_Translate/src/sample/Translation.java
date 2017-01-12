package sample;

public class Translation {

    public String protSeq;

    public void translate(String string) {
        char[] transSeq = string.toCharArray();
        protSeq = "";
        for (int counter = 0; counter < transSeq.length; counter += 3) {
            if (counter>0 && counter %10 == 0){
                protSeq = protSeq + "\n";
            }
            switch (transSeq[counter]) {
                case 'U':
                    if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Phe";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Phe";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Tyr";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Tyr";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Stop";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Stop";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Cys";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Cys";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Stop";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Trp";
                    }break;

                case 'C':
                    if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Leu";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Pro";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Pro";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Pro";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Pro";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "His";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "His";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Gln";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Gln";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Arg";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Arg";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Arg";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Arg";
                    }break;

                case 'A':
                    if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Ile";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Ile";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Ile";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Met";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Thr";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Thr";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Thr";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Thr";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Asn";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Asn";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Lys";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Lys";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Ser";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Arg";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Arg";
                    }break;

                case 'G':
                    if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Val";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Val";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Val";
                    }else if (transSeq[counter+1] == 'U' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Val";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Ala";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Ala";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Ala";
                    }else if (transSeq[counter+1] == 'C' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Ala";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Asp";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Asp";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Glu";
                    }else if (transSeq[counter+1] == 'A' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Glu";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'U') {
                        protSeq = protSeq + "Gly";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'C') {
                        protSeq = protSeq + "Gly";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'A') {
                        protSeq = protSeq + "Gly";
                    }else if (transSeq[counter+1] == 'G' && transSeq[counter+2] == 'G') {
                        protSeq = protSeq + "Gly";
                    }break;
            }
        }
    }
}
