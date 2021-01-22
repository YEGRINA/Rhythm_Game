package doom_chit_11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(DoomChit.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			DoomChit.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DoomChit.game.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			DoomChit.game.pressF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DoomChit.game.pressSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			DoomChit.game.pressJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			DoomChit.game.pressK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			DoomChit.game.pressL();
		}
	}
	public void keyReleased(KeyEvent e) {
		if(DoomChit.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			DoomChit.game.releaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DoomChit.game.releaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			DoomChit.game.releaseF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DoomChit.game.releaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			DoomChit.game.releaseJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			DoomChit.game.releaseK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			DoomChit.game.releaseL();
		}
	}

}
