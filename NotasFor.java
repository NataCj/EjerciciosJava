import java.util.*;
public class NotasFor {
    public static void CalculoNT(){
        Scanner x= new Scanner(System.in);
       String nomMat="";
       double n1, n2, n3, e, total,prom=0,def;
       System.out.println("Ingrese numero de Materias");
       
       double nm= x.nextInt();
       for(int i=1;i<=nm; i++){
        System.out.println("Ingrese nombre materia "+i+" :");
        nomMat= x.next();
        System.out.println("ingrese nota 1 ");
        n1= x.nextDouble();
        System.out.println("ingrese nota 2 ");
        n2= x.nextDouble();
        System.out.println("ingrese nota 3 ");
        n3= x.nextDouble();
        System.out.println("ingrese Examen final ");
        e= x.nextDouble();
        
        total=(((n1+n2+n3)/3)*0.7)+(e*0.3);
        prom +=total;
        System.out.println("La definitiva de la materia es: "+prom);
       }
       def=prom/nm;
       System.out.println("El promedio ponderado  "+def);
   }
   public static void main(String args[]){
      CalculoNT();
   }
}
