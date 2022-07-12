package elements;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class Square extends StackPane{
	Rectangle rec = new Rectangle();
	public Square(int input_text) {
		rec.setWidth(25.0f); 
	    rec.setHeight(25.0f); 
	    rec.setFill(Color.web("#b0ceeb",1.0));
	    Label label = new Label();
	    label.setText(Integer.toString(input_text));
	    getChildren().add(rec);
	    getChildren().add(label);
	}
	public void setAxis(double X, double Y) {
		this.setLayoutX(X);
		this.setLayoutY(Y);
	}
	public void setFill(String fill) {
		rec.setFill(Color.web(fill,1.0));
	}
}