package javaobjectbuilder;

public class ScaleTransitionBuilder {

    private final javafx.animation.ScaleTransition object;

    public ScaleTransitionBuilder(javafx.util.Duration para0) {
        this.object = new javafx.animation.ScaleTransition(para0);
    }

    public ScaleTransitionBuilder(javafx.util.Duration para0, javafx.scene.Node para1) {
        this.object = new javafx.animation.ScaleTransition(para0, para1);
    }

    public ScaleTransitionBuilder() {
        this.object = new javafx.animation.ScaleTransition();
    }

    public javafx.animation.ScaleTransition build() {
        return object;
    }

    public ScaleTransitionBuilder toX(double value0) {
        object.setToX(value0);
        return this;
    }

    public ScaleTransitionBuilder toY(double value0) {
        object.setToY(value0);
        return this;
    }

    public ScaleTransitionBuilder duration(javafx.util.Duration value0) {
        object.setDuration(value0);
        return this;
    }

    public ScaleTransitionBuilder node(javafx.scene.Node value0) {
        object.setNode(value0);
        return this;
    }

    public ScaleTransitionBuilder fromX(double value0) {
        object.setFromX(value0);
        return this;
    }

    public ScaleTransitionBuilder byX(double value0) {
        object.setByX(value0);
        return this;
    }

    public ScaleTransitionBuilder toZ(double value0) {
        object.setToZ(value0);
        return this;
    }

    public ScaleTransitionBuilder fromZ(double value0) {
        object.setFromZ(value0);
        return this;
    }

    public ScaleTransitionBuilder byY(double value0) {
        object.setByY(value0);
        return this;
    }

    public ScaleTransitionBuilder fromY(double value0) {
        object.setFromY(value0);
        return this;
    }

    public ScaleTransitionBuilder byZ(double value0) {
        object.setByZ(value0);
        return this;
    }

    public ScaleTransitionBuilder interpolator(javafx.animation.Interpolator value0) {
        object.setInterpolator(value0);
        return this;
    }

    public ScaleTransitionBuilder delay(javafx.util.Duration value0) {
        object.setDelay(value0);
        return this;
    }

    public ScaleTransitionBuilder onFinished(javafx.event.EventHandler value0) {
        object.setOnFinished(value0);
        return this;
    }

    public ScaleTransitionBuilder autoReverse(boolean value0) {
        object.setAutoReverse(value0);
        return this;
    }

    public ScaleTransitionBuilder cyclecount(int value0) {
        object.setCycleCount(value0);
        return this;
    }

    public ScaleTransitionBuilder rate(double value0) {
        object.setRate(value0);
        return this;
    }
}
