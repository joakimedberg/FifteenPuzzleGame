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

	public boolean isGameCompleted() {
		if (board.get(0) != 1) {
			return false;
		} else if (board.get(1) != 2) {
			return false;
		}else if (board.get(2) != 3) {
			return false;
		}else if (board.get(3) != 4) {
			return false;
		}else if (board.get(4) != 5) {
			return false;
		}else if (board.get(5) != 6) {
			return false;
		}else if (board.get(6) != 7) {
			return false;
		}else if (board.get(7) != 8) {
			return false;
		}else if (board.get(8) != 9) {
			return false;
		}else if (board.get(9) != 10) {
			return false;
		}else if (board.get(10) != 11) {
			return false;
		}else if (board.get(11) != 12) {
			return false;
		}else if (board.get(12) != 13) {
			return false;
		}else if (board.get(13) != 14) {
			return false;
		}else if (board.get(14) != 15) {
			return false;
		}
			return true;
	}

	public void moveTile(int nr) {
		int id = -1;

		for (Integer b : board) {
			if (b.equals(nr)) {
				id = board.indexOf(b);
				break;
			}
		}

		if (id - 1 >= 0 && board.get(id - 1) == 0 && id != 0 && id != 4 && id != 8 && id != 12) {
			Collections.swap(board, id, id - 1);
		}
		if (id - 4 >= 0 && board.get(id - 4) == 0) {
			Collections.swap(board, id, id - 4);
		}
		if (id + 1 <= 15 && board.get(id + 1) == 0 && id != 3 && id != 7 && id != 11 && id != 15) {
			Collections.swap(board, id, id + 1);
		}
		if (id + 4 <= 15 && board.get(id + 4) == 0) {
			Collections.swap(board, id, id + 4);
		}
	}
}