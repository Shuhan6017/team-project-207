package data_visualizer_app.interface_adapter.export;

import java.util.ArrayList;
import java.util.List;

public class SaveDataViewModel {
    private final List<SaveDataViewModelListener> listeners = new ArrayList<>();

    public static final String VIEW_NAME = "export data";

    private SaveDataState state = new SaveDataState();

    public SaveDataState getState() { return this.state; }

    public void setState(SaveDataState state) { this.state = state; }

    public void addListener(SaveDataViewModelListener listener) { listeners.add(listener); }

    public void notifyExportCompleted() {
        for (SaveDataViewModelListener listener : listeners) {
            listener.ExportCompleted();
        }
    }
}
