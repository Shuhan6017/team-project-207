package load_from_csv;

import data_visualizer_app.interface_adapter.LoadFromCSVOutputBoundary;
import data_visualizer_app.use_case.load_from_csv.LoadFromCSVInputBoundary;
import data_visualizer_app.use_case.load_from_csv.LoadFromCSVInputData;
import data_visualizer_app.use_case.load_from_csv.LoadFromCSVInteractor;
import data_visualizer_app.use_case.load_from_csv.LoadFromCSVOutputData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LoadFromCSVInteractorTest
{
    @Test
    void successTest()
    {
        LoadFromCSVInputData filePathPayload = new LoadFromCSVInputData("src/main/resources/fake_data.csv");
        LoadFromCSVOutputBoundary testPresenter = new LoadFromCSVOutputBoundary()
        {
            @Override
            public void prepareSuccessView(LoadFromCSVOutputData csvContentPayload)
            {
                Assertions.assertNotNull(csvContentPayload.getCSVContent());
                Assertions.assertTrue(csvContentPayload.getCSVContent().contains(List.of(0.49F, 2.1F)));
            }

            @Override
            public void prepareFailView(String msg)
            {
                Assertions.fail("Use case failure is unexpected.");
            }
        };

        LoadFromCSVInputBoundary interactor = new LoadFromCSVInteractor(testPresenter);
        interactor.execute(filePathPayload);
    }
}
