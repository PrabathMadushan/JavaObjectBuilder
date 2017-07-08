package AnimationBuilders;

public class PauseTransitionBuilder {

private final javafx.animation.PauseTransition object;

public PauseTransitionBuilder(javafx.util.Duration para0){
     this.object=new javafx.animation.PauseTransition( para0);
}

public PauseTransitionBuilder(){
     this.object=new javafx.animation.PauseTransition();
}

public javafx.animation.PauseTransition build(){
     return object;
}

public PauseTransitionBuilder duration(javafx.util.Duration value0){
     object.setDuration(value0);
     return this;
}
public PauseTransitionBuilder interpolator(javafx.animation.Interpolator value0){
     object.setInterpolator(value0);
     return this;
}
public PauseTransitionBuilder delay(javafx.util.Duration value0){
     object.setDelay(value0);
     return this;
}
public PauseTransitionBuilder onFinished(javafx.event.EventHandler value0){
     object.setOnFinished(value0);
     return this;
}
public PauseTransitionBuilder autoReverse(boolean value0){
     object.setAutoReverse(value0);
     return this;
}
public PauseTransitionBuilder cyclecount(int value0){
     object.setCycleCount(value0);
     return this;
}
public PauseTransitionBuilder rate(double value0){
     object.setRate(value0);
     return this;
}
}
