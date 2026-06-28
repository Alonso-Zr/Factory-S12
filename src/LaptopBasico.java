public class LaptopBasico extends Laptop{
    public LaptopBasico(String marca, String modelo, int ano_fabricacion, String tipo_procesador, Double tamano_pantalla) {
        super(marca, modelo, ano_fabricacion, tipo_procesador, tamano_pantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Corriendo programas en una Laptop Basica\n" +
                "Laptop Basica\n" +
                "Marca y Modelo: " + marca + " " + modelo + "\n" +
                "Año de Fabricacion: " + ano_fabricacion + "\n" +
                "Procesador: " + tipo_procesador + "\n" +
                "Tamaño de la Pantalla: " + tamano_pantalla + "\n";
    }
}
