package nackademin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class Controller implements Initializable {
	Board board = new Board();
	
	@FXML
	private Button pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14, pos15, pos16;
	
	@FXML
	private void moveTile(ActionEvent event) {
		String nr = ( (Button)event.getSource() ).getText();
		board.moveTile(Integer.valueOf(nr));
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
	}
	

}