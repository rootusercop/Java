package general;

import general.TicTacToe.Player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TicTacToe {
	
	char[][] board;
	int size;
	
	Player player1 = new Player("Boy");
	Player player2 = new Player("Girl");
	Player nextPlayer = player1;
	
	boolean nextTurnAvailable = true;
	
	Set<String> set = new HashSet<String>();
	Map<String, Player> playedMap = new HashMap<String, Player>();
	
	class Player {
		String name;
		Player(String name) {
			this.name = name;
		}
	}
	
	//VB : How o you determine winner?
	TicTacToe(int size) {
		board = new char[size][size];
		this.size = size;
		init();
	}
	
	public void startGame() {
		
	}
	
	public void playYourTurn(Player p) {
		if(hasNextTurn()) {
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				String position[] = iter.next().split("-");
				int i = Integer.parseInt(position[0]);
				int j = Integer.parseInt(position[1]);
				
				Map<Integer, Integer> columnCount = new HashMap<Integer, Integer>();
				Map<String, Integer> oppPositionCount = new HashMap<String, Integer>();
				for(int x=0; x<size;x++) {
					int colcount = 0;
					int colOppCount = 0;
					int rowcount = 0;
					int rowOppCount = 0;
					for(int y=0; y<size;y++) {
						if((playedMap.containsKey(x+"-"+y)) && (i!=x) && (j!=y)) {
							if (p == playedMap.get(x+"-"+y)) {
								colcount++;
							} else {
								colOppCount++;
							}
						}
						if((playedMap.containsKey(y+"-"+x)) && (i!=y) && (j!=x)) {
							if (p == playedMap.get(y+"-"+x)) {
								rowcount++;
							} else {
								rowOppCount++;
							}
						}
					}
					if(colOppCount > colcount) {
						columnCount.put(x, colOppCount);
					}
					if(rowOppCount > rowcount) {
						columnCount.put(x, rowOppCount);
					}
				}
				
			}
		}
	}
	
	public boolean hasNextTurn() {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j] == '\u0000')
					return true;
			}
		}
		return false;
	}
	
	public void init() {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				this.set.add((i+ "-" + j));
			}
		}
	}
	
	
}
