package fr.cakihorse;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FileHandler {
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Fichier créé avec succès !");
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String fileName, String content) {
        File file = new File(fileName);
        if (file.exists() && file.canWrite()) {
            try (FileWriter writer = new FileWriter(file, true)) {
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

                writer.write("[LogSaver : " + timestamp +" ] : "+ content + "\n");

                System.out.println("Content written with success !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error : Can't write on the file...");
        }
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        if (file.exists() && file.canRead()) {
            try (FileReader reader = new FileReader(file)) {
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                System.out.println("\nReading finished");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error : can't read the file...");
        }
    }

}
