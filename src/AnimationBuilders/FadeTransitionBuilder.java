package AnimationBuilders;

public class FadeTransitionBuilder {

private final javafx.animation.FadeTransition object;

public FadeTransitionBuilder(){
     this.object=new javafx.animation.FadeTransition();
}

public FadeTransitionBuilder(javafx.util.Duration para0){
     this.object=new javafx.animation.FadeTransition( para0);
}

public FadeTransitionBuilder(javafx.util.Duration para0,javafx.scene.Node para1){
     this.object=new javafx.animation.FadeTransition( para0, para1);
}

public javafx.animation.FadeTransition build(){
     return object;
}

public FadeTransitionBuilder toValue(double value0){
     object.setToValue(value0);
     return this;
}
public FadeTransitionBuilder duration(javafx.util.Duration value0){
     object.setDuration(value0);
     return this;
}
public FadeTransitionBuilder node(javafx.scene.Node value0){
     object.setNode(value0);
     return this;
}
public FadeTransitionBuilder fromValue(double value0){
     object.setFromValue(value0);
     return this;
}
public FadeTransitionBuilder byValue(double value0){
     object.setByValue(value0);
     return this;
}
public FadeTransitionBuilder interpolator(javafx.animation.Interpolator value0){
     object.setInterpolator(value0);
     return this;
}
public FadeTransitionBuilder delay(javafx.util.Duration value0){
     object.setDelay(value0);
     return this;
}
public FadeTransitionBuilder onFinished(javafx.event.EventHandler value0){
     object.setOnFinished(value0);
     return this;
}
public FadeTransitionBuilder autoReverse(boolean value0){
     object.setAutoReverse(value0);
     return this;
}
public FadeTransitionBuilder cyclecount(int value0){
     object.setCycleCount(value0);
     return this;
}
public FadeTransitionBuilder rate(double value0){
     object.setRate(value0);
     return this;
}
}
