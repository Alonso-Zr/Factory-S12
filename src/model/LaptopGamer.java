package model;

public class LaptopGamer extends Laptop {
    public LaptopGamer(String marca, String modelo, int ano_fabricacion, String tipo_procesador, Double tamano_pantalla) {
        super(marca, modelo, ano_fabricacion, tipo_procesador, tamano_pantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Corriendo programas en una model.Laptop Gamer\n" +
                "model.Laptop Gamer\n" +
                "Marca y Modelo: " + marca + " " + modelo + "\n" +
                "Año de Fabricacion: " + ano_fabricacion + "\n" +
                "Procesador: " + tipo_procesador + "\n" +
                "Tamaño de la Pantalla: " + tamano_pantalla + "\n";
    }
}
