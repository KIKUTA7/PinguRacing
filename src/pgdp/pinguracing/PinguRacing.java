package pgdp.pinguracing;

import static pgdp.MiniJava.*; //Diesen Import nicht löschen! Do not delete this import!

public class PinguRacing {
        public static int check(int x)
    {
        if(x>128) return 128;
        else if(x<0) return 0;
        else return x;
    }
    public static void main(String[] args) {

        int PosA = readInt("Alan starting position:");
        int PosB = readInt("Bjarne starting position:");
        boolean f = false;
        int t = -1;
        while (t < 0) {
            if (f == false) {
                t = readInt("Race duration:");
                f = true;
            } else {
                t = readInt("Please do not enter a negative number:");
            }
        }
        if (t == 0) write("Draw!");
        else {
            int speA = 0, speB = 0;
            int i = 0;
            while (i < (t / 2)) {

                    if(PosA % 10 ==  -4) {
                        speA = speA / 2 + 1;
                    speA = check(speA);
                    PosA += speA;}
                    else if (PosA % 10 == 4 ) {

                        speA = speA / 2 + 1;
                        speA = check(speA);
                        PosA += speA;
                    } else {
                        speA += 7;
                        speA = check(speA);
                        PosA += speA;
                    }


                if (PosB % 13 == 0) {
                    speB = speB * 2 + 1;
                    speB = check(speB);
                    PosB += speB;
                } else {
                    speB += 3;
                    speB = check(speB);
                    PosB += speB;
                }
                System.out.println("t = " + i);
                System.out.println("Alan position = " + PosA + "; speed = " + speA);
                write("Bjarne position = " + PosB + "; speed = " + speB);
                i++;
            }
            while (i < t) {
                if (i == (t * 3) / 5 || i == (t * 4) / 5) {
                    speA = speA / 4;
                    speA = check(speA);
                    PosA += speA;
                }
                 else {
                    speA++;
                    speA = check(speA);
                    PosA += speA;
                }
                if (i >= t - 13) {
                    speB = speB / 2;
                    speB = check(speB);
                    PosB += speB;
                } else {
                    speB--;
                    speB = check(speB);
                    PosB += speB;
                }
                System.out.println("t = " + i);
                System.out.println("Alan position = " + PosA + "; speed = " + speA);
                write("Bjarne position = " + PosB + "; speed = " + speB);
                i++;

            }
            if (PosA > PosB) {
                write("Alan wins!");
            } else if (PosB > PosA) write("Bjarne wins!");
            else write("Draw!");

        }
    }
}
