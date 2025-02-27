import java.util.*;
public class PrincipalAPP {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> eventos = new ArrayList<>();
        HashMap<String, ArrayList<String>> inscripciones = new HashMap<>();
        
        while (true) {
            System.out.println("\n1. Agregar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Inscribirse a un evento");
            System.out.println("4. Mostrar inscripciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
        }
	}
}
