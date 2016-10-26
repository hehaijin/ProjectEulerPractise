import javafx.application.Application;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class ZdepthDemo extends Application
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
  /*
    Cylinder cylinder = new Cylinder(40, 120);
    cylinder.setTranslateX(100);
    cylinder.setTranslateY(125);
    cylinder.setTranslateZ(60);
    */
    Sphere sp=new Sphere(100,10);
    sp.getTransforms().add(new Translate(200,200,200));
    sp.setDrawMode(DrawMode.LINE);
    
    PointLight light = new PointLight();
    light.setTranslateX(350);
    light.setTranslateY(100);
    light.setTranslateZ(-300);

    final PhongMaterial redMaterial = new PhongMaterial();
    redMaterial.setDiffuseColor(Color.DARKRED);
    redMaterial.setSpecularColor(Color.RED);

    final PhongMaterial greenMaterial = new PhongMaterial();
    greenMaterial.setDiffuseColor(Color.DARKGREEN);
    greenMaterial.setSpecularColor(Color.GREEN);

    final PhongMaterial blueMaterial = new PhongMaterial();
    blueMaterial.setDiffuseColor(Color.DARKBLUE);
    blueMaterial.setSpecularColor(Color.BLUE);

    final Box xAxis = new Box(500, 5, 5);
    final Box yAxis = new Box(5, 500, 5);
    final Box zAxis = new Box(5, 5, 500);

    xAxis.setMaterial(redMaterial);
    yAxis.setMaterial(greenMaterial);
    zAxis.setMaterial(blueMaterial);
    
    
    Rectangle r1=new Rectangle(0,0,100,100);
    r1.setTranslateZ(30);
    r1.setFill(Color.RED);

    Rectangle r2=new Rectangle(50,50,100,100);
    r2.setTranslateZ(50);
    r2.setFill(Color.GREEN);

    Group gr=new Group(xAxis,yAxis,zAxis);
    gr.setTranslateX(100);
    gr.setTranslateY(100);
    gr.setTranslateZ(100);
    Scene scene=new Scene(gr, 600,600,true);
    r1.setDepthTest(DepthTest.ENABLE);
    r2.setDepthTest(DepthTest.ENABLE);
    PerspectiveCamera camera = new PerspectiveCamera(false);
    camera.setTranslateX(0);
    camera.setTranslateY(0);
    camera.setTranslateZ(0);
    scene.setCamera(camera);
    
    
    
    primaryStage.setScene(scene);
    primaryStage.show();
    
    
  }

}
