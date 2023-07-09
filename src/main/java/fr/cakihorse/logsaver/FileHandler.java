package fr.cakihorse.logsaver;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FileHandler {


    public static void createFile(String fileName, String location) {
        try {
            File file = new File(location);
            if (!file.exists()) {
                file.mkdirs(); // create dirs if necessary
            }

            file = new File(file, fileName);

            if (file.createNewFile()) {
                System.out.println("Fichier créé avec succès !");
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void writeFile(String fileName, String location, String content) {
        File file = new File(location, fileName); // use the entire path of the file
        if (file.exists() && file.canWrite()) {
            try (FileWriter writer = new FileWriter(file, true)) {
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                writer.write("[LogSaver : " + timestamp + "] : " + content + "\n");
                System.out.println("Content xrite with success !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error : can't write on the file !");
        }
    }




    public static void readFile(String fileName, String location) {
        File file = new File(location, fileName); // Use the entire path of the file
        if (file.exists() && file.canRead()) {
            try (FileReader reader = new FileReader(file)) {
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                System.out.println("\nreading finished !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erreur : can't read the file");
        }
    }

}
