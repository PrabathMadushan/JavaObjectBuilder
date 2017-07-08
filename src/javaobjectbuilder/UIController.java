package javaobjectbuilder;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.DirectoryChooser;
import javafx.util.Duration;

public class UIController implements Initializable {
    
 

    private final double BULB_DEFAULT_LAYOUT_X = 20;
    private final double BULB_DEFAULT_LAYOUT_Y = 17;
    private File location;
    private ObservableList<String> items;

    @FXML
    private ListView<String> lstClassList;
    @FXML
    private Label lblLocation;
    @FXML
    private JFXTextField txtFullClassName;
    @FXML
    private JFXButton btnAddToList;
    @FXML
    private JFXButton btnRemoveFromList;
    @FXML
    private JFXButton btnRemaveAll;
    @FXML
    private JFXTextField txtMasterPackage;
    @FXML
    private JFXTextField txtSuperPackage;
    @FXML
    private JFXCheckBox cbxCreateCIP;
    @FXML
    private JFXCheckBox cbxHaveSuperPackage;
    @FXML
    private JFXButton btnSetLocation;
    @FXML
    private JFXButton btnGeanarate;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label ani_lblMiniMessage;
    @FXML
    private Circle ani_crlMiniBulb;
    @FXML
    private AnchorPane ani_miniMessageMask;
    @FXML
    private AnchorPane mst_titlePane;
    @FXML
    private AnchorPane mst_MessagePane;
    @FXML
    private Label mst_Message;
    @FXML
    private GridPane mst_logo;
    @FXML
    private AnchorPane dialogPane;

    private AnchorPane glassPane;
    @FXML
    private ProgressIndicator prograss;
    @FXML
    private Rectangle rect01;
    @FXML
    private Rectangle rect02;
    @FXML
    private Rectangle rect03;
    @FXML
    private Rectangle rect04;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //init all variables
        items = FXCollections.observableArrayList();
        lstClassList.setItems(items);
        actionForButton();
        actionForTextFields();
        animateLogo();
        otherInits();
    }

    private void otherInits() {
        txtMasterPackage.disableProperty().bind(cbxCreateCIP.selectedProperty().not());
        txtSuperPackage.disableProperty().bind(cbxHaveSuperPackage.selectedProperty().not());
        txtMasterPackage.disabledProperty().addListener((a, b, c) -> txtMasterPackage.setText(""));
        txtSuperPackage.disabledProperty().addListener((a, b, c) -> txtSuperPackage.setText(""));

        dialogPane.setVisible(false);

        glassPane = new AnchorPane();
        glassPane.setId("glassPane");
        glassPane.setLayoutX(0);
        glassPane.setLayoutY(0);
        glassPane.setPrefSize(rootPane.getPrefWidth(), rootPane.getPrefHeight());
        System.out.println(rootPane.getPrefWidth());
        rootPane.getChildren().add(glassPane);
        glassPane.setOpacity(0);
        glassPane.toFront();
        dialogPane.toFront();
        glassPane.setVisible(false);
        // prograss.setProgress(-1);

    }

    SimpleDoubleProperty pValue;

    private void actionForButton() {

        btnSetLocation.setOnAction((ActionEvent e) -> {
            DirectoryChooser fc = new DirectoryChooser();
            fc.setTitle("Open a folder");
            File f = fc.showDialog(null);
            if (f != null) {
                if (f.exists()) {
                    if (f.isDirectory()) {
                        location = f;
                        lblLocation.setText(f.getPath());
                    }
                }
            }
        });

        btnGeanarate.setOnMouseClicked(e -> {
            System.out.println("kamal");
            if (location != null && location.exists()) {
                showDialog();
            } else {
                showMiniMessage("Please set Location to save", e.getSceneX(), e.getSceneY());
            }
        });

        btnAddToList.setOnMouseClicked(e -> {
            String text = txtFullClassName.getText().trim();
            if (!text.isEmpty()) {
                items.add(text);
                txtFullClassName.setText("");
            } else {
                showMiniMessage("Please Type a Correct class name", e.getSceneX(), e.getSceneY());
            }

        });

        btnRemoveFromList.setOnMouseClicked(e -> {
            int sindex = lstClassList.getSelectionModel().getSelectedIndex();
            if (sindex != -1) {
                items.remove(sindex);
            } else {
                showMiniMessage("Please select a class name in list to remove", e.getSceneX(), e.getSceneY());
            }

        });

        btnRemaveAll.setOnMouseClicked(e -> {
//            if (!items.isEmpty()) {
//                items.removeAll(items);
//            } else {
//                showMiniMessage("Thare are no any items to remove in the list", e.getSceneX(), e.getSceneY());
//            }

        });

        prograss.setOnMouseClicked(e -> {

        });

    }

    private void showDialog() {
        glassPane.setVisible(true);
        dialogPane.setScaleX(0);
        dialogPane.setScaleY(0);
        FadeTransition ft = new FadeTransition(Duration.seconds(.3), glassPane);
        ft.setToValue(1);
        ft.play();
        ft.setOnFinished(ee -> {
            dialogPane.setVisible(true);
            ScaleTransition st = new ScaleTransition(Duration.seconds(.5), dialogPane);
            st.setDelay(Duration.seconds(.3));
            st.setToX(1);
            st.setToY(1);
            st.play();
            st.setOnFinished(e -> {

                Service s = new Service() {
                    @Override
                    protected Task createTask() {
                        Task<Integer> task = new Task<Integer>() {
                            @Override
                            protected Integer call() throws Exception {
                                int iterations;
                                for (iterations = 0; iterations < items.size(); iterations++) {
                                    if (isCancelled()) {
                                        updateMessage("Cancelled");
                                        break;
                                    }
                                    //Main Process
                                    ClassBuilderGenarator clg = new ClassBuilderGenarator(items.get(iterations), txtMasterPackage.getText(), txtSuperPackage.getText());
                                    String gClass = clg.getGenaratedClass();
                                    File javaFile = new File(location.getPath() + "\\" + clg.getClassName() + ".java");
                                    if (!javaFile.exists()) {
                                        javaFile.createNewFile();
                                    }

                                    FileOutputStream fos = new FileOutputStream(javaFile);
                                    fos.write(gClass.getBytes());

                                    //end
                                    updateMessage("Create Class " + items.get(iterations));
                                    updateProgress(iterations, items.size());
                                }
                                return iterations;
                            }
                        };
                        return task;
                    }
                };

                prograss.progressProperty().bind(s.progressProperty());

                s.start();
                //s.setOnSucceeded(eh->prograss.setProgress(1));

//                Thread thread = new Thread(() -> {
//                    for (int i = 0; i < 1000; i++) {
//                        try {
//                            Thread.sleep(10);
//                        } catch (Exception ex) {
//                        }
//
//                        System.out.println((double) i / 1000d);
//                        prograss.setProgress((double) i / 1000d);
//                    }
//
//                });
                ScaleTransition st2 = new ScaleTransition(Duration.seconds(.5), dialogPane);
                st2.setToX(0);
                st2.setDelay(Duration.seconds(10));
                st2.setToY(0);
                st2.play();
                st2.setOnFinished(e2 -> {
                    FadeTransition ft2 = new FadeTransition(Duration.seconds(.3), glassPane);
                    ft2.setToValue(0);
                    ft2.play();
                    ft2.setOnFinished(e3 -> glassPane.setVisible(false));
                });

            });
        });

    }

    private void actionForTextFields() {
        setOnTextFieldFocused(txtFullClassName,
                "Please Insert full class name with "
                + "package details atherwise I can not find class"
                + " then I have to genarate an error..!"
        );
        setOnTextFieldFocused(txtMasterPackage, "Code Later");
        setOnTextFieldFocused(txtSuperPackage, "");

        txtSuperPackage.setOnKeyTyped(e -> {

        });

    }

    private void setOnTextFieldFocused(TextField textField, String message) {
        textField.focusedProperty().addListener((ob, ol, nv) -> {
            if (nv) {
                showMasterMessage(message);
            } else {
                hideMasterMessage(false);
            }

        });
    }

    private void showMiniMessage(String message, double x, double y) {
        ArrayList<JFXButton> bList = new ArrayList<>(Arrays.asList(
                btnAddToList,
                btnGeanarate,
                btnRemaveAll,
                btnRemoveFromList
        ));
        bList.forEach(b -> b.setDisable(true));
        DoubleProperty msk = ani_miniMessageMask.translateXProperty();
        DoubleProperty blb = ani_crlMiniBulb.translateXProperty();
        msk.unbind();
        ani_lblMiniMessage.setText(message);
        ScaleTransition st1 = new ScaleTransition(Duration.seconds(.3), ani_crlMiniBulb);
        st1.setToX(1.2);
        st1.setToY(1.2);
        st1.setInterpolator(Interpolator.EASE_IN);
        st1.play();
        st1.setOnFinished(e1 -> {
            ScaleTransition st2 = new ScaleTransition(Duration.seconds(.3), ani_crlMiniBulb);
            st2.setToX(0);
            st2.setToY(0);
            st2.setInterpolator(Interpolator.EASE_IN);
            st2.play();
            st2.setOnFinished(e2 -> {
                ani_crlMiniBulb.setTranslateX(x - BULB_DEFAULT_LAYOUT_X);
                ani_crlMiniBulb.setTranslateY(y - BULB_DEFAULT_LAYOUT_Y);
                ScaleTransition st3 = new ScaleTransition(Duration.seconds(.3), ani_crlMiniBulb);
                st3.setToX(1.2);
                st3.setToY(1.2);
                st3.setInterpolator(Interpolator.EASE_IN);
                st3.play();
                st3.setOnFinished(e3 -> {
                    ScaleTransition st4 = new ScaleTransition(Duration.seconds(.2), ani_crlMiniBulb);
                    st4.setToX(1);
                    st4.setToY(1);
                    st4.setInterpolator(Interpolator.EASE_IN);
                    st4.play();
                    st4.setOnFinished(e4 -> {
                        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(.5), ani_crlMiniBulb);
                        tt1.setToX(0);
                        tt1.setToY(0);
                        tt1.play();
                        tt1.setOnFinished(e5 -> {
                            msk.bind(blb);
                            TranslateTransition tt2 = new TranslateTransition(Duration.seconds(1), ani_crlMiniBulb);
                            tt2.setToX(600);
                            tt2.play();
                            tt2.setOnFinished(e6 -> {
                                TranslateTransition tt3 = new TranslateTransition(Duration.seconds(1), ani_crlMiniBulb);
                                tt3.setToX(0);
                                tt3.setDelay(Duration.seconds(3));
                                tt3.setToY(0);
                                tt3.play();
                                tt3.setOnFinished(e7 -> {
                                    msk.unbind();
                                    bList.forEach(b -> b.setDisable(false));
                                });
                            });
                        });
                    });
                });
            });
        });
    }

    private void animateLogo() {
        RotateTransition rt = new RotateTransition(Duration.seconds(2), mst_logo);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setAutoReverse(false);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.play();

        Arrays.asList(rect01, rect02, rect03, rect04).forEach(rect
                -> new TranslateTransitionBuilder(Duration.seconds(.5), rect)
                .toY((rect == rect01 || rect == rect02) ? +20 : -20)
                .toX((rect == rect01 || rect == rect02) ? +20 : -20)
                .cyclecount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build()
                .play()
    

    );

    }

    private void showMasterMessage(String message) {
        //  mst_Message.setText(message);
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(.5), mst_MessagePane);
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(.5), mst_titlePane);
        tt1.setToY(0);
        tt2.setToY(-101);
//        tt2.setFromY(0);
//        tt1.setFromY(101);
//        tt1.setDelay(Duration.seconds(.5));
//        tt2.setDelay(Duration.seconds(.5));
        tt1.play();
        tt2.play();
        tt2.setOnFinished(e -> hideMasterMessage(true));
    }

    private void hideMasterMessage(boolean needDelay) {
        System.out.println("hide");
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(.5), mst_MessagePane);
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(.5), mst_titlePane);
        if (needDelay) {
            tt1.setDelay(Duration.seconds(3));
            tt2.setDelay(Duration.seconds(3));
        }
        tt1.setToY(0);
        tt2.setToY(101);
        tt1.play();
        tt2.play();
    }

}
