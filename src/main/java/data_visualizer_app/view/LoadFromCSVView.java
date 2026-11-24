package data_visualizer_app.view;

import data_visualizer_app.interface_adapter.LoadFromCSVController;
import data_visualizer_app.interface_adapter.LoadFromCSVViewModel;
import data_visualizer_app.interface_adapter.LoadFromCSVViewModelListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadFromCSVView extends JPanel implements ActionListener, LoadFromCSVViewModelListener
{
    private final LoadFromCSVViewModel loadFromCSVViewModel;
    private LoadFromCSVController loadFromCSVController;

    public LoadFromCSVView(LoadFromCSVViewModel loadFromCSVViewModel)
    {
        this.loadFromCSVViewModel = loadFromCSVViewModel;
        this.loadFromCSVViewModel.addListener(this);

        // Draw GUI and add Action Listeners here
    }

    @Override
    public void stateChanged()
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }

    public void setLoadFromCSVController(LoadFromCSVController controller)
    {
        this.loadFromCSVController = controller;
    }
}
