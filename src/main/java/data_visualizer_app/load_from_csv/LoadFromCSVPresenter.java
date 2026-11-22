package data_visualizer_app.load_from_csv;

import data_visualizer_app.interface_adapter.ViewManagerModel;

public class LoadFromCSVPresenter implements ILoadFromCSVOutputBoundary
{
    private final LoadFromCSVViewModel loadFromCSVViewModel;
    private final ViewManagerModel viewManagerModel;

    public LoadFromCSVPresenter(LoadFromCSVViewModel loadFromCSVViewModel, ViewManagerModel viewManagerModel)
    {
        this.loadFromCSVViewModel = loadFromCSVViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView()
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
