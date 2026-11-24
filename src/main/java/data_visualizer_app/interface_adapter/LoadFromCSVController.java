package data_visualizer_app.interface_adapter;

import data_visualizer_app.use_case.load_from_csv.LoadFromCSVInputBoundary;
import data_visualizer_app.use_case.load_from_csv.LoadFromCSVInputData;

public class LoadFromCSVController
{
    private final LoadFromCSVInputBoundary loadFromCSVInteractor;

    public LoadFromCSVController(LoadFromCSVInputBoundary loadFromCSVInteractor)
    {
        this.loadFromCSVInteractor = loadFromCSVInteractor;
    }

    public void execute(String filePath)
    {
        final LoadFromCSVInputData filePathPayload = new LoadFromCSVInputData(filePath);

        this.loadFromCSVInteractor.execute(filePathPayload);
    }
}
