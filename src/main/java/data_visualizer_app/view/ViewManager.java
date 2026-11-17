package data_visualizer_app.view;

import data_visualizer_app.interface_adapter.IViewManagerModelListener;
import data_visualizer_app.interface_adapter.ViewManagerModel;

import javax.swing.*;
import java.awt.*;

public class ViewManager implements IViewManagerModelListener
{
    private JPanel views;
    private CardLayout cardLayout;
    private ViewManagerModel viewManagerModel;

    public ViewManager(JPanel views, CardLayout cardLayout, ViewManagerModel viewManagerModel)
    {
        this.views = views;
        this.cardLayout = cardLayout;
        this.viewManagerModel = viewManagerModel;
        this.viewManagerModel.addListener(this);
    }

    @Override
    public void viewChanged()
    {

    }
}
