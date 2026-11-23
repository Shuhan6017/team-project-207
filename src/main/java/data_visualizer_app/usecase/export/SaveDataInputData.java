package data_visualizer_app.usecase.export;
import java.util.List;

public class SaveDataInputData {
    private final List<List<String>> cleanedData;
    private final String filepath;

    public SaveDataInputData(List<List<String>> cleanedData, String filepath){
        this.cleanedData = cleanedData;
        this.filepath = filepath;
    }

    public List<List<String>> getCleanedData() {
        return cleanedData;
    }
    public String getFilepath() {
        return filepath;
    }
}
