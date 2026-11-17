package data_visualizer_app.interface_adapter;

import java.util.ArrayList;
import java.util.List;

public class ViewManagerModel
{
    private final List<IViewManagerModelListener> listeners = new ArrayList<>();

    private String currentViewName = "";

    public String getCurrentViewName() {
        return this.currentViewName;
    }

    public void setState(String currentViewName)
    {
        this.currentViewName = currentViewName;
    }

    public void addListener(IViewManagerModelListener listener)
    {
        listeners.add(listener);
    }

    public void notifyViewChanged() {
        for (IViewManagerModelListener listener : listeners)
        {
            listener.viewChanged();
        }
    }
}
