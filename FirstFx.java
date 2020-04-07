
package buildfirst;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstFx extends Application{// application is an abstract class
    // ********** our main thread
    public static void main(String[] args) {
        
        
        launch(args);// primarryStage.show() comes here 
    }
    
    

    // Application abstract class method implementation 

    @Override
    public void start(Stage primaryStage) throws Exception {
      
     
    StackPane pane = new StackPane();// we need to first create a container , that's why we make a pane
    Button btn = new Button();// we want a button on the middle of pane
    btn.setText("click me bosss");// we can initialze also the button object
  
    // set event for every click me bosss
    
    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            System.out.println("i love u boss");
        
        }
    }
    
    
    );
  
    // we need a connection between pane and button 
    
    pane.getChildren().add(btn);// this is the proses
    
    
    Scene scene = new Scene(pane,500,300);// we neeed a platfrome independent scene U& also we should set the perameter
    
    
    primaryStage.setTitle("boss! first gui");// our start method have primaryStage argument
    primaryStage.setScene(scene);// connection between scene and stage
    primaryStage.show();// this show take launch
    
    
    
    
    
    
    }
    
}




** output**'
    
    ant -f C:\\Users\\User\\Documents\\NetBeansProjects\\BuildFirst -Djavac.includes=buildfirst/FirstFx.java -Dnb.internal.action.name=run.single -Drun.class=buildfirst.FirstFx run-single
init:
Deleting: C:\Users\User\Documents\NetBeansProjects\BuildFirst\build\built-jar.properties
deps-jar:
Updating property file: C:\Users\User\Documents\NetBeansProjects\BuildFirst\build\built-jar.properties
Compiling 1 source file to C:\Users\User\Documents\NetBeansProjects\BuildFirst\build\classes
compile-single:
run-single:
i love u boss
i love u boss
i love u boss
BUILD SUCCESSFUL (total time: 8 seconds)


