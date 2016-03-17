import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
public class BeanGame extends Application  {
	@Override
	public void start(Stage primaryStage) {
		Pane a=new Pane();
		
		Line x1=new Line();
		x1.setStartX(150.0f);
		x1.setStartY(0.0f);
		x1.setEndX(150.0f);
		x1.setEndY(50.0f);
		Line x2=new Line();
		x2.setStartX(250.0f);
		x2.setStartY(0.0f);
		x2.setEndX(250.0f);
		x2.setEndY(50.0f);
		Line x3=new Line();
		x3.setStartX(150.0f);
		x3.setStartY(50.0f);
		x3.setEndX(0.0f);
		x3.setEndY(400.0f);
		Line x4=new Line();
		x4.setStartX(250.0f);
		x4.setStartY(50.0f);
		x4.setEndX(400.0f);
		x4.setEndY(400.0f);
		Line x5=new Line();
		x5.setStartX(0.0f);
		x5.setStartY(400.0f);
		x5.setEndX(0.0f);
		x5.setEndY(500.0f);
		Line x6=new Line();
		x6.setStartX(50.0f);
		x6.setStartY(400.0f);
		x6.setEndX(50.0f);
		x6.setEndY(500.0f);
		Line x7=new Line();
		x7.setStartX(100.0f);
		x7.setStartY(400.0f);
		x7.setEndX(100.0f);
		x7.setEndY(500.0f);
		Line x8=new Line();
		x8.setStartX(150.0f);
		x8.setStartY(400.0f);
		x8.setEndX(150.0f);
		x8.setEndY(500.0f);
		Line x9=new Line();
		x9.setStartX(200.0f);
		x9.setStartY(400.0f);
		x9.setEndX(200.0f);
		x9.setEndY(500.0f);
		Line x10=new Line();
		x10.setStartX(250.0f);
		x10.setStartY(400.0f);
		x10.setEndX(250.0f);
		x10.setEndY(500.0f);
		Line x11=new Line();
		x11.setStartX(300.0f);
		x11.setStartY(400.0f);
		x11.setEndX(300.0f);
		x11.setEndY(500.0f);
		Line x12=new Line();
		x12.setStartX(350.0f);
		x12.setStartY(400.0f);
		x12.setEndX(350.0f);
		x12.setEndY(500.0f);
		Line x13=new Line();
		x13.setStartX(400.0f);
		x13.setStartY(400.0f);
		x13.setEndX(400.0f);
		x13.setEndY(500.0f);
		Line x14=new Line();
		x14.setStartX(0.0f);
		x14.setStartY(500.0f);
		x14.setEndX(400.0f);
		x14.setEndY(500.0f);
		
		
		Circle y1=new Circle();
		y1.setStyle("-fx-fill:DODGERBLUE;-fx-layoutX:248.0;-fx-layoutY:270.0;-fx-radius:11.0;-fx-stroke:BLACK;-fx-strokeType:INSIDE;");
		a.getChildren().addAll(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14);
		Scene scene = new Scene(a, 400, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}