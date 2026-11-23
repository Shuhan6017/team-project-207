package data_visualizer_app.usecase.export;

public class SaveDataOutputData {
    private final String message;

    public SaveDataOutputData(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
