package ir.ac.kntu;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.ArrayList;
import java.util.Timer;

import static ir.ac.kntu.MakeSoldier.*;

public class Main extends Application {
    private static int money = 100;
    private static int level = 0;
    private static final ArrayList<EnemySoldier> ENEMY_SOLDIERS = new ArrayList<>();
    private static final ArrayList<AllySoldier> ALLY_SOLDIERS = new ArrayList<>();
    private double orgSceneX, orgSceneY;
    private Stage window;

    private Circle createCircle(double x, double y, double r, Color color) {
        Circle circle = new Circle(x, y, r, color);
        circle.setCursor(Cursor.HAND);
        circle.setOnMousePressed((t) -> {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();

            Circle c = (Circle) (t.getSource());
            c.toFront();
        });
        circle.setOnMouseDragged((t) -> {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;

            Circle c = (Circle) (t.getSource());

            c.setCenterX(c.getCenterX() + offsetX);
            c.setCenterY(c.getCenterY() + offsetY);

            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
        });
        return circle;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Group root = new Group();
        Group root1 = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Group root4 = new Group();
        Scene round1Scene = new Scene(root, 800, 600, false, SceneAntialiasing.BALANCED);
        Scene round2Scene = new Scene(root4, 800, 600, false);
        Rectangle container = new Rectangle();
        container.setX(100);
        container.setY(100);
        container.setFill(Color.RED);
        Rectangle van = new Rectangle();
        van.setX(100);
        van.setY(100);
        van.setFill(Color.GREEN);
        Rectangle truck = new Rectangle();
        truck.setX(100);
        truck.setY(100);
        truck.setFill(Color.YELLOW);
        Label label1 = new Label("Welcome Menu");
        Button button2 = new Button("chose soldiers");
        button2.setTranslateY(50);
        Button button3 = new Button("Exit");
        button3.setOnAction(e -> window.close());
        button3.setTranslateY(100);
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button2, button3);
        Button playButton = new Button("Back to menu");
        root1.getChildren().addAll(label1, button2, button3, container);
        Scene scene1 = new Scene(root1, 300, 300, Color.PURPLE);
        Button back2Button = new Button("Back");
        back2Button.setTranslateX(10.0);
        back2Button.setTranslateY(570.0);
        primaryStage.setScene(scene1);
        playButton.setTranslateX(10.0);
        playButton.setTranslateY(570.0);
        Button playButton1 = new Button("Round 1");
        playButton1.setTranslateX(120);
        playButton1.setTranslateY(50);
        Button playButton2 = new Button("Round 2");
        playButton2.setTranslateX(120);
        playButton2.setTranslateY(150);
        playButton1.setOnAction(e -> window.setScene(round1Scene));
        playButton2.setOnAction(e -> window.setScene(round2Scene));
        Scene scene3 = new Scene(root3, 300, 300, Color.CHOCOLATE);
        playButton.setOnAction(e -> window.setScene(scene1));
        Label label2 = new Label("chose your soldiers");
        Button backButton = new Button("Back to the menu");
        backButton.setOnAction(e -> window.setScene(scene1));
        Button button1 = new Button("Go to the game");
        button1.setTranslateY(50);
        button1.setOnAction(e -> window.setScene(scene3));
        back2Button.setOnAction(e -> window.setScene(scene3));
        Button menuButton = new Button("Back to menu");
        menuButton.setTranslateX(10);
        menuButton.setTranslateY(250);
        menuButton.setOnAction(e -> window.setScene(scene1));
        root3.getChildren().addAll(playButton1, playButton2, menuButton);
        Camera camera = new ParallelCamera();
        round1Scene.setCamera(camera);
        window.setTitle("Game");
        final Circle[] circle = new Circle[1];
        final Circle[] circle1 = new Circle[1];
        final Circle[] circle2 = new Circle[1];
        final Circle[] circle3 = new Circle[1];
        final Circle[] circle4 = new Circle[1];
        final Circle[] circle5 = new Circle[1];
        final Circle[] circle6 = new Circle[1];
        final Circle[] circle7 = new Circle[1];
        final Circle[] circle8 = new Circle[1];
        final Circle[] circle9 = new Circle[1];
        final Circle[] circle10 = new Circle[1];
        final Circle[] circle11 = new Circle[1];
        Circle testCircle1 = new Circle(20, Color.PINK);
        testCircle1.setCenterX(50);
        testCircle1.setCenterY(150);
        Circle testCircle2 = new Circle(20, Color.BLACK);
        testCircle2.setCenterX(200);
        testCircle2.setCenterY(150);
        Circle testCircle3 = new Circle(20, Color.PURPLE);
        testCircle3.setCenterX(350);
        testCircle3.setCenterY(150);
        Circle testCircle4 = new Circle(20, Color.DARKBLUE);
        testCircle4.setCenterX(500);
        testCircle4.setCenterY(150);
        Circle testCircle5 = new Circle(20, Color.YELLOW);
        testCircle5.setCenterX(650);
        testCircle5.setCenterY(150);
        Circle testCircle6 = new Circle(20, Color.RED);
        testCircle6.setCenterX(50);
        testCircle6.setCenterY(350);
        Circle testCircle7 = new Circle(20, Color.HOTPINK);
        testCircle7.setCenterX(200);
        testCircle7.setCenterY(350);
        Circle testCircle8 = new Circle(20, Color.BROWN);
        testCircle8.setCenterX(350);
        testCircle8.setCenterY(350);
        Circle testCircle9 = new Circle(20, Color.HONEYDEW);
        testCircle9.setCenterX(500);
        testCircle9.setCenterY(350);
        Circle testCircle10 = new Circle(20, Color.DARKMAGENTA);
        testCircle10.setCenterX(650);
        testCircle10.setCenterY(350);
        Circle testCircle11 = new Circle(20, Color.BLUEVIOLET);
        testCircle11.setCenterX(50);
        testCircle11.setCenterY(550);
        Circle testCircle12 = new Circle(20, Color.AQUA);
        testCircle12.setCenterX(200);
        testCircle12.setCenterY(550);
        root2.getChildren().addAll(label2, backButton, button1, testCircle1, testCircle2, testCircle3, testCircle4, testCircle5, testCircle6, testCircle7, testCircle8, testCircle9, testCircle10, testCircle11, testCircle12);
        Scene scene2 = new Scene(root2, 800, 600, Color.POWDERBLUE);
        button2.setOnAction(e -> window.setScene(scene2));
        Rectangle rectangle = new Rectangle(40, 40, Color.web("0x01abff"));
        Rectangle rectangle2 = new Rectangle(40, 40, Color.web("0x01abff"));
       // Text money = new Text("Money$ :" + money);
        //money.setX(730);
        //money.setY(10.0);
        rectangle.setX(400);
        rectangle.setY(400);
        rectangle2.setX(400);
        rectangle2.setY(400);
        round1Scene.addEventHandler(MouseEvent.MOUSE_MOVED, e -> {
            rectangle.setX(e.getX() - 20);
            rectangle.setY(e.getY() - 20);
        });
        round1Scene.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {
            if (e.isAltDown()) {
                e.consume();
            }
        });
        round2Scene.addEventHandler(MouseEvent.MOUSE_MOVED, e -> {
            rectangle2.setX(e.getX() - 20);
            rectangle2.setY(e.getY() - 20);
        });
        round2Scene.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {
            if (e.isAltDown()) {
                e.consume();
            }
        });
        testCircle1.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {

                        ALLY_SOLDIERS.add(goroSoldier());
                        circle[0] = createCircle(700, 50, 20, Color.PINK);
                        goroSoldier().setCircle(circle[0]);
                        root.getChildren().add(circle[0]);
                        circle[0].toFront();
                    }
                });
        testCircle2.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(ryujiSoldier());
                        circle1[0] = createCircle(700, 100, 20, Color.BLACK);
                        ryujiSoldier().setCircle(circle1[0]);
                        circle1[0].toFront();
                        root.getChildren().add(circle1[0]);
                    }
                });
        testCircle3.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(daigoSoldier());
                        circle2[0] = createCircle(700, 150, 20, Color.PURPLE);
                        daigoSoldier().setCircle(circle2[0]);
                        circle2[0].toFront();
                        root.getChildren().add(circle2[0]);
                    }
                });
        testCircle4.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(osamuSoldier());
                        circle3[0] = createCircle(700, 200, 20, Color.DARKBLUE);
                        osamuSoldier().setCircle(circle3[0]);
                        circle3[0].toFront();
                        root.getChildren().add(circle3[0]);
                    }
                });
        testCircle5.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(kaoraSoldier());
                        circle4[0] = createCircle(700, 250, 20, Color.YELLOW);
                        kaoraSoldier().setCircle(circle4[0]);
                        circle4[0].toFront();
                        root.getChildren().add(circle4[0]);
                    }
                });
        testCircle6.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(makotoSoldier());
                        circle5[0] = createCircle(700, 300, 20, Color.RED);
                        makotoSoldier().setCircle(circle5[0]);
                        circle5[0].toFront();
                        root.getChildren().add(circle5[0]);
                    }
                });
        testCircle7.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(taigaSoldier());
                        circle6[0] = createCircle(700, 350, 20, Color.HOTPINK);
                        taigaSoldier().setCircle(circle6[0]);
                        circle6[0].toFront();
                        root4.getChildren().add(circle6[0]);
                    }
                });
        testCircle8.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(futoshiSoldier());
                        circle7[0] = createCircle(700, 400, 20, Color.BROWN);
                        futoshiSoldier().setCircle(circle7[0]);
                        circle7[0].toFront();
                        root4.getChildren().add(circle7[0]);
                    }
                });
        testCircle9.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(soheiSoldier());
                        circle8[0] = createCircle(700, 450, 20, Color.HONEYDEW);
                        soheiSoldier().setCircle(circle9[0]);
                        circle8[0].toFront();
                        root4.getChildren().add(circle8[0]);
                    }
                });
        testCircle10.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(ryoSoldier());
                        circle9[0] = createCircle(700, 500, 20, Color.DARKMAGENTA);
                        ryoSoldier().setCircle(circle9[0]);
                        circle9[0].toFront();
                        root4.getChildren().add(circle9[0]);
                    }
                });
        testCircle11.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(shintaroSoldier());
                        circle10[0] = createCircle(700, 550, 20, Color.BLUEVIOLET);
                        shintaroSoldier().setCircle(circle10[0]);
                        circle10[0].toFront();
                        root4.getChildren().add(circle10[0]);
                    }
                });
        testCircle12.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        ALLY_SOLDIERS.add(jiroSoldier());
                        circle11[0] = createCircle(600, 130, 20, Color.AQUA);
                        jiroSoldier().setCircle(circle11[0]);
                        circle11[0].toFront();
                        root4.getChildren().add(circle11[0]);
                    }
                });
        new AnimationTimer() {
            @Override
            public void handle(long l) {
                rectangle.setRotate(rectangle.getRotate() + 5);
            }
        }.start();
        new AnimationTimer() {
            @Override
            public void handle(long l) {
                rectangle.setRotate(rectangle2.getRotate() + 5);
            }
        }.start();
        Timer timer = new Timer();
        ProgressBar progressBar = new ProgressBar();
        window.addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, e -> e.consume());
        root.getChildren().addAll(back2Button, rectangle, progressBar);
        root4.getChildren().addAll(playButton, rectangle2,progressBar);
        //timer.schedule(task1, 1000, 500);
        window.setResizable(false);
        round1Scene.setFill(Color.DARKGREEN);
        round2Scene.setFill(Color.CORAL);
        window.show();
    }

    public static void round1(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers, int money, int level) {
        wave1(materials, allySoldiers);
        if (!materials.isEmpty()) {
            money += 50;
            wave2(materials, allySoldiers);
        }
        if (!materials.isEmpty()) {
            money += 100;
            wave3For1(materials, allySoldiers);
        }
        level++;

    }

    public static void round2(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers, int money, int level) {

        if (level >= 1) {
            if (!materials.isEmpty()) {
                money += 150;
                wave2(materials, allySoldiers);
            }
            if (!materials.isEmpty()) {
                money += 250;
                wave3For2(materials, allySoldiers);
            }
            level++;
        }
    }

    public static void wave1(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers) {
        ArrayList soldiers = new ArrayList<>();
        soldiers.add(redSoldier());
        soldiers.add(redSoldier());
        soldiers.add(redSoldier());
        soldiers.add(yellowSoldier());
        soldiers.add(yellowSoldier());
        soldiers.add(yellowSoldier());

    }

    public static void wave2(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers) {
        ArrayList soldiers = new ArrayList<EnemySoldier>();
        soldiers.add(redSoldier());
        soldiers.add(redSoldier());
        soldiers.add(graySoldier());
        soldiers.add(yellowSoldier());
        soldiers.add(yellowSoldier());
        soldiers.add(graySoldier());
       /* for (int i =0; i < allySoldiers.size(); i++){
            for (int j = 0; j < soldiers.size(); j++){
                allySoldiers.get(i).game(allySoldiers.get(i).getCircle().getCenterX(),allySoldiers.get(i).getCircle().getCenterY(),soldiers);
                soldiers.get(j).
            }
        }*/


    }

    public static void wave3For1(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers) {
        ArrayList soldiers = new ArrayList<>();
        soldiers.add(bossLevel1());

    }

    public static void wave3For2(ArrayList<BuildingMaterials> materials, ArrayList<AllySoldier> allySoldiers) {
        ArrayList soldiers = new ArrayList<>();
        soldiers.add(bossLevel2());

    }

}

