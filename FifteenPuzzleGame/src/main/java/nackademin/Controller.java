package nackademin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller implements Initializable {
	Board board = new Board();
	
	@FXML
	private Button pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14, pos15, pos16;
	@FXML
	private Button new_game;
	@FXML
	private Label result;
	
	@FXML
	private void moveTile(ActionEvent event) {
		String nr = ( (Button)event.getSource() ).getText();
		board.moveTile(Integer.valueOf(nr));
		populate();		
		
		if (board.isGameCompleted()) {
			result.setText("Grattis! Du vann!");
		}
	}
	
	@FXML
	private void newGame(ActionEvent event) {
		board = new Board();
		result.setText("");
		populate();
	}
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {	
		populate();
	}
	
	private void populate() {
		pos1.setText(String.valueOf(board.getBoard().get(0)));
		pos2.setText(String.valueOf(board.getBoard().get(1)));
		pos3.setText(String.valueOf(board.getBoard().get(2)));
		pos4.setText(String.valueOf(board.getBoard().get(3)));
		pos5.setText(String.valueOf(board.getBoard().get(4)));
		pos6.setText(String.valueOf(board.getBoard().get(5)));
		pos7.setText(String.valueOf(board.getBoard().get(6)));
		pos8.setText(String.valueOf(board.getBoard().get(7)));
		pos9.setText(String.valueOf(board.getBoard().get(8)));
		pos10.setText(String.valueOf(board.getBoard().get(9)));
		pos11.setText(String.valueOf(board.getBoard().get(10)));
		pos12.setText(String.valueOf(board.getBoard().get(11)));
		pos13.setText(String.valueOf(board.getBoard().get(12)));
		pos14.setText(String.valueOf(board.getBoard().get(13)));
		pos15.setText(String.valueOf(board.getBoard().get(14)));
		pos16.setText(String.valueOf(board.getBoard().get(15))); 
		
		setColorOfMissingTile();
	}
	
private void setColorOfMissingTile () {
		
		String color = "-fx-text-fill: #666666; -fx-background-color: #666666; ";
				
		pos1.setStyle("");
		pos2.setStyle("");
		pos3.setStyle("");
		pos4.setStyle("");
		pos5.setStyle("");
		pos6.setStyle("");
		pos7.setStyle("");
		pos8.setStyle("");
		pos9.setStyle("");
		pos10.setStyle("");
		pos11.setStyle("");
		pos12.setStyle("");
		pos13.setStyle("");
		pos14.setStyle("");
		pos15.setStyle("");
		pos16.setStyle("");
		
		if (pos1.getText().equals("0")) {
			pos1.setStyle(color);
		}
		else if (pos2.getText().equals("0")) {
			pos2.setStyle(color);
		}
		else if (pos3.getText().equals("0")) {
			pos3.setStyle(color);
		}
		else if (pos4.getText().equals("0")) {
			pos4.setStyle(color);
		}
		else if (pos5.getText().equals("0")) {
			pos5.setStyle(color);
		}
		else if (pos6.getText().equals("0")) {
			pos6.setStyle(color);
		}
		else if (pos7.getText().equals("0")) {
			pos7.setStyle(color);
		}
		else if (pos8.getText().equals("0")) {
			pos8.setStyle(color);
		}
		else if (pos9.getText().equals("0")) {
			pos9.setStyle(color);
		}
		else if (pos10.getText().equals("0")) {
			pos10.setStyle(color);
		}
		else if (pos11.getText().equals("0")) {
			pos11.setStyle(color);
		}
		else if (pos12.getText().equals("0")) {
			pos12.setStyle(color);
		}
		else if (pos13.getText().equals("0")) {
			pos13.setStyle(color);
		}
		else if (pos14.getText().equals("0")) {
			pos14.setStyle(color);
		}
		else if (pos15.getText().equals("0")) {
			pos15.setStyle(color);
		}
		else if (pos16.getText().equals("0")) {
			pos16.setStyle(color);
		}	
	}

}