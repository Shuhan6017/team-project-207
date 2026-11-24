package data_visualizer_app.use_case.load_from_csv;

import data_visualizer_app.interface_adapter.LoadFromCSVOutputBoundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoadFromCSVInteractor implements LoadFromCSVInputBoundary
{
    private final LoadFromCSVOutputBoundary loadFromCSVPresenter;

    public LoadFromCSVInteractor(LoadFromCSVOutputBoundary loadFromCSVPresenter)
    {
        this.loadFromCSVPresenter = loadFromCSVPresenter;
    }

    @Override
    public void execute(LoadFromCSVInputData filePathPayload)
    {
        String filePath = filePathPayload.getFilePath();

        // Failure Checks, then call loadFromCSVPresenter.prepareFailView(msg);
        // Check if .csv
        if (checkNotCSV(filePath))
            this.loadFromCSVPresenter.prepareFailView("File is not of type .csv.");

        Set<List<Float>> csvContentPayload = this.loadCSV(filePath);

        // Check if CSV content is loaded correctly
        if (csvContentPayload == null)
            this.loadFromCSVPresenter.prepareFailView("Failed to load contents from .csv.");

        this.loadFromCSVPresenter.prepareSuccessView(new LoadFromCSVOutputData(csvContentPayload));
    }

    private boolean checkNotCSV(String filePath)
    {
        int filePathLength = filePath.length();
        StringBuilder fileExtensionBuilder = new StringBuilder();

        for (int index = filePathLength - 1; index >= 0; index--)
        {
            if (filePath.charAt(index) == '.')
                break;

            fileExtensionBuilder.insert(0, filePath.charAt(index));
        }

        return !fileExtensionBuilder.toString().equals("csv");
    }

    private Set<List<Float>> loadCSV(String filePath)
    {
        final Set<List<Float>> csvContent = new HashSet<>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null)
            {
                String[] row = line.split(",");
                List<Float> coordinates = new ArrayList<>();
                for (String s : row)
                {
                    if (!s.matches("^-?(\\d+(\\.\\d*)?|\\.\\d+)$"))
                        return null;

                    coordinates.add(Float.parseFloat(s));
                }

                csvContent.add(coordinates);
            }

        } catch (IOException e)
        {
            return null;
        }

        return csvContent;
    }
}
