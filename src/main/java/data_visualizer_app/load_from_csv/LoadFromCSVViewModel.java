package data_visualizer_app.load_from_csv;

import java.util.ArrayList;
import java.util.List;

public class LoadFromCSVViewModel
{
    private final List<ILoadFromCSVViewModelListener> listeners = new ArrayList<>();

    // Debate on adding states

    public void addListener(ILoadFromCSVViewModelListener listener)
    {
        this.listeners.add(listener);
    }

    public void notifyStateChanged()
    {
        for (ILoadFromCSVViewModelListener listener : this.listeners)
            listener.stateChanged();
    }
}
