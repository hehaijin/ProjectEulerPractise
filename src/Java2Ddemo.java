
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Java2Ddemo extends Application
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    launch(args);

  }

  
  
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub
    primaryStage.setTitle("a 2d transformation demo");
    Pane root=new Pane();
    
    Rectangle r=new Rectangle(100,5);    
    Rectangle r2=new Rectangle(100,5);    
    root.getChildren().add(r);
    root.getChildren().add(r2);
    r.getTransforms().add(new Translate(300,300));
    r2.getTransforms().add(new Translate(300,300));
    r.getTransforms().add(new Rotate(45));
    r2.getTransforms().add(new Rotate(45));
  //r.setRotate(90);
   /*
    Line l=new Line();
    l.setStartX(0);
    l.setStartX(100);
    l.setStartY(0);
    l.setStartY(100);
    
    root.getChildren().add(l);
    
      */
    final long startNanoTime = System.nanoTime();
    
    
    new AnimationTimer()
    {
        public void handle(long currentNanoTime)
        {
            double t = (currentNanoTime - startNanoTime) / 1_000_000_000.0; 
            r.getTransforms().add(new Rotate(10,50,2.5));
            
        }
    }.start();
  
    
    
    
    

    System.out.println("bounds in local "+r.getBoundsInLocal());
    System.out.println("bounds in Parent "+r.getBoundsInParent());
    System.out.println("Layout Bounds "+r.getLayoutBounds());
    primaryStage.setScene(new Scene(root,600,600));
    primaryStage.show();
    
    
    
    
    
    
  }

}
