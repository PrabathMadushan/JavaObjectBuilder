package javaobjectbuilder;

import javafx.scene.control.TextField;

public class TextFieldBuilder {

    private final javafx.scene.control.TextField object;

    public TextFieldBuilder() {
        this.object = new javafx.scene.control.TextField();
    }

    public TextFieldBuilder(java.lang.String para0) {
        this.object = new javafx.scene.control.TextField(para0);
    }

    public javafx.scene.control.TextField build() {
        return object;
    }

    public TextFieldBuilder prefColumnCount(int value0) {
        object.setPrefColumnCount(value0);
        return this;
    }

    public TextFieldBuilder alignment(javafx.geometry.Pos value0) {
        object.setAlignment(value0);
        return this;
    }

    public TextFieldBuilder onAction(javafx.event.EventHandler value0) {
        object.setOnAction(value0);
        return this;
    }

    public TextFieldBuilder text(java.lang.String value0) {
        object.setText(value0);
        return this;
    }

    public TextFieldBuilder font(javafx.scene.text.Font value0) {
        object.setFont(value0);
        return this;
    }

    public TextFieldBuilder promptText(java.lang.String value0) {
        object.setPromptText(value0);
        return this;
    }

    public TextFieldBuilder editable(boolean value0) {
        object.setEditable(value0);
        return this;
    }

    public TextFieldBuilder textFormatter(javafx.scene.control.TextFormatter value0) {
        object.setTextFormatter(value0);
        return this;
    }

    public TextFieldBuilder contextMenu(javafx.scene.control.ContextMenu value0) {
        object.setContextMenu(value0);
        return this;
    }

    public TextFieldBuilder skin(javafx.scene.control.Skin value0) {
        object.setSkin(value0);
        return this;
    }

    public TextFieldBuilder tooltip(javafx.scene.control.Tooltip value0) {
        object.setTooltip(value0);
        return this;
    }

    public TextFieldBuilder getBaselineOff() {
        object.getBaselineOffset();
        return this;
    }

    public TextFieldBuilder snappedLeftIn() {
        object.snappedLeftInset();
        return this;
    }

    public TextFieldBuilder snappedTopIn() {
        object.snappedTopInset();
        return this;
    }

    public TextFieldBuilder background(javafx.scene.layout.Background value0) {
        object.setBackground(value0);
        return this;
    }

    public TextFieldBuilder cacheShape(boolean value0) {
        object.setCacheShape(value0);
        return this;
    }

    public TextFieldBuilder maxWidth(double value0) {
        object.setMaxWidth(value0);
        return this;
    }

    public TextFieldBuilder minHeight(double value0) {
        object.setMinHeight(value0);
        return this;
    }

    public TextFieldBuilder minWidth(double value0) {
        object.setMinWidth(value0);
        return this;
    }

    public TextFieldBuilder centerShape(boolean value0) {
        object.setCenterShape(value0);
        return this;
    }

    public TextFieldBuilder opaqueIns(javafx.geometry.Insets value0) {
        object.setOpaqueInsets(value0);
        return this;
    }

    public TextFieldBuilder padding(javafx.geometry.Insets value0) {
        object.setPadding(value0);
        return this;
    }

    public TextFieldBuilder minSize(double value0, double value1) {
        object.setMinSize(value0, value1);
        return this;
    }

    public TextFieldBuilder prefHeight(double value0) {
        object.setPrefHeight(value0);
        return this;
    }

    public TextFieldBuilder maxHeight(double value0) {
        object.setMaxHeight(value0);
        return this;
    }

    public TextFieldBuilder maxSize(double value0, double value1) {
        object.setMaxSize(value0, value1);
        return this;
    }

    public TextFieldBuilder border(javafx.scene.layout.Border value0) {
        object.setBorder(value0);
        return this;
    }

    public TextFieldBuilder insProperty() {
        object.insetsProperty();
        return this;
    }

    public TextFieldBuilder getOpaqueIns() {
        object.getOpaqueInsets();
        return this;
    }

    public TextFieldBuilder getIns() {
        object.getInsets();
        return this;
    }

    public TextFieldBuilder opaqueInsProperty() {
        object.opaqueInsetsProperty();
        return this;
    }

    public TextFieldBuilder scaleshape(boolean value0) {
        object.setScaleShape(value0);
        return this;
    }

    public TextFieldBuilder prefSize(double value0, double value1) {
        object.setPrefSize(value0, value1);
        return this;
    }

    public TextFieldBuilder shape(javafx.scene.shape.Shape value0) {
        object.setShape(value0);
        return this;
    }

    public TextFieldBuilder snapToPixel(boolean value0) {
        object.setSnapToPixel(value0);
        return this;
    }

    public TextFieldBuilder prefWidth(double value0) {
        object.setPrefWidth(value0);
        return this;
    }

    public TextFieldBuilder snappedBottomIn() {
        object.snappedBottomInset();
        return this;
    }

    public TextFieldBuilder snappedRightIn() {
        object.snappedRightInset();
        return this;
    }

    public TextFieldBuilder impl_traversalEngine(com.sun.javafx.scene.traversal.ParentTraversalEngine value0) {
        object.setImpl_traversalEngine(value0);
        return this;
    }

    public TextFieldBuilder cache(boolean value0) {
        object.setCache(value0);
        return this;
    }

    public TextFieldBuilder accessibleRole(javafx.scene.AccessibleRole value0) {
        object.setAccessibleRole(value0);
        return this;
    }

    public TextFieldBuilder pickOnBounds(boolean value0) {
        object.setPickOnBounds(value0);
        return this;
    }

    public TextFieldBuilder impl_StyleMap(javafx.collections.ObservableMap value0) {
        object.impl_setStyleMap(value0);
        return this;
    }

    public TextFieldBuilder impl_ShowMnemonics(boolean value0) {
        object.impl_setShowMnemonics(value0);
        return this;
    }

    public TextFieldBuilder onRotationStarted(javafx.event.EventHandler value0) {
        object.setOnRotationStarted(value0);
        return this;
    }

    public TextFieldBuilder onMouseReleased(javafx.event.EventHandler value0) {
        object.setOnMouseReleased(value0);
        return this;
    }

    public TextFieldBuilder onMouseDragover(javafx.event.EventHandler value0) {
        object.setOnMouseDragOver(value0);
        return this;
    }

    public TextFieldBuilder onMouseDragExited(javafx.event.EventHandler value0) {
        object.setOnMouseDragExited(value0);
        return this;
    }

    public TextFieldBuilder onContextMenuRequested(javafx.event.EventHandler value0) {
        object.setOnContextMenuRequested(value0);
        return this;
    }

    public TextFieldBuilder onMouseDragReleased(javafx.event.EventHandler value0) {
        object.setOnMouseDragReleased(value0);
        return this;
    }

    public TextFieldBuilder onMouseEntered(javafx.event.EventHandler value0) {
        object.setOnMouseEntered(value0);
        return this;
    }

    public TextFieldBuilder onTouchReleased(javafx.event.EventHandler value0) {
        object.setOnTouchReleased(value0);
        return this;
    }

    public TextFieldBuilder onTouchStationary(javafx.event.EventHandler value0) {
        object.setOnTouchStationary(value0);
        return this;
    }

    public TextFieldBuilder mouseTransparent(boolean value0) {
        object.setMouseTransparent(value0);
        return this;
    }

    public TextFieldBuilder onInputMethodTextChanged(javafx.event.EventHandler value0) {
        object.setOnInputMethodTextChanged(value0);
        return this;
    }

    public TextFieldBuilder onMouseClicked(javafx.event.EventHandler value0) {
        object.setOnMouseClicked(value0);
        return this;
    }

    public TextFieldBuilder onMouseDragged(javafx.event.EventHandler value0) {
        object.setOnMouseDragged(value0);
        return this;
    }

    public TextFieldBuilder focusTraversable(boolean value0) {
        object.setFocusTraversable(value0);
        return this;
    }

    public TextFieldBuilder eventDispatcher(javafx.event.EventDispatcher value0) {
        object.setEventDispatcher(value0);
        return this;
    }

    public TextFieldBuilder onTouchPressed(javafx.event.EventHandler value0) {
        object.setOnTouchPressed(value0);
        return this;
    }

    public TextFieldBuilder onScrollStarted(javafx.event.EventHandler value0) {
        object.setOnScrollStarted(value0);
        return this;
    }

    public TextFieldBuilder onZoomFinished(javafx.event.EventHandler value0) {
        object.setOnZoomFinished(value0);
        return this;
    }

    public TextFieldBuilder onMouseDragEntered(javafx.event.EventHandler value0) {
        object.setOnMouseDragEntered(value0);
        return this;
    }

    public TextFieldBuilder accessibleHelp(java.lang.String value0) {
        object.setAccessibleHelp(value0);
        return this;
    }

    public TextFieldBuilder nodeOrientation(javafx.geometry.NodeOrientation value0) {
        object.setNodeOrientation(value0);
        return this;
    }

    public TextFieldBuilder onDragDetected(javafx.event.EventHandler value0) {
        object.setOnDragDetected(value0);
        return this;
    }

    public TextFieldBuilder accessibleText(java.lang.String value0) {
        object.setAccessibleText(value0);
        return this;
    }

    public TextFieldBuilder onScrollFinished(javafx.event.EventHandler value0) {
        object.setOnScrollFinished(value0);
        return this;
    }

    public TextFieldBuilder accessibleRoleDescription(java.lang.String value0) {
        object.setAccessibleRoleDescription(value0);
        return this;
    }

    public TextFieldBuilder inputMethodRequests(javafx.scene.input.InputMethodRequests value0) {
        object.setInputMethodRequests(value0);
        return this;
    }

    public TextFieldBuilder onMousePressed(javafx.event.EventHandler value0) {
        object.setOnMousePressed(value0);
        return this;
    }

    public TextFieldBuilder onRotationFinished(javafx.event.EventHandler value0) {
        object.setOnRotationFinished(value0);
        return this;
    }

    public TextFieldBuilder visible(boolean value0) {
        object.setVisible(value0);
        return this;
    }

    public TextFieldBuilder onSwipeUp(javafx.event.EventHandler value0) {
        object.setOnSwipeUp(value0);
        return this;
    }

    public TextFieldBuilder disable(boolean value0) {
        object.setDisable(value0);
        return this;
    }

    public TextFieldBuilder layoutY(double value0) {
        object.setLayoutY(value0);
        return this;
    }

    public TextFieldBuilder onZoom(javafx.event.EventHandler value0) {
        object.setOnZoom(value0);
        return this;
    }

    public TextFieldBuilder scaleX(double value0) {
        object.setScaleX(value0);
        return this;
    }

    public TextFieldBuilder scaleZ(double value0) {
        object.setScaleZ(value0);
        return this;
    }

    public TextFieldBuilder onKeyReleased(javafx.event.EventHandler value0) {
        object.setOnKeyReleased(value0);
        return this;
    }

    public TextFieldBuilder rotationAxis(javafx.geometry.Point3D value0) {
        object.setRotationAxis(value0);
        return this;
    }

    public TextFieldBuilder cacheHint(javafx.scene.CacheHint value0) {
        object.setCacheHint(value0);
        return this;
    }

    public TextFieldBuilder onDragEntered(javafx.event.EventHandler value0) {
        object.setOnDragEntered(value0);
        return this;
    }

    public TextFieldBuilder style(java.lang.String value0) {
        object.setStyle(value0);
        return this;
    }

    public TextFieldBuilder translateX(double value0) {
        object.setTranslateX(value0);
        return this;
    }

    public TextFieldBuilder onMouseMoved(javafx.event.EventHandler value0) {
        object.setOnMouseMoved(value0);
        return this;
    }

    public TextFieldBuilder effect(javafx.scene.effect.Effect value0) {
        object.setEffect(value0);
        return this;
    }

    public TextFieldBuilder onKeyPressed(javafx.event.EventHandler value0) {
        object.setOnKeyPressed(value0);
        return this;
    }

    public TextFieldBuilder onScroll(javafx.event.EventHandler value0) {
        object.setOnScroll(value0);
        return this;
    }

    public TextFieldBuilder onKeyTyped(javafx.event.EventHandler value0) {
        object.setOnKeyTyped(value0);
        return this;
    }

    public TextFieldBuilder onSwipeDown(javafx.event.EventHandler value0) {
        object.setOnSwipeDown(value0);
        return this;
    }

    public TextFieldBuilder clip(javafx.scene.Node value0) {
        object.setClip(value0);
        return this;
    }

    public TextFieldBuilder onDragover(javafx.event.EventHandler value0) {
        object.setOnDragOver(value0);
        return this;
    }

    public TextFieldBuilder opacity(double value0) {
        object.setOpacity(value0);
        return this;
    }

    public TextFieldBuilder managed(boolean value0) {
        object.setManaged(value0);
        return this;
    }

    public TextFieldBuilder onDragDone(javafx.event.EventHandler value0) {
        object.setOnDragDone(value0);
        return this;
    }

    public TextFieldBuilder translateY(double value0) {
        object.setTranslateY(value0);
        return this;
    }

    public TextFieldBuilder translateZ(double value0) {
        object.setTranslateZ(value0);
        return this;
    }

    public TextFieldBuilder userData(java.lang.Object value0) {
        object.setUserData(value0);
        return this;
    }

    public TextFieldBuilder onRotate(javafx.event.EventHandler value0) {
        object.setOnRotate(value0);
        return this;
    }

    public TextFieldBuilder blendMode(javafx.scene.effect.BlendMode value0) {
        object.setBlendMode(value0);
        return this;
    }

    public TextFieldBuilder onDragDropped(javafx.event.EventHandler value0) {
        object.setOnDragDropped(value0);
        return this;
    }

    public TextFieldBuilder onTouchMoved(javafx.event.EventHandler value0) {
        object.setOnTouchMoved(value0);
        return this;
    }

    public TextFieldBuilder onZoomStarted(javafx.event.EventHandler value0) {
        object.setOnZoomStarted(value0);
        return this;
    }

    public TextFieldBuilder onSwipeRight(javafx.event.EventHandler value0) {
        object.setOnSwipeRight(value0);
        return this;
    }

    public TextFieldBuilder rotate(double value0) {
        object.setRotate(value0);
        return this;
    }

    public TextFieldBuilder scaleY(double value0) {
        object.setScaleY(value0);
        return this;
    }

    public TextFieldBuilder cursor(javafx.scene.Cursor value0) {
        object.setCursor(value0);
        return this;
    }

    public TextFieldBuilder depthTest(javafx.scene.DepthTest value0) {
        object.setDepthTest(value0);
        return this;
    }

    public TextFieldBuilder id(java.lang.String value0) {
        object.setId(value0);
        return this;
    }

    public TextFieldBuilder onDragExited(javafx.event.EventHandler value0) {
        object.setOnDragExited(value0);
        return this;
    }

    public TextFieldBuilder onMouseExited(javafx.event.EventHandler value0) {
        object.setOnMouseExited(value0);
        return this;
    }

    public TextFieldBuilder layoutX(double value0) {
        object.setLayoutX(value0);
        return this;
    }

    public TextFieldBuilder onSwipeLeft(javafx.event.EventHandler value0) {
        object.setOnSwipeLeft(value0);
        return this;
    }

    public static void main(String[] args) {
        TextField textField = new TextFieldBuilder()
                .text("kamal")
                .onAction(e -> {
                    System.out.println("clicked");
                })
                .editable(true)
                .build();
    }
}
