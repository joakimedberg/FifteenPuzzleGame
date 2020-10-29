package nackademin;

import java.util.ArrayList;
import java.util.Collections;

public class Board {

	private ArrayList<Integer> board = new ArrayList<>();

	public Board() {
		initBoard();
	}

	public ArrayList<Integer> getBoard() {
		return board;
	}

	private void initBoard() {

		int i = 0;
		
		while (i <= 15) {
			int nr = (int) ((Math.random() * (16 - 0)) + 0);
			if (!board.contains(nr)) {
				board.add(nr);
				++i;
			}
		} 
	}
	
	public void moveTile(int nr) {
		int id = -1;
		
		for (Integer b : board) {
			if (b.equals(nr) ) {
				id = board.indexOf(b);
				break;
			}
		}
				
		if (id - 1 >= 0 && board.get(id-1) == 0 && id != 0 && id != 4 && id != 8 && id != 12 ) {
			Collections.swap(board, id, id-1);
		}
		if (id - 4 >= 0 && board.get(id-4) == 0 ) {
			Collections.swap(board, id, id-4);
		}
		if (id + 1 <= 15 && board.get(id+1) == 0 && id != 3 && id != 7 && id != 11 && id != 15) {
			Collections.swap(board, id, id+1);
		}
		if (id + 4 <= 15 && board.get(id+4) == 0) {
			Collections.swap(board, id, id+4);
		}		
	}
}