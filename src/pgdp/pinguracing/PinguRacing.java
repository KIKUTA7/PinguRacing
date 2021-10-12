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

        int x= readInt("Alan starting position:");
        int y=readInt("Bjarne starting position:");
        boolean f=false;
        int t=-1;
        while (t<0) {
        if(f==false) {t=readInt("Race duration:");t=true;}
        else if(t<0) {t=readInt("Please do not enter a negative number:");}
        }
        if(t==0) write("Draw!");
        else{
        int spx=0,spy=0;
int i=0;
while (i<(t/2))
{
    if (x%10==4) {spx=spx / 2 + 1;
        spx = check(spx);
    x+=spx;}
    else {spx+=7;spx = check(spx);x+=spx;}
    if(y%13==0) {spy=spy*2+1;spy = check(spy);y+=spy;
    }
    else {spy+=3;spy = check(spy);y+=spy;}
    System.out.println("t = "+i);
    System.out.println("Alan position = "+x+"; speed = "+spx);
    write("Bjarne position = "+y+"; speed = "+spy);
    i++;
}
while (i<t)
{
    if(i==(t*3)/5 || i==(t*4)/5) {spx=spx/4;spx=check(spx);x+=spx;}
    else if(i==(t*4)/5) {spx=spx/4;spx=check(spx);x+=spx;}
    else {spx++;spx=check(spx);x+=spx;}
    if(i>=t-13) {spy=spy/2;spy=check(spy);y+=spy;}
    else {spy--;spy=check(spy);y+=spy;}
    System.out.println("t = "+i);
    System.out.println("Alan position = "+x+"; speed = "+spx);
    write("Bjarne position = "+y+"; speed = "+spy);
    i++;

}
if(x>y) {write("Alan wins!");}
else if(y>x) write("Bjarne wins!");
else write("Draw!");

}
    }
}
