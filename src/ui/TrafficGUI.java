package ui;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.Traffic;
import threads.LightThread;

public class TrafficGUI {
	private Traffic tc;
	
    @FXML
    private Circle light;
    
    @FXML
    public void initialize() {
    	tc = new Traffic();
    }

    @FXML
    public void exportReport(ActionEvent event) {
    	try {
			tc.exportReport();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }

    @FXML
    public void startTraffic(ActionEvent event) {
    	LightThread trafficThread = new LightThread(this);
    	trafficThread.start();
    	tc.addStartTime(System.currentTimeMillis());
    }
    
    public void setFillGreen() {
    	light.setFill(Color.LIMEGREEN);
    }

    public void setFillYellow() {
    	light.setFill(Color.YELLOW);
    }

    public void setFillRed() {
    	light.setFill(Color.RED);
    }

    public void setFillWhite() {
    	light.setFill(Color.WHITE);
    }
}
