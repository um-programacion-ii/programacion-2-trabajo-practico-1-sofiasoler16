package vehiculos;

public class vehiculoPrinter {
    public void imprimir(vehiculo v) {
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAno());
        System.out.println("Capacidad de carga (kg): " + v.getcapacidadCargaKg());
    }
}
