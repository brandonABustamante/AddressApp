module AddressApp {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens com.bab.address to javafx.graphics, javafx.fxml;
	
}
