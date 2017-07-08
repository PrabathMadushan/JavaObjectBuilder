package AnimationBuilders;

public class RotateTransitionBuilder {

private final javafx.animation.RotateTransition object;

public RotateTransitionBuilder(){
     this.object=new javafx.animation.RotateTransition();
}

public RotateTransitionBuilder(javafx.util.Duration para0,javafx.scene.Node para1){
     this.object=new javafx.animation.RotateTransition( para0, para1);
}

public RotateTransitionBuilder(javafx.util.Duration para0){
     this.object=new javafx.animation.RotateTransition( para0);
}

public javafx.animation.RotateTransition build(){
     return object;
}

public RotateTransitionBuilder fromAngle(double value0){
     object.setFromAngle(value0);
     return this;
}
public RotateTransitionBuilder toAngle(double value0){
     object.setToAngle(value0);
     return this;
}
public RotateTransitionBuilder axis(javafx.geometry.Point3D value0){
     object.setAxis(value0);
     return this;
}
public RotateTransitionBuilder duration(javafx.util.Duration value0){
     object.setDuration(value0);
     return this;
}
public RotateTransitionBuilder byAngle(double value0){
     object.setByAngle(value0);
     return this;
}
public RotateTransitionBuilder node(javafx.scene.Node value0){
     object.setNode(value0);
     return this;
}
public RotateTransitionBuilder interpolator(javafx.animation.Interpolator value0){
     object.setInterpolator(value0);
     return this;
}
public RotateTransitionBuilder delay(javafx.util.Duration value0){
     object.setDelay(value0);
     return this;
}
public RotateTransitionBuilder onFinished(javafx.event.EventHandler value0){
     object.setOnFinished(value0);
     return this;
}
public RotateTransitionBuilder autoReverse(boolean value0){
     object.setAutoReverse(value0);
     return this;
}
public RotateTransitionBuilder cyclecount(int value0){
     object.setCycleCount(value0);
     return this;
}
public RotateTransitionBuilder rate(double value0){
     object.setRate(value0);
     return this;
}
}
