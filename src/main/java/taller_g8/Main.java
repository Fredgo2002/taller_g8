//CHECKSTYLE:OFF
package taller_g8;
//CHECKSTYLE:ON
import java.util.InputMismatchException;
import java.util.Scanner;

//CHECKSTYLE:OFF
public class Main {

	public static void main(String[] args) {
//CHECKSTYLE:ON
		// TODO Auto-generated method stub
		PaqueteVacaciones.popularLoc.add(new Destino("Paris", 500));
		PaqueteVacaciones.popularLoc.add(new Destino(
				"New York City", 600));
		Scanner scanner = new Scanner(System.in);
        String destino = "";
        int numViajeros = 0;
        int duracionViaje = 0;
        System.out.print("Ingrese el destino: ");
        while (destino.isEmpty()) {
            String input = scanner.nextLine();
            if (input.matches("(-)?[0-9]+")) {
                System.out.println("Error:Ingrese nuevamente: ");
            } else {
                destino = input;
            }
        }
        System.out.print("Ingrese el número de viajeros: ");
        boolean validNumViajeros = false;
        while (!validNumViajeros) {
            try {
                numViajeros = scanner.nextInt();
                if (numViajeros <= 0) {
                    System.out.println("Error: Ingrese nuevamente: ");
                } else {
                    validNumViajeros = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese nuevamente: ");
                scanner.nextLine();
            }
        }
        System.out.print("Ingrese la duración del viaje en días: ");
        boolean validDuracionViaje = false;
        while (!validDuracionViaje) {
            try {
                duracionViaje = scanner.nextInt();
                if (duracionViaje <= 0) {
                    System.out.println("Error: Ingrese nuevamente: ");
                } else {
                    validDuracionViaje = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese nuevamente: ");
                scanner.nextLine();
            }
        }
        scanner.close();
        PaqueteVacaciones test = new PaqueteVacaciones(destino,
        		numViajeros, duracionViaje);
       if (!test.isValidPackage()) {
        	System.out.print("La cantidad de "
        			+ "pasajeros supera el limite permitido");
        	System.exit(0);
        }
        test.setDiscount();
        test.setPenalties();
        test.isPopular();
        double costoFinal = test.calculateCost();
        System.out.print("El costo final de su viaje es de: " + costoFinal);

	}

	}

