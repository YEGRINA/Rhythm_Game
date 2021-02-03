package doom_chit_16;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop;  // 무한반복인지 확인하는 변수
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/"+name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 음악이 어디(몇초) 부분인지 확인하는 함수
	public int getTime() {
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	// 노래 종료 함수
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();  // 노래 종료
	}
	
	@Override
	public void run() {  // thread가 있으면 항상 run이 있어야 함
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
