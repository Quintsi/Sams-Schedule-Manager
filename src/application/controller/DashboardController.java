package application.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class DashboardController {
	
	@FXML
	private BorderPane dashboard;
	
	public void initialize() {
		dashboard.setLayoutX(400);
		dashboard.setLayoutY(0);
	}

}
