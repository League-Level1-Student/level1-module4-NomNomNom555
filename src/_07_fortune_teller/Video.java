package _07_fortune_teller;

import java.net.URI;

public class Video {
	private String url;
	
	public Video(String n) {
		url=n;
		playVideo(url);
	}
	
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
