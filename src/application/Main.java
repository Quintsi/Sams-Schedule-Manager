package application;

import application.controller.NavigationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			FXMLLoader navigationLoader = new FXMLLoader(getClass().getResource("view/NavigationView.fxml"));
			Parent navigation = navigationLoader.load();
			FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("view/DashboardView.fxml"));
			Parent dashboard = dashboardLoader.load();
			FXMLLoader clientLoader = new FXMLLoader(getClass().getResource("view/ClientView.fxml"));
			Parent client = clientLoader.load();
			FXMLLoader appointmentLoader = new FXMLLoader(getClass().getResource("view/AppointmentView.fxml"));
			Parent appointment = appointmentLoader.load();
			
			BorderPane root = new BorderPane();
			root.setLeft(navigation);
			root.setCenter(dashboard);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			NavigationController navigationController = navigationLoader.getController();
			navigationController.setStage(stage, scene, root);
			
			stage.setTitle("Sam's Grooming Management");
			
			Image icon = new Image(getClass().getResourceAsStream("/images/Grooming-Logo.jpg"));
			stage.getIcons().add(icon);
			
			stage.setScene(scene);
			stage.setWidth(1100);
			stage.setHeight(700);
			stage.setResizable(false);
			
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
