package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Traffic {
	private List<Long> startTimes;
	private String PATH_EXPORT = "data/startTimes.txt";
	
	public Traffic(){
		startTimes = new ArrayList<>();
	}
	
	public void exportReport() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(PATH_EXPORT);
		for (int I = 0; I < startTimes.size(); I++) {
			pw.write((I+1)+" "+startTimes.get(I)+"\n");
		}
		pw.close();
	}
	
	public void addStartTime(long sTime) {
		startTimes.add(sTime);
	}
}
