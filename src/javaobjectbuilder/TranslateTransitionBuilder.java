package javaobjectbuilder;

public class TranslateTransitionBuilder {

    private final javafx.animation.TranslateTransition object;

    public TranslateTransitionBuilder(javafx.util.Duration para0) {
        this.object = new javafx.animation.TranslateTransition(para0);
    }

    public TranslateTransitionBuilder(javafx.util.Duration para0, javafx.scene.Node para1) {
        this.object = new javafx.animation.TranslateTransition(para0, para1);
    }

    public TranslateTransitionBuilder() {
        this.object = new javafx.animation.TranslateTransition();
    }

    public javafx.animation.TranslateTransition build() {
        return object;
    }

    public TranslateTransitionBuilder toX(double value0) {
        object.setToX(value0);
        return this;
    }

    public TranslateTransitionBuilder toY(double value0) {
        object.setToY(value0);
        return this;
    }

    public TranslateTransitionBuilder duration(javafx.util.Duration value0) {
        object.setDuration(value0);
        return this;
    }

    public TranslateTransitionBuilder node(javafx.scene.Node value0) {
        object.setNode(value0);
        return this;
    }

    public TranslateTransitionBuilder fromX(double value0) {
        object.setFromX(value0);
        return this;
    }

    public TranslateTransitionBuilder byX(double value0) {
        object.setByX(value0);
        return this;
    }

    public TranslateTransitionBuilder toZ(double value0) {
        object.setToZ(value0);
        return this;
    }

    public TranslateTransitionBuilder fromZ(double value0) {
        object.setFromZ(value0);
        return this;
    }

    public TranslateTransitionBuilder byY(double value0) {
        object.setByY(value0);
        return this;
    }

    public TranslateTransitionBuilder fromY(double value0) {
        object.setFromY(value0);
        return this;
    }

    public TranslateTransitionBuilder byZ(double value0) {
        object.setByZ(value0);
        return this;
    }

    public TranslateTransitionBuilder interpolator(javafx.animation.Interpolator value0) {
        object.setInterpolator(value0);
        return this;
    }

    public TranslateTransitionBuilder delay(javafx.util.Duration value0) {
        object.setDelay(value0);
        return this;
    }

    public TranslateTransitionBuilder onFinished(javafx.event.EventHandler value0) {
        object.setOnFinished(value0);
        return this;
    }

    public TranslateTransitionBuilder autoReverse(boolean value0) {
        object.setAutoReverse(value0);
        return this;
    }

    public TranslateTransitionBuilder cyclecount(int value0) {
        object.setCycleCount(value0);
        return this;
    }

    public TranslateTransitionBuilder rate(double value0) {
        object.setRate(value0);
        return this;
    }
    
   
}
