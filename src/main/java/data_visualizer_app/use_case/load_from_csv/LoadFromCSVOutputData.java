package data_visualizer_app.use_case.load_from_csv;

import java.util.List;
import java.util.Set;

public class LoadFromCSVOutputData
{
    private final Set<List<Float>> csvContent;

    public LoadFromCSVOutputData(Set<List<Float>> csvContent)
    {
        this.csvContent = csvContent;
    }

    public Set<List<Float>> getCSVContent()
    {
        return this.csvContent;
    }
}
