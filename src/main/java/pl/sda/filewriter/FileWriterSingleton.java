package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;

    private FileWriterSingleton() {

    }

    public synchronized static FileWriterSingleton getInstance() {
        if (instance == null) {
            instance = new FileWriterSingleton();
            System.out.println("Wchodze w petle");
        }
        return instance;
    }

    public synchronized void write(String text, String file){ //synchronized odmawia dostępu kilku watkam jednoczesnie
        Path path = Paths.get(file);
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(new File(file),true); //append dopisuje zamiast zastąpić plik
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
