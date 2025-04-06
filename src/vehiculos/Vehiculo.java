package vehiculos;

public class Vehiculo {
    private String patente;
    private String marca;
    private int ano;
    private int capacidadCargaKg;

    public Vehiculo(String patente, String marca, Integer ano, Integer capacidadCargaKg) {
        //validaciones
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }
        if (ano < 1900 || ano > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y 2025.");
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }


        this.patente = patente;
        this.marca = marca;
        this.ano = ano;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {return patente; }
    public String getMarca() {return marca; }
    public Integer getAno() {return ano; }
    public Integer getcapacidadCargaKg() {return capacidadCargaKg;}

    public void setPatente(String patente) {this.patente = patente; }
    public void setMarca(String marca) {this.marca = marca; }
    public void setAno(Integer ano) {this.ano = ano; }
    public void setCapacidadCargaKg(int capacidadCargaKg) {this.capacidadCargaKg = capacidadCargaKg;}



}

