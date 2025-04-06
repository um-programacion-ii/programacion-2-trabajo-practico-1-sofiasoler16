package vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("AF632TE", "Toyota", 2023, 1000);
        Vehiculo v2 = new Vehiculo("AG762TR", "Ford", 2025, 1500);
        Vehiculo v3 = new Vehiculo("AB578FR", "Renault", 2018, 1200);

        v1.mostrarInformacion();
        System.out.println();
        v2.mostrarInformacion();
        System.out.println();
        v3.mostrarInformacion();
    }
}
