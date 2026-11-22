package data_visualizer_app.load_from_csv;

public class LoadFromCSVController
{
    private final ILoadFromCSVInputBoundary loadFromCSVInteractor;

    public LoadFromCSVController(ILoadFromCSVInputBoundary loadFromCSVInteractor)
    {
        this.loadFromCSVInteractor = loadFromCSVInteractor;
    }

    public void execute(String filePath)
    {
        final LoadFromCSVInputData filePathPayload = new LoadFromCSVInputData(filePath);

        this.loadFromCSVInteractor.execute(filePathPayload);
    }
}
