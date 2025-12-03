package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NavigationController {

	@FXML
	BorderPane navigation;
	Button dashboardButton;
	Button appointmentButton;
	Button clientButton;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void setStage (Stage stage, Scene scene, Parent root){
		this.stage = stage;
		this.scene = scene;
		this.root = root;
	}
	
	public void switchToDashboard(ActionEvent e) throws IOException {
		FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("/application/view/DashboardView.fxml"));
		Parent dashboard = dashboardLoader.load();
		
		((BorderPane) root).setCenter(dashboard);
	}
	
	public void switchToAppointment(ActionEvent e) throws IOException {
		FXMLLoader appointmentLoader = new FXMLLoader(getClass().getResource("/application/view/AppointmentView.fxml"));
		Parent appointment = appointmentLoader.load();
		
		((BorderPane) root).setCenter(appointment);
	}
	
	public void switchToClient(ActionEvent e) throws IOException {
		FXMLLoader clientLoader = new FXMLLoader(getClass().getResource("/application/view/ClientView.fxml"));
		Parent client = clientLoader.load();
		
		((BorderPane) root).setCenter(client);
	}
	
}
