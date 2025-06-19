import java.util.Scanner;

import Clases.DiosesDelOlimpo;
import Clases.DiosesModernos;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        //Dios del olimpo
        System.out.println("Introduce el nombre del dios del olimpo");
        String nombreOlimpo = scanner.nextLine();

        System.out.println("Introduce su edad");
        int edadOlimpo = scanner.nextInt();

        System.out.println("Introduce su grado de fuerza");
        int fuerzaOlimpo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cuál es su poder?");
        String poderOlimpo = scanner.nextLine();

        DiosesDelOlimpo diosOlimpo = new DiosesDelOlimpo(nombreOlimpo, edadOlimpo, fuerzaOlimpo, poderOlimpo);


        //Dios moderno
        System.out.println("Introduce el nombre del dios moderno");
        String nombreModerno = scanner.nextLine();

        System.out.println("Introduce su edad");
        int edadModerno = scanner.nextInt();

        System.out.println("Introduce su grado de fuerza");
        int fuerzaModerno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cuál es su profesion?");
        String profesionModerno = scanner.nextLine();

        DiosesModernos diosModerno = new DiosesModernos(nombreModerno, edadModerno, fuerzaModerno, profesionModerno);

        System.out.println("Las Stats de tu dios del olimpo son: ");
        diosOlimpo.stats();

        System.out.println("Las Stats de tu dios moderno son: ");
        diosModerno.stats();


        scanner.close();
    }
}