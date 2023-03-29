import java.util.*;
public class potencia {
    public static void main(String args[]) {
        Scanner b = new Scanner (System.in);
        double n,w,p;
        System.out.println("Ingrese el valor de N: ");
        n=b.nextDouble();
        System.out.println("Ingrese el valor de W:  ");
        w=b.nextDouble();
        p=Math.pow(n, w);
        System.out.println("la potencia es "+p);
    }
}
