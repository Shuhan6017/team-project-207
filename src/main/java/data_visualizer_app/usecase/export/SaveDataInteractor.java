package data_visualizer_app.usecase.export;

public class SaveDataInteractor implements SaveDataInputBoundary {
    private final SaveDataAccessInterface dataAccessObject;
    private final SaveDataOutputBoundary userpresenter;

    public SaveDataInteractor(SaveDataAccessInterface dataAccessObject,
                              SaveDataOutputBoundary userpresenter) {
        this.dataAccessObject = dataAccessObject;
        this.userpresenter = userpresenter;
    }

    @Override
    public void excute(SaveDataInputData saveDataInputData) {
        if (saveDataInputData.getFilePath() == null ||
                saveDataInputData.getFilePath().trim().isEmpty()) {
            userPresenter.prepareFailView("Export failed: File path cannot be empty.");
        }
        else if (saveDataInputData.getCleanedData() == null ||
                saveDataInputData.getCleanedData().isEmpty()) {
            userPresenter.prepareFailView("Export failed: No data to export.");
        }
        else {
            dataAccessObject.saveData(saveDataInputData.getCleanedData(),
                    saveDataInputData.getFilePath());

        }

        final SaveDataOutputData saveDataOutputData = new SaveDataOutputData("Data exported successfully to: " + saveDataInputData.getFilePath());
        userPresenter.prepareSuccessView(saveDataOutputData);
    }
}
