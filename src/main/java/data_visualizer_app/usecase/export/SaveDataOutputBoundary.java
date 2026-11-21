package data_visualizer_app.usecase.export;

public interface SaveDataOutputBoundary {
    void prepareSuccessView(SaveDataOutputData outputData);
    void prepareFailview(String errorMessage);
}
