import java.util.Scanner;
import javax.swing.text.html.Option;
public class GitOperaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,opcion;
        System.out.print("Introduïu el primer número: ");
        numero1=entrada.nextInt();
        System.out.print("Introduce el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("1:Suma");
        System.out.println("2:resta");
        System.out.println("3:multiplicacion");
        System.out.println("4:Division");
        System.out.println("Introduze la opcion: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado es " + (numero1+numero2));
                break;
            case 2:
                System.out.println("El resultado es " + (numero1-numero2));
                break;
            case 3:
                System.out.println("El resultado es " + (numero1*numero2));
                break;
            case 4:
                System.out.println("El resultado es " + (numero1/numero2));
                break;
            default:
                System.out.println("Porfavor introduzaca una opcion del 1 al 4");
                break;
            }
        }    
    }
