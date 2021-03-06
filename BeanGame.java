import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
public class BeanGame extends Application  {
	@Override
	public void start(Stage primaryStage) {
		Pane a=new Pane();//先給一個版版
		
		Line x1=new Line();//開始畫線
		x1.setStartX(150.0f);//起始X位置
		x1.setStartY(0.0f);//起始Y位置
		x1.setEndX(150.0f);//結束X位置
		x1.setEndY(50.0f);//結束Y位置
		Line x2=new Line();//以此類推吧....
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
		
		
		Circle y1=new Circle();//開始畫圈圈(先到牆角!?)
		y1.setStyle("-fx-fill:DODGERBLUE;");//可愛的藍藍球
		y1.setCenterX(50.0f);//中心位置的X軸
		y1.setCenterY(400.0f);//中心位置的Y軸
		y1.setRadius(12.0f);//半徑12
		Circle y2=new Circle();//以此類推......
		y2.setStyle("-fx-fill:DODGERBLUE;");
		y2.setCenterX(100.0f);
		y2.setCenterY(400.0f);
		y2.setRadius(12.0f);
		Circle y3=new Circle();
		y3.setStyle("-fx-fill:DODGERBLUE;");
		y3.setCenterX(150.0f);
		y3.setCenterY(400.0f);
		y3.setRadius(12.0f);
		Circle y4=new Circle();
		y4.setStyle("-fx-fill:DODGERBLUE;");
		y4.setCenterX(200.0f);
		y4.setCenterY(400.0f);
		y4.setRadius(12.0f);
		Circle y5=new Circle();
		y5.setStyle("-fx-fill:DODGERBLUE;");
		y5.setCenterX(250.0f);
		y5.setCenterY(400.0f);
		y5.setRadius(12.0f);
		Circle y6=new Circle();
		y6.setStyle("-fx-fill:DODGERBLUE;");
		y6.setCenterX(300.0f);
		y6.setCenterY(400.0f);
		y6.setRadius(12.0f);
		Circle y7=new Circle();
		y7.setStyle("-fx-fill:DODGERBLUE;");
		y7.setCenterX(350.0f);
		y7.setCenterY(400.0f);
		y7.setRadius(12.0f);
		Circle y8=new Circle();
		y8.setStyle("-fx-fill:DODGERBLUE;");
		y8.setCenterX(75.0f);
		y8.setCenterY(350.0f);
		y8.setRadius(12.0f);
		Circle y9=new Circle();
		y9.setStyle("-fx-fill:DODGERBLUE;");
		y9.setCenterX(125.0f);
		y9.setCenterY(350.0f);
		y9.setRadius(12.0f);
		Circle y10=new Circle();
		y10.setStyle("-fx-fill:DODGERBLUE;");
		y10.setCenterX(175.0f);
		y10.setCenterY(350.0f);
		y10.setRadius(12.0f);
		Circle y11=new Circle();
		y11.setStyle("-fx-fill:DODGERBLUE;");
		y11.setCenterX(225.0f);
		y11.setCenterY(350.0f);
		y11.setRadius(12.0f);
		Circle y12=new Circle();
		y12.setStyle("-fx-fill:DODGERBLUE;");
		y12.setCenterX(275.0f);
		y12.setCenterY(350.0f);
		y12.setRadius(12.0f);
		Circle y13=new Circle();
		y13.setStyle("-fx-fill:DODGERBLUE;");
		y13.setCenterX(325.0f);
		y13.setCenterY(350.0f);
		y13.setRadius(12.0f);
		Circle y14=new Circle();
		y14.setStyle("-fx-fill:DODGERBLUE;");
		y14.setCenterX(100.0f);
		y14.setCenterY(300.0f);
		y14.setRadius(12.0f);
		Circle y15=new Circle();
		y15.setStyle("-fx-fill:DODGERBLUE;");
		y15.setCenterX(150.0f);
		y15.setCenterY(300.0f);
		y15.setRadius(12.0f);
		Circle y16=new Circle();
		y16.setStyle("-fx-fill:DODGERBLUE;");
		y16.setCenterX(200.0f);
		y16.setCenterY(300.0f);
		y16.setRadius(12.0f);
		Circle y17=new Circle();
		y17.setStyle("-fx-fill:DODGERBLUE;");
		y17.setCenterX(250.0f);
		y17.setCenterY(300.0f);
		y17.setRadius(12.0f);
		Circle y18=new Circle();
		y18.setStyle("-fx-fill:DODGERBLUE;");
		y18.setCenterX(300.0f);
		y18.setCenterY(300.0f);
		y18.setRadius(12.0f);
		Circle y19=new Circle();
		y19.setStyle("-fx-fill:DODGERBLUE;");
		y19.setCenterX(125.0f);
		y19.setCenterY(250.0f);
		y19.setRadius(12.0f);
		Circle y20=new Circle();
		y20.setStyle("-fx-fill:DODGERBLUE;");
		y20.setCenterX(175.0f);
		y20.setCenterY(250.0f);
		y20.setRadius(12.0f);
		Circle y21=new Circle();
		y21.setStyle("-fx-fill:DODGERBLUE;");
		y21.setCenterX(225.0f);
		y21.setCenterY(250.0f);
		y21.setRadius(12.0f);
		Circle y22=new Circle();
		y22.setStyle("-fx-fill:DODGERBLUE;");
		y22.setCenterX(275.0f);
		y22.setCenterY(250.0f);
		y22.setRadius(12.0f);
		Circle y23=new Circle();
		y23.setStyle("-fx-fill:DODGERBLUE;");
		y23.setCenterX(150.0f);
		y23.setCenterY(200.0f);
		y23.setRadius(12.0f);
		Circle y24=new Circle();
		y24.setStyle("-fx-fill:DODGERBLUE;");
		y24.setCenterX(200.0f);
		y24.setCenterY(200.0f);
		y24.setRadius(12.0f);
		Circle y25=new Circle();
		y25.setStyle("-fx-fill:DODGERBLUE;");
		y25.setCenterX(250.0f);
		y25.setCenterY(200.0f);
		y25.setRadius(12.0f);
		Circle y26=new Circle();
		y26.setStyle("-fx-fill:DODGERBLUE;");
		y26.setCenterX(175.0f);
		y26.setCenterY(150.0f);
		y26.setRadius(12.0f);
		Circle y27=new Circle();
		y27.setStyle("-fx-fill:DODGERBLUE;");
		y27.setCenterX(225.0f);
		y27.setCenterY(150.0f);
		y27.setRadius(12.0f);
		Circle y28=new Circle();
		y28.setStyle("-fx-fill:DODGERBLUE;");
		y28.setCenterX(200.0f);
		y28.setCenterY(100.0f);
		y28.setRadius(12.0f);
		
		
		a.getChildren().addAll(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,
y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28);//把剛剛的線線和圈圈都加到版版裡
		Scene scene = new Scene(a, 400, 500);//包裝好丟上舞台瞜
		primaryStage.setScene(scene);
		primaryStage.show();//演員出場啦
	}
	public static void main(String[] args) {
		launch(args);
	}
}
