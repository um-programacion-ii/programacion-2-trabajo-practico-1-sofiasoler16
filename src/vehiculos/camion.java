package vehiculos;

public class camion extends vehiculo {


    public camion(String patente, String marca, int ano, int capacidadCargaKg, boolean tieneAcoplado) {
        // Con el super heredo los atributos de vehiculo, porque camion es un vehiculo
        super(patente, marca, ano, capacidadCargaKg);
    }

}
