import java.util.*; //importar clases
public class CaracterLength {
    public static void main(String args[]) {
        calcularlolo();
        //int pp=4; va a imprimir el entero
        String pp="3223"; //imprime el valor de pp
        System.out.println("La cantidad de caracteres que tiene la cadena es: "+pp);
        
    }
    
    
    public static void  calcularlolo(){
            Scanner b = new Scanner (System.in);
        System.out.println("Digite una cadena de caracteres: ");
        String cadena=b.nextLine();
        int pp=cadena.length();
        System.out.println("La cantidad de caracteres que tiene la cadena es: "+pp);
        }
}
