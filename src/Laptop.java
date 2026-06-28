public abstract class Laptop {
    protected String marca;
    protected String modelo;
    protected int ano_fabricacion;
    protected String tipo_procesador;
    protected Double tamano_pantalla;

    public Laptop(String marca, String modelo, int ano_fabricacion, String tipo_procesador, Double tamano_pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacion = ano_fabricacion;
        this.tipo_procesador = tipo_procesador;
        this.tamano_pantalla = tamano_pantalla;
    }

    public abstract void ejecutarPrueba();
}