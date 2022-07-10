package elements;

import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.scene.paint.Color;

public class Square extends StackPane {
	public Rectangle rec = new Rectangle();

	public TranslateTransition move(double X, double Y) {
		TranslateTransition t = new TranslateTransition();
		t.setNode(this);
		t.setDuration(Duration.millis(5000));
		t.setByX(X);
		t.setByY(Y);
		return t;
	}

	public TranslateTransition moveX(double X) {
		TranslateTransition t = new TranslateTransition();
		t.setNode(this);
		t.setDuration(Duration.millis(500));
		t.setByX(X);
		return t;
	}

	public TranslateTransition moveY(double Y) {
		TranslateTransition t = new TranslateTransition();
		t.setNode(this);
		t.setDuration(Duration.millis(500));
		t.setByY(Y);
		return t;
	}
	
	public Square(int strInputNumber) {
		rec.setWidth(60.0f); 
	    rec.setHeight(60.0f); 
	    rec.setFill(Color.web("#b0ceeb",1.0));
	    Label label = new Label();
	    label.setText(Integer.toString(strInputNumber));
	    label.setFont(Font.font("verdana", FontPosture.REGULAR, 14));;
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