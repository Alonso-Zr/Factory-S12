package model;

public class LaptopProfesional extends Laptop {
    public LaptopProfesional(String marca, String modelo, int ano_fabricacion, String tipo_procesador, Double tamano_pantalla) {
        super(marca, modelo, ano_fabricacion, tipo_procesador, tamano_pantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Corriendo programas en una model.Laptop Profesional\n" +
                "model.Laptop Profesional\n" +
                "Marca y Modelo: " + marca + " " + modelo + "\n" +
                "Año de Fabricacion: " + ano_fabricacion + "\n" +
                "Procesador: " + tipo_procesador + "\n" +
                "Tamaño de la Pantalla: " + tamano_pantalla + "\n";
    }
}
