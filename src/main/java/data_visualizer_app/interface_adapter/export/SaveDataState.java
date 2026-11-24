package data_visualizer_app.interface_adapter.export;

public class SaveDataState {
    private String message;
    private boolean success;

    public SaveDataState() {
        this.message = "";
        this.success = false;
    }

    public SaveDataState(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() { return message; }
    public boolean isSuccess() { return success; }
}
