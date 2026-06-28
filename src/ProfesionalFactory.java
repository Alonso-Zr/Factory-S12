public class ProfesionalFactory extends LaptopFactory{
    @Override
    public Laptop crearLaptop(String marca, String modelo, int ano_fabricacion, String tipo_procesador, Double tamano_pantalla) {
        return new LaptopProfesional(marca, modelo, ano_fabricacion, tipo_procesador, tamano_pantalla);
    }
}
