package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public enum SingletonEnum {
    INSTANCE;

    public void write(String text, String file) { //synchronized odmawia dostępu kilku watkam jednoczesnie
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(new File(file), true); //append dopisuje zamiast zastąpić plik
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
