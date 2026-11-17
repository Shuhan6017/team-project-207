package data_visualizer_app;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new AppBuilder().build();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
