package vehiculos;

public class camion extends vehiculo {
    // Hago privado su atributo unico, los que son tambien de vehiculo los hereda
    private boolean tieneAcoplado;

    public camion(String patente, String marca, int ano, int capacidadCargaKg, boolean tieneAcoplado) {
        // Con el super heredo los atributos de vehiculo, porque camion es un vehiculo
        super(patente, marca, ano, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    //Hago los getters and setters
    public boolean getTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }
}
