package data_visualizer_app.interface_adapter.export;

import data_visualizer_app.usecase.export.SaveDataInputBoundary;
import data_visualizer_app.usecase.export.SaveDataInputData;

import java.util.List;

public class SaveDataController {
    private final SaveDataInputBoundary saveDataUseCaseInteractor;

    public SaveDataController(SaveDataInputBoundary saveDataUseCaseInteractor) {
        this.saveDataUseCaseInteractor = saveDataUseCaseInteractor;
    }

    public void execute(List<List<String>> cleanedData, String filePath) {
        final SaveDataInputData saveDataInputData = new SaveDataInputData(cleanedData, filePath);
        saveDataUseCaseInteractor.excute(saveDataInputData);
    }
}
