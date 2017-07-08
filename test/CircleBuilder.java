
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class CircleBuilder {

    private final javafx.scene.shape.Circle object;

    public CircleBuilder(double para0, double para1, double para2, javafx.scene.paint.Paint para3) {
        this.object = new javafx.scene.shape.Circle(para0, para1, para2, para3);
    }

    public CircleBuilder(double para0, double para1, double para2) {
        this.object = new javafx.scene.shape.Circle(para0, para1, para2);
    }

    public CircleBuilder() {
        this.object = new javafx.scene.shape.Circle();
    }

    public CircleBuilder(double para0, javafx.scene.paint.Paint para1) {
        this.object = new javafx.scene.shape.Circle(para0, para1);
    }

    public CircleBuilder(double para0) {
        this.object = new javafx.scene.shape.Circle(para0);
    }

    public javafx.scene.shape.Circle build() {
        return object;
    }

    public CircleBuilder centerY(double value0) {
        object.setCenterY(value0);
        return this;
    }

    public CircleBuilder centerX(double value0) {
        object.setCenterX(value0);
        return this;
    }

    public CircleBuilder radius(double value0) {
        object.setRadius(value0);
        return this;
    }

    public CircleBuilder fill(javafx.scene.paint.Paint value0) {
        object.setFill(value0);
        return this;
    }

    public CircleBuilder smooth(boolean value0) {
        object.setSmooth(value0);
        return this;
    }

    public CircleBuilder strokeLineCap(javafx.scene.shape.StrokeLineCap value0) {
        object.setStrokeLineCap(value0);
        return this;
    }

    public CircleBuilder strokeType(javafx.scene.shape.StrokeType value0) {
        object.setStrokeType(value0);
        return this;
    }

    public CircleBuilder strokeWidth(double value0) {
        object.setStrokeWidth(value0);
        return this;
    }

    public CircleBuilder stroke(javafx.scene.paint.Paint value0) {
        object.setStroke(value0);
        return this;
    }

    public CircleBuilder strokeLineJoin(javafx.scene.shape.StrokeLineJoin value0) {
        object.setStrokeLineJoin(value0);
        return this;
    }

    public CircleBuilder impl_ShapeChangeListener(java.lang.Runnable value0) {
        object.impl_setShapeChangeListener(value0);
        return this;
    }

    public CircleBuilder strokeMiterLimit(double value0) {
        object.setStrokeMiterLimit(value0);
        return this;
    }

    public CircleBuilder strokeDashOffProperty() {
        object.strokeDashOffsetProperty();
        return this;
    }

    public CircleBuilder getStrokeDashOff() {
        object.getStrokeDashOffset();
        return this;
    }

    public CircleBuilder strokeDashOff(double value0) {
        object.setStrokeDashOffset(value0);
        return this;
    }

    public CircleBuilder cache(boolean value0) {
        object.setCache(value0);
        return this;
    }

    public CircleBuilder inputMethodRequests(javafx.scene.input.InputMethodRequests value0) {
        object.setInputMethodRequests(value0);
        return this;
    }

    public CircleBuilder opacity(double value0) {
        object.setOpacity(value0);
        return this;
    }

    public CircleBuilder visible(boolean value0) {
        object.setVisible(value0);
        return this;
    }

    public CircleBuilder cursor(javafx.scene.Cursor value0) {
        object.setCursor(value0);
        return this;
    }

    public CircleBuilder id(java.lang.String value0) {
        object.setId(value0);
        return this;
    }

    public CircleBuilder disable(boolean value0) {
        object.setDisable(value0);
        return this;
    }

    public CircleBuilder eventDispatcher(javafx.event.EventDispatcher value0) {
        object.setEventDispatcher(value0);
        return this;
    }

    public CircleBuilder userData(java.lang.Object value0) {
        object.setUserData(value0);
        return this;
    }

    public CircleBuilder clip(javafx.scene.Node value0) {
        object.setClip(value0);
        return this;
    }

    public CircleBuilder blendMode(javafx.scene.effect.BlendMode value0) {
        object.setBlendMode(value0);
        return this;
    }

    public CircleBuilder impl_StyleMap(javafx.collections.ObservableMap value0) {
        object.impl_setStyleMap(value0);
        return this;
    }

    public CircleBuilder cacheHint(javafx.scene.CacheHint value0) {
        object.setCacheHint(value0);
        return this;
    }

    public CircleBuilder layoutX(double value0) {
        object.setLayoutX(value0);
        return this;
    }

    public CircleBuilder onMouseExited(javafx.event.EventHandler value0) {
        object.setOnMouseExited(value0);
        return this;
    }

    public CircleBuilder onZoomStarted(javafx.event.EventHandler value0) {
        object.setOnZoomStarted(value0);
        return this;
    }

    public CircleBuilder onScroll(javafx.event.EventHandler value0) {
        object.setOnScroll(value0);
        return this;
    }

    public CircleBuilder scaleY(double value0) {
        object.setScaleY(value0);
        return this;
    }

    public CircleBuilder onKeyTyped(javafx.event.EventHandler value0) {
        object.setOnKeyTyped(value0);
        return this;
    }

    public CircleBuilder onRotate(javafx.event.EventHandler value0) {
        object.setOnRotate(value0);
        return this;
    }

    public CircleBuilder onSwipeDown(javafx.event.EventHandler value0) {
        object.setOnSwipeDown(value0);
        return this;
    }

    public CircleBuilder layoutY(double value0) {
        object.setLayoutY(value0);
        return this;
    }

    public CircleBuilder rotationAxis(javafx.geometry.Point3D value0) {
        object.setRotationAxis(value0);
        return this;
    }

    public CircleBuilder scaleZ(double value0) {
        object.setScaleZ(value0);
        return this;
    }

    public CircleBuilder effect(javafx.scene.effect.Effect value0) {
        object.setEffect(value0);
        return this;
    }

    public CircleBuilder translateX(double value0) {
        object.setTranslateX(value0);
        return this;
    }

    public CircleBuilder translateZ(double value0) {
        object.setTranslateZ(value0);
        return this;
    }

    public CircleBuilder onKeyReleased(javafx.event.EventHandler value0) {
        object.setOnKeyReleased(value0);
        return this;
    }

    public CircleBuilder onTouchMoved(javafx.event.EventHandler value0) {
        object.setOnTouchMoved(value0);
        return this;
    }

    public CircleBuilder onSwipeRight(javafx.event.EventHandler value0) {
        object.setOnSwipeRight(value0);
        return this;
    }

    public CircleBuilder translateY(double value0) {
        object.setTranslateY(value0);
        return this;
    }

    public CircleBuilder rotate(double value0) {
        object.setRotate(value0);
        return this;
    }

    public CircleBuilder onKeyPressed(javafx.event.EventHandler value0) {
        object.setOnKeyPressed(value0);
        return this;
    }

    public CircleBuilder onSwipeUp(javafx.event.EventHandler value0) {
        object.setOnSwipeUp(value0);
        return this;
    }

    public CircleBuilder onZoom(javafx.event.EventHandler value0) {
        object.setOnZoom(value0);
        return this;
    }

    public CircleBuilder managed(boolean value0) {
        object.setManaged(value0);
        return this;
    }

    public CircleBuilder pickOnBounds(boolean value0) {
        object.setPickOnBounds(value0);
        return this;
    }

    public CircleBuilder scaleX(double value0) {
        object.setScaleX(value0);
        return this;
    }

    public CircleBuilder style(java.lang.String value0) {
        object.setStyle(value0);
        return this;
    }

    public CircleBuilder onMouseMoved(javafx.event.EventHandler value0) {
        object.setOnMouseMoved(value0);
        return this;
    }

    public CircleBuilder depthTest(javafx.scene.DepthTest value0) {
        object.setDepthTest(value0);
        return this;
    }

    public CircleBuilder onSwipeLeft(javafx.event.EventHandler value0) {
        object.setOnSwipeLeft(value0);
        return this;
    }

    public CircleBuilder onDragDone(javafx.event.EventHandler value0) {
        object.setOnDragDone(value0);
        return this;
    }

    public CircleBuilder onDragDropped(javafx.event.EventHandler value0) {
        object.setOnDragDropped(value0);
        return this;
    }

    public CircleBuilder onDragExited(javafx.event.EventHandler value0) {
        object.setOnDragExited(value0);
        return this;
    }

    public CircleBuilder onDragover(javafx.event.EventHandler value0) {
        object.setOnDragOver(value0);
        return this;
    }

    public CircleBuilder onDragEntered(javafx.event.EventHandler value0) {
        object.setOnDragEntered(value0);
        return this;
    }

    public CircleBuilder onMouseDragEntered(javafx.event.EventHandler value0) {
        object.setOnMouseDragEntered(value0);
        return this;
    }

    public CircleBuilder onMouseDragExited(javafx.event.EventHandler value0) {
        object.setOnMouseDragExited(value0);
        return this;
    }

    public CircleBuilder onMouseDragover(javafx.event.EventHandler value0) {
        object.setOnMouseDragOver(value0);
        return this;
    }

    public CircleBuilder onRotationFinished(javafx.event.EventHandler value0) {
        object.setOnRotationFinished(value0);
        return this;
    }

    public CircleBuilder onTouchStationary(javafx.event.EventHandler value0) {
        object.setOnTouchStationary(value0);
        return this;
    }

    public CircleBuilder onMouseEntered(javafx.event.EventHandler value0) {
        object.setOnMouseEntered(value0);
        return this;
    }

    public CircleBuilder onScrollStarted(javafx.event.EventHandler value0) {
        object.setOnScrollStarted(value0);
        return this;
    }

    public CircleBuilder onMouseReleased(javafx.event.EventHandler value0) {
        object.setOnMouseReleased(value0);
        return this;
    }

    public CircleBuilder onMousePressed(javafx.event.EventHandler value0) {
        object.setOnMousePressed(value0);
        return this;
    }

    public CircleBuilder onZoomFinished(javafx.event.EventHandler value0) {
        object.setOnZoomFinished(value0);
        return this;
    }

    public CircleBuilder onScrollFinished(javafx.event.EventHandler value0) {
        object.setOnScrollFinished(value0);
        return this;
    }

    public CircleBuilder onTouchPressed(javafx.event.EventHandler value0) {
        object.setOnTouchPressed(value0);
        return this;
    }

    public CircleBuilder onTouchReleased(javafx.event.EventHandler value0) {
        object.setOnTouchReleased(value0);
        return this;
    }

    public CircleBuilder onMouseDragReleased(javafx.event.EventHandler value0) {
        object.setOnMouseDragReleased(value0);
        return this;
    }

    public CircleBuilder onMouseClicked(javafx.event.EventHandler value0) {
        object.setOnMouseClicked(value0);
        return this;
    }

    public CircleBuilder onMouseDragged(javafx.event.EventHandler value0) {
        object.setOnMouseDragged(value0);
        return this;
    }

    public CircleBuilder onRotationStarted(javafx.event.EventHandler value0) {
        object.setOnRotationStarted(value0);
        return this;
    }

    public CircleBuilder getBaselineOff() {
        object.getBaselineOffset();
        return this;
    }

    public CircleBuilder focusTraversable(boolean value0) {
        object.setFocusTraversable(value0);
        return this;
    }

    public CircleBuilder onDragDetected(javafx.event.EventHandler value0) {
        object.setOnDragDetected(value0);
        return this;
    }

    public CircleBuilder nodeOrientation(javafx.geometry.NodeOrientation value0) {
        object.setNodeOrientation(value0);
        return this;
    }

    public CircleBuilder onInputMethodTextChanged(javafx.event.EventHandler value0) {
        object.setOnInputMethodTextChanged(value0);
        return this;
    }

    public CircleBuilder accessibleRole(javafx.scene.AccessibleRole value0) {
        object.setAccessibleRole(value0);
        return this;
    }

    public CircleBuilder impl_ShowMnemonics(boolean value0) {
        object.impl_setShowMnemonics(value0);
        return this;
    }

    public CircleBuilder accessibleRoleDescription(java.lang.String value0) {
        object.setAccessibleRoleDescription(value0);
        return this;
    }

    public CircleBuilder mouseTransparent(boolean value0) {
        object.setMouseTransparent(value0);
        return this;
    }

    public CircleBuilder accessibleHelp(java.lang.String value0) {
        object.setAccessibleHelp(value0);
        return this;
    }

    public CircleBuilder accessibleText(java.lang.String value0) {
        object.setAccessibleText(value0);
        return this;
    }

    public CircleBuilder onContextMenuRequested(javafx.event.EventHandler value0) {
        object.setOnContextMenuRequested(value0);
        return this;
    }
    
    public static void main(String[] args) {
        
        Circle build = new CircleBuilder()
                .centerX(0)
                .centerX(0)
                .fill(Color.RED)
                .build();
    }
}
