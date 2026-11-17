package data_visualizer_app;

import data_visualizer_app.interface_adapter.ViewManagerModel;
import data_visualizer_app.view.ViewManager;

import javax.swing.*;
import java.awt.*;

public class AppBuilder
{
    private final JPanel cardPanel = new JPanel();
    private final CardLayout cardLayout = new CardLayout();

    final ViewManagerModel viewManagerModel = new ViewManagerModel();
    ViewManager viewManager = new ViewManager(cardPanel, cardLayout, viewManagerModel);

    // Use case data_visualizer_app.view: private UseCaseView useCaseView;
    // Use case data_visualizer_app.view model: private UseCaseViewModel useCaseViewModel;

    // Use case add: public data_visualizer_app.AppBuilder addUseCase() {}

    public JFrame build()
    {
        final JFrame frame = new JFrame("DataViz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(this.cardPanel);

        // viewManagerModel.setState(X);
        viewManagerModel.notifyViewChanged();

        return frame;
    }
}
