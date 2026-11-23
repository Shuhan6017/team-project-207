package data_visualizer_app.interface_adapter.export;

import data_visualizer_app.usecase.export.SaveDataOutputBoundary;
import data_visualizer_app.usecase.export.SaveDataOutputData;

public class SaveDataPresenter implements SaveDataOutputBoundary {
    private final SaveDataViewModel saveDataViewModel;

    public SaveDataPresenter(SaveDataViewModel saveDataViewModel) {
        this.saveDataViewModel = saveDataViewModel;
    }

    @Override
    public void prepareSuccessView(SaveDataOutputData outputData) {
        saveDataViewModel.setState(new SaveDataState(outputData.getMessage(), true));
        saveDataViewModel.notifyExportCompleted();
    }

    @Override
    public void prepareFailView(String error) {
        saveDataViewModel.setState(new SaveDataState(error, false));
        saveDataViewModel.notifyExportCompleted();
    }
}
