package vehiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        vehiculo v1 = new vehiculo("AF632TE", "Toyota", 2023, 1000);

        vehiculoPrinter printer = new vehiculoPrinter();


        vehiculo c1 = new camion("JKL456", "Volvo", 2022, 3000, true);

        vehiculo a1 = new auto("AB578UT", "Toyota", 2019, 1500, 4);


        //Usamos ArrayList<vehiculo>
        // Crear una lista dinámica de vehículos
        ArrayList<vehiculo> vehiculos = new ArrayList<>();

        // Agregar un Vehiculo común
        vehiculos.add(v1);

        // Agregar un Camion
        vehiculos.add(c1);

        // Agregar un Auto
        vehiculos.add(a1);

        String patenteBuscada = "JKL456";

        boolean encontrado = false;

        for (vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patenteBuscada)) {
                System.out.println("Vehículo encontrado:");
                printer.imprimir(v);
                encontrado = true;
                break; // cortamos el bucle porque ya lo encontramos
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo con la patente: " + patenteBuscada);
        }

    }
}
