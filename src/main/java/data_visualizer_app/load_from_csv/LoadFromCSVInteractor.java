package data_visualizer_app.load_from_csv;

public class LoadFromCSVInteractor implements ILoadFromCSVInputBoundary
{
    // Add Data Access Objects
    private final ILoadFromCSVOutputBoundary loadFromCSVPresenter;

    public LoadFromCSVInteractor(ILoadFromCSVOutputBoundary loadFromCSVPresenter)
    {
        this.loadFromCSVPresenter = loadFromCSVPresenter;
    }

    @Override
    public void execute(LoadFromCSVInputData filePathPayload)
    {
        String filePath = filePathPayload.getFilePath();

        // Failure Checks, then call loadFromCSVPresenter.prepareFailView(msg);

        this.loadFromCSVPresenter.prepareSuccessView();
    }
}
