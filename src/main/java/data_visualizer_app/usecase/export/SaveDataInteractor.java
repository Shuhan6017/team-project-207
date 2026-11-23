package data_visualizer_app.usecase.export;

public class SaveDataInteractor implements SaveDataInputBoundary {
    private final SaveDataAccessInterface dataAccessObject;
    private final SaveDataOutputBoundary userPresenter;

    public SaveDataInteractor(SaveDataAccessInterface dataAccessObject,
                              SaveDataOutputBoundary userPresenter) {
        this.dataAccessObject = dataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void excute(SaveDataInputData saveDataInputData) {
        if (saveDataInputData.getFilepath() == null ||
                saveDataInputData.getFilepath().trim().isEmpty()) {
            userPresenter.prepareFailView("Export failed: File path cannot be empty.");
        }
        else if (saveDataInputData.getCleanedData() == null ||
                saveDataInputData.getCleanedData().isEmpty()) {
            userPresenter.prepareFailView("Export failed: No data to export.");
        }
        else {
            dataAccessObject.saveData(saveDataInputData.getCleanedData(),
                    saveDataInputData.getFilepath());

        }

        final SaveDataOutputData saveDataOutputData = new SaveDataOutputData("Data exported successfully to: " + saveDataInputData.getFilepath());
        userPresenter.prepareSuccessView(saveDataOutputData);
    }
}
