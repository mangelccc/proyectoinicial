import java.util.Scanner;
public class GitNotasAlumnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.print("Introduzca la nota: ");
        nota = entrada.nextInt();
        if (nota <= 10 && nota >= 9){
            System.out.println("Sobresaliente");
        } else if (nota < 9 && nota > 7){
            System.out.println("Notable");
        } else if (nota < 7 && nota >= 6){
            System.out.println("Bien");
        }else if (nota < 6 && nota >= 5){
            System.out.println("Suficiente");
        }else if (nota < 5 && nota >= 0){
            System.out.println("Suspendido");
        }else {
            System.out.println("Error,vuelvalo a intentar");
        }
        }    
    }
