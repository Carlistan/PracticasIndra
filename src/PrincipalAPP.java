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
            
            switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del evento: ");
                String evento = scanner.nextLine();
                eventos.add(evento);
                inscripciones.put(evento, new ArrayList<>());
                System.out.println("Evento agregado con éxito.");
                break;
            case 2:
                System.out.println("\nLista de eventos:");
                for (int i = 0; i < eventos.size(); i++) {
                    System.out.println((i + 1) + ". " + eventos.get(i));
                }
                break;
            case 3:
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Seleccione un evento para inscribirse:");
                for (int i = 0; i < eventos.size(); i++) {
                    System.out.println((i + 1) + ". " + eventos.get(i));
                }
                System.out.print("Ingrese el número del evento: ");
                int eventoIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                if (eventoIndex >= 0 && eventoIndex < eventos.size()) {
                    String eventoSeleccionado = eventos.get(eventoIndex);
                    inscripciones.get(eventoSeleccionado).add(nombre);
                    System.out.println("Inscripción exitosa en " + eventoSeleccionado);
                } else {
                    System.out.println("Número de evento inválido.");
                }
                break;
            case 4:
                System.out.println("\nInscripciones:");
                for (String e : inscripciones.keySet()) {
                    System.out.println(e + ": " + inscripciones.get(e));
                }
                break;
            case 5:
                System.out.println("Saliendo...");
                scanner.close();
                return;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
         }
      }
   }
}
