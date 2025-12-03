package application;
	
import application.controller.DashboardController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent navigation = FXMLLoader.load(getClass().getResource("view/NavigationView.fxml"));
			FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("view/DashboardView.fxml"));
			Parent dashboard = dashboardLoader.load();
			
			DashboardController controller = dashboardLoader.getController();
			controller.initialize();
			
			Group group = new Group(navigation, dashboard);
			Scene scene = new Scene(group);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Sam's Grooming Management");
			
			Image icon = new Image(getClass().getResourceAsStream("/images/Grooming-Logo.jpg"));
			primaryStage.getIcons().add(icon);
			
			primaryStage.setWidth(1100);
			primaryStage.setHeight(700);
			primaryStage.setResizable(false);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
