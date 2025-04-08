package vehiculos;

public class Main {
    public static void main(String[] args) {
        vehiculo v1 = new vehiculo("AF632TE", "Toyota", 2023, 1000);
        vehiculo v2 = new vehiculo("AG762TR", "Ford", 2025, 1500);
        vehiculo v3 = new vehiculo("AB578FR", "Renault", 2018, 1200);

        vehiculoPrinter printer = new vehiculoPrinter();

        printer.imprimir(v1);
        System.out.println();
        printer.imprimir(v2);
        System.out.println();
        printer.imprimir(v3);

        camion c1 = new camion("JKL456", "Volvo", 2022, 3000, true);
        System.out.println("Camión " + c1.getMarca() + " creado: " + c1.getPatente() + " con acoplado: " + c1.getTieneAcoplado());

    }
}
