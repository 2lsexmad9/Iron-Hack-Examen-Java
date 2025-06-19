import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> deseos = new ArrayList<>();
        String respuesta;
        
        do
        {
            System.out.print("Soy Michael O'leary, antiguo CEO de Ryanair y actual genio de esta cochina y herrumbrosa lámpara de aceite... si puedes pásale un trapo al terminar maj@; te concederé la posibilidad de solicitarme varios deseos, pero solo escogeré uno al azar; antes de que me preguntes, ya me han dado el visto bueno desde la Unión Europea. Esto es lo que hay, es el mercado amigo!: ");
            deseos.add(scanner.nextLine());
            
            do
            {
                System.out.print("Quieres otro deseo? especifica \"S\" o \"N\", también puedes quedarte en la inopia, si es lo que quieres, ese corre a cuenta de la casa: ");
                respuesta = scanner.nextLine().toUpperCase();
                
                if (!respuesta.equals("S") && !respuesta.equals("N"))
                System.out.println("Ennnng! respuesta incorrecta, no intentes pasarte de listill@, que aquí no hay hoja de reclamaciones \"S\" o \"N\"");
            }
            
            while (!respuesta.equals("S") && !respuesta.equals("N"));
        }

        while (respuesta.equals("S"));

        Random random = new Random();
        String deseoElegido = deseos.get(random.nextInt(deseos.size()));
        System.out.println("Te has lucido, eso son como " + deseos.size() + " deseos, y te concedo el siguiente: " + deseoElegido);
        
        scanner.close();
    }
}