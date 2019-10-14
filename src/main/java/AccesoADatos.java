
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccesoADatos extends Application {

	private TextField rutaAct;
	private Label nomalumn;
	private Button crear;
	private Button eliminar;
	private Button mover;
	private CheckBox isCarpet;
	private CheckBox isFile;
	private TextField carpDestino;
	private Button showficar;
	private ListView<String> listado;
	private Button showContent;
	private Button modFile;
	private TextArea contentFile;
	private HBox botones;
	private VBox contentbuttons;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
	nomalumn = new Label("Nombre del alumno");
	rutaAct = new TextField();	
	
	crear = new Button("Crear");
	crear.setOnAction(e->onCrearButton(e));
	
	eliminar = new Button("Eliminar");
	eliminar.setOnAction(e->onEliminarButton(e));
	
	mover = new Button("Mover");
	mover.setOnAction(e->onMoverButton(e));
	
	isCarpet = new CheckBox("Es carpeta");
	isFile = new CheckBox("Es fichero");
	
	botones = new HBox(crear,eliminar,mover,isCarpet,isFile);
	botones.setAlignment(Pos.CENTER);
	botones.setSpacing(60);
	
	carpDestino = new TextField();
	carpDestino.setPromptText("Carpeta o fichero a crear, eliminar o destino a mover");
	
	showficar =  new Button("Ver ficheros o carpetas");
	showficar.setOnAction(e->onShowficarButton(e));
	
	listado = new ListView<String>();
	
	showContent = new Button("Ver Contenido Fichero");
	showContent.setPrefWidth(150);
	showContent.setOnAction(e->onShowContentAction(e));
	
	modFile = new Button("Modificar fichero");
	modFile.setPrefWidth(150);
	modFile.setOnAction(e->onModFile(e));
	
	contentFile = new TextArea();
	contentFile.setPromptText("Contenido del fichero");
	contentFile.setDisable(true);
	
	contentbuttons = new VBox(showContent,modFile);
	contentbuttons.setSpacing(10);
		
	GridPane panelInt = new GridPane();

	panelInt.setPadding(new Insets(10));
	panelInt.setAlignment(Pos.TOP_LEFT);
	panelInt.setHgap(5);
	panelInt.setVgap(5);

	
	panelInt.addRow(0, new Label("Ruta Actual"), rutaAct);
	panelInt.addRow(1,botones);
	panelInt.addRow(2, carpDestino);
	panelInt.addRow(3, showficar);
	panelInt.addRow(4, listado);
	panelInt.addRow(5, contentbuttons,contentFile);

	
	ColumnConstraints [] cols = {
			new ColumnConstraints(),
			new ColumnConstraints(),
	};
	
	cols[0].setHalignment(HPos.LEFT);
	cols[1].setHgrow(Priority.ALWAYS);
	cols[1].setFillWidth(true);
	

	panelInt.getColumnConstraints().setAll(cols);

	panelInt.setColumnSpan(botones, 2);
	panelInt.setColumnSpan(carpDestino, 2);
	panelInt.setColumnSpan(listado, 2);
	panelInt.setColumnSpan(showficar, 2);



	
	BorderPane panelExt = new BorderPane(panelInt);
	panelExt.setTop(nomalumn);
	BorderPane.setAlignment(nomalumn, Pos.CENTER);
	
	
	TabPane root = new TabPane();
		
	Tab pestaña = new Tab("Acceso a ficheros");
	pestaña.setContent(panelExt);
	root.getTabs().add(pestaña);
	root.getTabs().add(new Tab("Acceso aleatorio"));
	root.getTabs().add(new Tab("Acceso XML"));

	Scene scene = new Scene(root,640,480);
	primaryStage.setScene(scene);
	primaryStage.setTitle("AccesoAdatos");
	primaryStage.show();
		
	}

	private Object onModFile(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object onShowContentAction(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object onShowficarButton(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object onMoverButton(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object onEliminarButton(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	private void onCrearButton(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
