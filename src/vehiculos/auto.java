package vehiculos;

public class auto extends vehiculo {

    private int cantidadPasajeros;

    public auto(String patente, String marca, int ano, int capacidadCargaKg, int cantidadPasajeros) {
        // Con el super heredo los atributos de vehiculo, porque camion es un vehiculo
        super(patente, marca, ano, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //getters and setters
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

}

