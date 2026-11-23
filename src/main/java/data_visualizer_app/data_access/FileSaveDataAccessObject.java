package data_visualizer_app.data_access;
import data_visualizer_app.usecase.export.SaveDataAccessInterface;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileSaveDataAccessObject implements SaveDataAccessInterface {

    @Override
    public void saveData(List<List<String>> data, String filePath) {
        File targetFile = new File(filePath);
        final BufferedWriter writer;

        try {
            writer = new BufferedWriter(new FileWriter(targetFile));

            for (List<String> row : data) {
                final String line = String.join(",", row);
                writer.write(line);
                writer.newLine();
            }

            writer.close();
        } catch (IOException ex) {
            throw new RuntimeException("Error saving file", ex);
        }
    }
}
