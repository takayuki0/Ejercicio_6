import java.io.*;
import java.util.ArrayList;

/**
 * 6.- Construir un directorio de amigos (Usando clases y una colección). Considérese que la información
 * más relevante para representar a un amigo es: nombre, teléfono, correo-e y fecha de cumpleaños.
 * Utilizar objetos serializables para escribir y leer de archivo.
 */
public class Main {
    public static void main(String[] args) {


        ArrayList<Amigos> miDirectorioAmigos = new ArrayList<>();
        miDirectorioAmigos.add(new Amigos("Violeta Pérez", "443377562", "violeta@yahoo.com", "02-06-83"));
        miDirectorioAmigos.add(new Amigos("José Camacho", "266870987", "jose@hotmail.com", "31-10-95"));
        miDirectorioAmigos.add(new Amigos("Ramón Pulido", "646807215", "ramon@gmail.com", "23-12-93"));
        miDirectorioAmigos.add(new Amigos("Sofía Vergara", "693465879", "sofia@hotmail.com", "14-07-84"));
        miDirectorioAmigos.add(new Amigos("Lucía Pulido", "792783757", "lucy@hotmail.com", "11-04-90"));
        miDirectorioAmigos.add(new Amigos("Maigualida Caraballo", "693573826", "maigua@hotmail.com", "17-06-01"));
        miDirectorioAmigos.add(new Amigos("Josefina Manrrique", "697478424", "majo@hotmail.com", "17-08-05"));

        try {
            ObjectOutputStream escritorSerializable = new ObjectOutputStream(new FileOutputStream("directorio.dat"));
            escritorSerializable.writeObject(miDirectorioAmigos);
            escritorSerializable.close();

            ObjectInputStream lectorSerializable = new ObjectInputStream(new FileInputStream("directorio.dat"));
            ArrayList<Amigos> recuperarDirectorio = (ArrayList<Amigos>) lectorSerializable.readObject();
            lectorSerializable.close();

            for (Amigos d : recuperarDirectorio) {
                System.out.println(d.toString() );
            }

        } catch (Exception e) {
            System.out.println("Error! \nNo se ha encontrado el archivo.");
        }

    }
}