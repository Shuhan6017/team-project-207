package data_visualizer_app.usecase.export;
import java.util.List;

public interface SaveDataAccessInterface {
    void saveData(List<List<String>> data, String filepath);
}
