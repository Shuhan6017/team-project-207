package data_visualizer_app.interface_adapter;

import java.util.ArrayList;
import java.util.List;

public class LoadFromCSVViewModel
{
    private final List<LoadFromCSVViewModelListener> listeners = new ArrayList<>();

    // Debate on adding states

    public void addListener(LoadFromCSVViewModelListener listener)
    {
        this.listeners.add(listener);
    }

    public void notifyStateChanged()
    {
        for (LoadFromCSVViewModelListener listener : this.listeners)
            listener.stateChanged();
    }
}
