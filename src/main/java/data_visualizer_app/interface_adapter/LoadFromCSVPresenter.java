package data_visualizer_app.interface_adapter;

import data_visualizer_app.use_case.load_from_csv.LoadFromCSVOutputData;

public class LoadFromCSVPresenter implements LoadFromCSVOutputBoundary
{
    private final LoadFromCSVViewModel loadFromCSVViewModel;
    private final ViewManagerModel viewManagerModel;

    public LoadFromCSVPresenter(LoadFromCSVViewModel loadFromCSVViewModel, ViewManagerModel viewManagerModel)
    {
        this.loadFromCSVViewModel = loadFromCSVViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(LoadFromCSVOutputData csvContentPayload)
    {
        // Do success logic and updates

        this.loadFromCSVViewModel.notifyStateChanged();
        this.viewManagerModel.notifyViewChanged();
    }

    @Override
    public void prepareFailView(String msg)
    {
        // Do failure logic and updates
        this.loadFromCSVViewModel.notifyStateChanged();
    }
}
