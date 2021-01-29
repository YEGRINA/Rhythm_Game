package doom_chit_15;

public class Main {

	// 해상도 설정
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	public static final int NOTE_SPEED = 7;  // 떨어지는 속도
	public static final int SLEEP_TIME = 10;  // 떨어지는 주기
	public static final int REACH_TIME = 1;  // 판정라인에 도달하기까지 시간
	
	public static void main(String[] args) {
		
		new DoomChit();

	}

}
