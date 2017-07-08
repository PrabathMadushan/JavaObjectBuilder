package AnimationBuilders;

public class StrokeTransitionBuilder {

private final javafx.animation.StrokeTransition object;

public StrokeTransitionBuilder(){
     this.object=new javafx.animation.StrokeTransition();
}

public StrokeTransitionBuilder(javafx.util.Duration para0,javafx.scene.shape.Shape para1){
     this.object=new javafx.animation.StrokeTransition( para0, para1);
}

public StrokeTransitionBuilder(javafx.util.Duration para0,javafx.scene.paint.Color para1,javafx.scene.paint.Color para2){
     this.object=new javafx.animation.StrokeTransition( para0, para1, para2);
}

public StrokeTransitionBuilder(javafx.util.Duration para0,javafx.scene.shape.Shape para1,javafx.scene.paint.Color para2,javafx.scene.paint.Color para3){
     this.object=new javafx.animation.StrokeTransition( para0, para1, para2, para3);
}

public StrokeTransitionBuilder(javafx.util.Duration para0){
     this.object=new javafx.animation.StrokeTransition( para0);
}

public javafx.animation.StrokeTransition build(){
     return object;
}

public StrokeTransitionBuilder shape(javafx.scene.shape.Shape value0){
     object.setShape(value0);
     return this;
}
public StrokeTransitionBuilder toValue(javafx.scene.paint.Color value0){
     object.setToValue(value0);
     return this;
}
public StrokeTransitionBuilder duration(javafx.util.Duration value0){
     object.setDuration(value0);
     return this;
}
public StrokeTransitionBuilder fromValue(javafx.scene.paint.Color value0){
     object.setFromValue(value0);
     return this;
}
public StrokeTransitionBuilder interpolator(javafx.animation.Interpolator value0){
     object.setInterpolator(value0);
     return this;
}
public StrokeTransitionBuilder delay(javafx.util.Duration value0){
     object.setDelay(value0);
     return this;
}
public StrokeTransitionBuilder onFinished(javafx.event.EventHandler value0){
     object.setOnFinished(value0);
     return this;
}
public StrokeTransitionBuilder autoReverse(boolean value0){
     object.setAutoReverse(value0);
     return this;
}
public StrokeTransitionBuilder cyclecount(int value0){
     object.setCycleCount(value0);
     return this;
}
public StrokeTransitionBuilder rate(double value0){
     object.setRate(value0);
     return this;
}
}
