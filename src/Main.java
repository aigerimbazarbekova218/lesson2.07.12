import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("ОЗГОРМОНУН ОРДУН АЛМАШТЫРГАН ЖАВА КОД ЖАЗЫНЫЗ");
        int a=20;
        int b=30;
        System.out.println("a="+a);
        System.out.println("b="+b);


        System.out.println("a="+(a+b-a));
        System.out.println("b="+(b+a-b));

        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

        System.out.println("КОНСОЛГО АЙЛАНАНЫН АЯНТЫН ЖАНА ПЕРИМЕТРИН ЧЫГАРА ТУРГАН ЖАВА КОД ЖАЗЫНЫЗ");
        double PI=3.14;
        int dia=15;
        double r=dia/2;
        double S=0;
        double Per=0;

        S=PI*r*r;
        System.out.println("аянты="+S);
        Per=2*r*PI;
        System.out.println("Периметри="+Per);

        System.out.println("Консолго сандардын орточо ариметикалык маанисин чыгара турган жава код жазыныз");
        int d=20;
        int f=38;
        int q=18;
        int e=45;
        int t=55;
        int sum=d+f+q+e+t;
        int ortSun=sum/5;
        System.out.println("Арифметикалык орточо сан="+ortSun);




    }
}