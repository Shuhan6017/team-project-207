package data_visualizer_app.load_from_csv;

public interface ILoadFromCSVOutputBoundary
{
    // Debate on adding any outputing payload
    void prepareSuccessView();

    void prepareFailView(String msg);
}
