package vehiculos;

public class auto extends vehiculo {

    public auto(String patente, String marca, int ano, int capacidadCargaKg) {
        // Con el super heredo los atributos de vehiculo, porque camion es un vehiculo
        super(patente, marca, ano, capacidadCargaKg);
    }

}

