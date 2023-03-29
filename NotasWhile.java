import java.util.*;
public class NotasWhile {
    public static void main(String args[]) {
     Scanner b = new Scanner(System.in);
        int i=1,nmat,con1,con;
        float prom=0,n1,ef;
        String mat;
        System.out.println("Ingrese el numero de materias vistas en el semestre:");
        nmat = b.nextInt();   
        while(i <= nmat){
          System.out.println("Ingrese el Nombre de la materia Numero "+i+":");
          mat = b.next();
          con=1;
         con1=3;
         float nota=0;
            while(con <= con1){
                System.out.println("Ingrese la nota numero "+con+":");
                n1 = b.nextFloat();
                nota += n1;
                con++;
            }
            nota /= 3;
            nota *= 0.70;
            System.out.println("ingrese la nota del examen final: ");
            ef = b.nextFloat();
            ef *= 0.30;
            nota += ef;
            System.out.println("La definitiva de la materia "+mat+" Es: "+nota);
            prom += nota;
            i++;
        }
        System.out.println("El promedio Ponderado es de: "+prom/nmat);
    }
}