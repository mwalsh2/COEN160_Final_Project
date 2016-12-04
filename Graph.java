package sourceSystem;

/* https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/swing-fx-interoperability.htm 
 * useful link for integrating javafx and swing
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class Graph extends Application {
    final static String wednesday = "Wednesday";
    final static String thursday = "Thursday";
    final static String friday = "Friday";
    final static String saturday = "Saturday";
    final static String sunday = "Sunday";
    final static String monday = "Monday";
    final static String tuesday = "Tuesday";
    
    @Override public void start(Stage stage) {
        stage.setTitle("Water Usage");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Water Usage");
        xAxis.setLabel("Day");       
        yAxis.setLabel("Gallons");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Water");       
        series1.getData().add(new XYChart.Data(wednesday, 1200));
        series1.getData().add(new XYChart.Data(thursday, 800));
        series1.getData().add(new XYChart.Data(friday, 2400));
        series1.getData().add(new XYChart.Data(saturday, 1800));
        series1.getData().add(new XYChart.Data(sunday, 800));     
        series1.getData().add(new XYChart.Data(monday, 1200)); 
        series1.getData().add(new XYChart.Data(tuesday, 645)); 
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}