package data_visualizer_app.use_case.load_from_csv;

public class LoadFromCSVInputData
{
    private final String filePath;

    public LoadFromCSVInputData(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath()
    {
        return filePath;
    }
}
