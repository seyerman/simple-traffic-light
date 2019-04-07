package threads;

import ui.TrafficGUI;

public class LightThread extends Thread{
	private TrafficGUI trafficGUI;
	public LightThread(TrafficGUI gui) {
		trafficGUI = gui;
	}
	public void run() {
		trafficGUI.setFillGreen();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		trafficGUI.setFillYellow();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		trafficGUI.setFillRed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		trafficGUI.setFillWhite();
	}
}
