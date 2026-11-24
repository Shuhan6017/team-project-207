package data_visualizer_app.interface_adapter;

import data_visualizer_app.use_case.load_from_csv.LoadFromCSVOutputData;

public interface LoadFromCSVOutputBoundary
{
    // Debate on adding any outputing payload
    void prepareSuccessView(LoadFromCSVOutputData csvContentPayload);

    void prepareFailView(String msg);
}
