module projet_ihm {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
