package AnimationBuilders;

public class FillTransitionBuilder {

private final javafx.animation.FillTransition object;

public FillTransitionBuilder(){
     this.object=new javafx.animation.FillTransition();
}

public FillTransitionBuilder(javafx.util.Duration para0,javafx.scene.shape.Shape para1){
     this.object=new javafx.animation.FillTransition( para0, para1);
}

public FillTransitionBuilder(javafx.util.Duration para0,javafx.scene.paint.Color para1,javafx.scene.paint.Color para2){
     this.object=new javafx.animation.FillTransition( para0, para1, para2);
}

public FillTransitionBuilder(javafx.util.Duration para0,javafx.scene.shape.Shape para1,javafx.scene.paint.Color para2,javafx.scene.paint.Color para3){
     this.object=new javafx.animation.FillTransition( para0, para1, para2, para3);
}

public FillTransitionBuilder(javafx.util.Duration para0){
     this.object=new javafx.animation.FillTransition( para0);
}

public javafx.animation.FillTransition build(){
     return object;
}

public FillTransitionBuilder shape(javafx.scene.shape.Shape value0){
     object.setShape(value0);
     return this;
}
public FillTransitionBuilder toValue(javafx.scene.paint.Color value0){
     object.setToValue(value0);
     return this;
}
public FillTransitionBuilder duration(javafx.util.Duration value0){
     object.setDuration(value0);
     return this;
}
public FillTransitionBuilder fromValue(javafx.scene.paint.Color value0){
     object.setFromValue(value0);
     return this;
}
public FillTransitionBuilder interpolator(javafx.animation.Interpolator value0){
     object.setInterpolator(value0);
     return this;
}
public FillTransitionBuilder delay(javafx.util.Duration value0){
     object.setDelay(value0);
     return this;
}
public FillTransitionBuilder onFinished(javafx.event.EventHandler value0){
     object.setOnFinished(value0);
     return this;
}
public FillTransitionBuilder autoReverse(boolean value0){
     object.setAutoReverse(value0);
     return this;
}
public FillTransitionBuilder cyclecount(int value0){
     object.setCycleCount(value0);
     return this;
}
public FillTransitionBuilder rate(double value0){
     object.setRate(value0);
     return this;
}
}
