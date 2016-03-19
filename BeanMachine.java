//u10416021 張馨容
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class BeanMachine extends Application {
  // Override the start method in the Application class
  @Override 
  public void start(Stage primaryStage) {   
    // Create a scene, place it in the stage and set the width and height
    Scene scene = new Scene(new MyPolyLine(), 400, 400);
    // Set the stage title
    primaryStage.setTitle("BeanMachine"); 
    //Place the scene in the stage
    primaryStage.setScene(scene);
    // Display the stage
    primaryStage.show();
  }
}

class MyPolyLine extends Pane {
  private void paint() {
    // Create a polyline
    Polyline polyline = new Polyline();
    //set the color
    polyline.setFill(Color.WHITE);
    polyline.setStroke(Color.BLACK);
    //Creates a polyline, defined by the array of the segment points.
    ObservableList<Double> list = polyline.getPoints();
    //Add points to polyline
    polyline.getPoints().addAll(new Double[]{
    185.0, 40.0 ,
    185.0, 70.0 ,
    80.0 , 300.0,
    80.0 , 360.0,
    320.0, 360.0,
    320.0, 300.0,
    215.0, 70.0 ,
    215.0, 40.0 });
    
    //layer1 includes one circle, set its coodinate and radius
    Circle circle1 = new Circle();
	circle1.setCenterX(200.0);circle1.setCenterY(80.0);circle1.setRadius(5.0);
	//layer2 includes two circle, set its coodinate and radius
	Circle circle2 = new Circle();
	circle2.setCenterX(185.0);circle2.setCenterY(115.0);circle2.setRadius(5.0);
    Circle circle3 = new Circle();
	circle3.setCenterX(215.0);circle3.setCenterY(115.0);circle3.setRadius(5.0);
   	//layer3 includes three circle, set its coodinate and radius
    Circle circle4 = new Circle();
	circle4.setCenterX(170.0);circle4.setCenterY(150.0);circle4.setRadius(5.0);
    Circle circle5 = new Circle();
	circle5.setCenterX(200.0);circle5.setCenterY(150.0);circle5.setRadius(5.0);
    Circle circle6 = new Circle();
	circle6.setCenterX(230.0);circle6.setCenterY(150.0);circle6.setRadius(5.0);
	//layer4 includes four circle, set its coodinate and radius
	Circle circle7 = new Circle();
	circle7.setCenterX(155.0);circle7.setCenterY(185.0);circle7.setRadius(5.0);
	Circle circle8 = new Circle();
	circle8.setCenterX(185.0);circle8.setCenterY(185.0);circle8.setRadius(5.0);
	Circle circle9 = new Circle();
	circle9.setCenterX(215.0);circle9.setCenterY(185.0);circle9.setRadius(5.0);
	Circle circle10 = new Circle();
	circle10.setCenterX(245.0);circle10.setCenterY(185.0);circle10.setRadius(5.0);
	//layer5 includes five circle, set its coodinate and radius
	Circle circle11 = new Circle();
	circle11.setCenterX(140.0);circle11.setCenterY(220.0);circle11.setRadius(5.0);
	Circle circle12 = new Circle();
	circle12.setCenterX(170.0);circle12.setCenterY(220.0);circle12.setRadius(5.0);
	Circle circle13 = new Circle();
	circle13.setCenterX(200.0);circle13.setCenterY(220.0);circle13.setRadius(5.0);
	Circle circle14 = new Circle();
	circle14.setCenterX(230.0);circle14.setCenterY(220.0);circle14.setRadius(5.0);
	Circle circle15 = new Circle();
	circle15.setCenterX(260.0);circle15.setCenterY(220.0);circle15.setRadius(5.0);
	//layer6 includes six circle, set its coodinate and radius
	Circle circle16 = new Circle();
	circle16.setCenterX(125.0);circle16.setCenterY(255.0);circle16.setRadius(5.0);
	Circle circle17 = new Circle();
	circle17.setCenterX(155.0);circle17.setCenterY(255.0);circle17.setRadius(5.0);
	Circle circle18 = new Circle();
	circle18.setCenterX(185.0);circle18.setCenterY(255.0);circle18.setRadius(5.0);
	Circle circle19 = new Circle();
	circle19.setCenterX(215.0);circle19.setCenterY(255.0);circle19.setRadius(5.0);
	Circle circle20 = new Circle();
	circle20.setCenterX(245.0);circle20.setCenterY(255.0);circle20.setRadius(5.0);
	Circle circle21 = new Circle();
	circle21.setCenterX(275.0);circle21.setCenterY(255.0);circle21.setRadius(5.0);
	//layer7 includes seven circle, set its coodinate and radius
	Circle circle22 = new Circle();
	circle22.setCenterX(110.0);circle22.setCenterY(290.0);circle22.setRadius(5.0);
	Circle circle23 = new Circle();
	circle23.setCenterX(140.0);circle23.setCenterY(290.0);circle23.setRadius(5.0);
	Circle circle24 = new Circle();
	circle24.setCenterX(170.0);circle24.setCenterY(290.0);circle24.setRadius(5.0);
	Circle circle25 = new Circle();
	circle25.setCenterX(200.0);circle25.setCenterY(290.0);circle25.setRadius(5.0);
	Circle circle26 = new Circle();
	circle26.setCenterX(230.0);circle26.setCenterY(290.0);circle26.setRadius(5.0);
	Circle circle27 = new Circle();
	circle27.setCenterX(260.0);circle27.setCenterY(290.0);circle27.setRadius(5.0);
	Circle circle28 = new Circle();
	circle28.setCenterX(290.0);circle28.setCenterY(290.0);circle28.setRadius(5.0);
	//line1 -> Forming first slot.
	Line line1 = new Line();
	line1.setStartX(110.0);line1.setStartY(290.0);line1.setEndX(110.0);line1.setEndY(360.0);
    //line2 -> Forming second slot.
	Line line2 = new Line();
	line2.setStartX(140.0);line2.setStartY(290.0);line2.setEndX(140.0);line2.setEndY(360.0);
	//line3 -> Forming third slot.
	Line line3 = new Line();
	line3.setStartX(170.0);line3.setStartY(290.0);line3.setEndX(170.0);line3.setEndY(360.0);
	//line4 -> Forming fourth slot.
	Line line4 = new Line();
	line4.setStartX(200.0);line4.setStartY(290.0);line4.setEndX(200.0);line4.setEndY(360.0);
	//line5 -> Forming fifth slot.
	Line line5 = new Line();
	line5.setStartX(230.0);line5.setStartY(290.0);line5.setEndX(230.0);line5.setEndY(360.0);
	//line6 -> Forming sixth slot.
	Line line6 = new Line();
	line6.setStartX(260.0);line6.setStartY(290.0);line6.setEndX(260.0);line6.setEndY(360.0);
	//line7 -> Forming seventh slot.
	Line line7 = new Line();
	line7.setStartX(290.0);line7.setStartY(290.0);line7.setEndX(290.0);line7.setEndY(360.0);
	
    //remove all items from the collection
    getChildren().clear();
    //add components to the list
    getChildren().add(polyline); 
    getChildren().add(circle1); 
	getChildren().add(circle2);
	getChildren().add(circle3);
	getChildren().add(circle4);
	getChildren().add(circle5);
	getChildren().add(circle6);
	getChildren().add(circle7);
	getChildren().add(circle8);
	getChildren().add(circle9);
	getChildren().add(circle10);
	getChildren().add(circle11);
	getChildren().add(circle12);
	getChildren().add(circle13);
	getChildren().add(circle14);
	getChildren().add(circle15);
	getChildren().add(circle16);
	getChildren().add(circle17);
	getChildren().add(circle18);
	getChildren().add(circle19);
	getChildren().add(circle20);
	getChildren().add(circle21);
	getChildren().add(circle22);
	getChildren().add(circle23);
	getChildren().add(circle24);
	getChildren().add(circle25);
	getChildren().add(circle26);
	getChildren().add(circle27);
	getChildren().add(circle28);
	getChildren().add(line1);
	getChildren().add(line2);
	getChildren().add(line3);
	getChildren().add(line4);
	getChildren().add(line5);
	getChildren().add(line6);
	getChildren().add(line7);


  }
  //set width
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paint();
  }
  //set height
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paint();
  }
}