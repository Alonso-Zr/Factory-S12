import app.BasicoFactory;
import app.GamerFactory;
import app.ProfesionalFactory;
import builder.LaptopFactory;
import model.Laptop;

public class Main {
    public static void main(String[] args) {

        LaptopFactory gamer = new GamerFactory();
        Laptop laptop1 = gamer.crearLaptop("Macbook", "air", 2017, "Silicon M1", 13.0);
        laptop1.ejecutarPrueba();

        LaptopFactory basico = new BasicoFactory();
        Laptop laptop2 = basico.crearLaptop("Dell", "Latitude", 2020, "intel core i7", 14.0);
        laptop2.ejecutarPrueba();

        LaptopFactory profesional = new ProfesionalFactory();
        Laptop laptop3 = profesional.crearLaptop("Macbook", "Pro", 2022, "Apple Silicon M2", 16.0);
        laptop3.ejecutarPrueba();

    }
}
