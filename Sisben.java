import java.util.*;
public class Sisben {
    public static void main(String args[]) {
         Scanner b = new Scanner (System.in);
         double smlmv, bono1, bono2,bono3,valort, hm;
         String nsisben,sisben;
        smlmv=1160000;
        bono1=50000;
        bono2=40000;
        bono3=30000;
        
        System.out.println("Digite el nivel de sisben al que pertenece");
        System.out.println("a. Para A1: ");
        System.out.println("b. Para B1: ");
        System.out.println("c. Para C1: ");
        System.out.println("otro caracter para otras opciones ");
        
        sisben=b.nextLine();
        //nsisben=sisben.toUpperCase(); //convertir a mayusculas
        nsisben=sisben.toLowerCase();   //convertir a minusculas
        System.out.println("ingrese total de menores");
        hm=b.nextDouble();
        
        switch (nsisben){
            case "a": {
            valort=(smlmv*0.5)+(hm*bono1);
              System.out.println("recibe un total de: " +valort);
                break;}
        
             case "b": {
                 valort=(smlmv*0.4)+(hm*bono2);
                 System.out.println("recibe un total de: " +valort);
            break;}
        
            case "c": {
                valort=(smlmv*0.3)+(hm*bono3);
                 System.out.println("recibe un total de: " +valort);
                 break;}
        
         default: {
            System.out.println("No tiene derecho a bono");
        }
        
    }
}
}