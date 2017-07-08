

public class JButtonBuilder {

private final javax.swing.JButton object;

public JButtonBuilder(java.lang.String para0,javax.swing.Icon para1){
     this.object=new javax.swing.JButton( para0, para1);
}

public JButtonBuilder(javax.swing.Action para0){
     this.object=new javax.swing.JButton( para0);
}

public JButtonBuilder(java.lang.String para0){
     this.object=new javax.swing.JButton( para0);
}

public JButtonBuilder(javax.swing.Icon para0){
     this.object=new javax.swing.JButton( para0);
}

public JButtonBuilder(){
     this.object=new javax.swing.JButton();
}

public javax.swing.JButton build(){
     return object;
}

public JButtonBuilder defaultCapable(boolean value0){
     object.setDefaultCapable(value0);
     return this;
}
public JButtonBuilder actionCommand(java.lang.String value0){
     object.setActionCommand(value0);
     return this;
}
public JButtonBuilder borderPainted(boolean value0){
     object.setBorderPainted(value0);
     return this;
}
public JButtonBuilder contentAreaFilled(boolean value0){
     object.setContentAreaFilled(value0);
     return this;
}
public JButtonBuilder disabledIcon(javax.swing.Icon value0){
     object.setDisabledIcon(value0);
     return this;
}
public JButtonBuilder disabledSelectedIcon(javax.swing.Icon value0){
     object.setDisabledSelectedIcon(value0);
     return this;
}
public JButtonBuilder displayedMnemonicIndex(int value0){
     object.setDisplayedMnemonicIndex(value0);
     return this;
}
public JButtonBuilder focusPainted(boolean value0){
     object.setFocusPainted(value0);
     return this;
}
public JButtonBuilder hideActionText(boolean value0){
     object.setHideActionText(value0);
     return this;
}
public JButtonBuilder horizontalAlignment(int value0){
     object.setHorizontalAlignment(value0);
     return this;
}
public JButtonBuilder horizontalTextPosition(int value0){
     object.setHorizontalTextPosition(value0);
     return this;
}
public JButtonBuilder iconTextGap(int value0){
     object.setIconTextGap(value0);
     return this;
}
public JButtonBuilder label(java.lang.String value0){
     object.setLabel(value0);
     return this;
}
public JButtonBuilder layout(java.awt.LayoutManager value0){
     object.setLayout(value0);
     return this;
}
public JButtonBuilder mnemonic(char value0){
     object.setMnemonic(value0);
     return this;
}
public JButtonBuilder mnemonic(int value0){
     object.setMnemonic(value0);
     return this;
}
public JButtonBuilder multiClickThreshhold(long value0){
     object.setMultiClickThreshhold(value0);
     return this;
}
public JButtonBuilder pressedIcon(javax.swing.Icon value0){
     object.setPressedIcon(value0);
     return this;
}
public JButtonBuilder rolloverEnabled(boolean value0){
     object.setRolloverEnabled(value0);
     return this;
}
public JButtonBuilder rolloverIcon(javax.swing.Icon value0){
     object.setRolloverIcon(value0);
     return this;
}
public JButtonBuilder rolloverSelectedIcon(javax.swing.Icon value0){
     object.setRolloverSelectedIcon(value0);
     return this;
}
public JButtonBuilder selectedIcon(javax.swing.Icon value0){
     object.setSelectedIcon(value0);
     return this;
}
public JButtonBuilder verticalAlignment(int value0){
     object.setVerticalAlignment(value0);
     return this;
}
public JButtonBuilder verticalTextPosition(int value0){
     object.setVerticalTextPosition(value0);
     return this;
}
public JButtonBuilder enabled(boolean value0){
     object.setEnabled(value0);
     return this;
}
public JButtonBuilder text(java.lang.String value0){
     object.setText(value0);
     return this;
}
public JButtonBuilder icon(javax.swing.Icon value0){
     object.setIcon(value0);
     return this;
}
public JButtonBuilder margin(java.awt.Insets value0){
     object.setMargin(value0);
     return this;
}
public JButtonBuilder selected(boolean value0){
     object.setSelected(value0);
     return this;
}
public JButtonBuilder action(javax.swing.Action value0){
     object.setAction(value0);
     return this;
}
public JButtonBuilder model(javax.swing.ButtonModel value0){
     object.setModel(value0);
     return this;
}
public JButtonBuilder uI(javax.swing.plaf.ButtonUI value0){
     object.setUI(value0);
     return this;
}
public JButtonBuilder alignmentX(float value0){
     object.setAlignmentX(value0);
     return this;
}
public JButtonBuilder alignmentY(float value0){
     object.setAlignmentY(value0);
     return this;
}
public JButtonBuilder reKeyboardActions(){
     object.resetKeyboardActions();
     return this;
}
public JButtonBuilder actionMap(javax.swing.ActionMap value0){
     object.setActionMap(value0);
     return this;
}
public JButtonBuilder autoscrolls(boolean value0){
     object.setAutoscrolls(value0);
     return this;
}
public JButtonBuilder componentPopupMenu(javax.swing.JPopupMenu value0){
     object.setComponentPopupMenu(value0);
     return this;
}
public JButtonBuilder debugGraphicsOptions(int value0){
     object.setDebugGraphicsOptions(value0);
     return this;
}
public JButtonBuilder defaultLocale(java.util.Locale value0){
     object.setDefaultLocale(value0);
     return this;
}
public JButtonBuilder doubleBuffered(boolean value0){
     object.setDoubleBuffered(value0);
     return this;
}
public JButtonBuilder focusTraversalKeys(int value0,java.util.Set value1){
     object.setFocusTraversalKeys(value0,value1);
     return this;
}
public JButtonBuilder foreground(java.awt.Color value0){
     object.setForeground(value0);
     return this;
}
public JButtonBuilder inheritsPopupMenu(boolean value0){
     object.setInheritsPopupMenu(value0);
     return this;
}
public JButtonBuilder inputMap(int value0,javax.swing.InputMap value1){
     object.setInputMap(value0,value1);
     return this;
}
public JButtonBuilder inputVerifier(javax.swing.InputVerifier value0){
     object.setInputVerifier(value0);
     return this;
}
public JButtonBuilder nextFocusableComponent(java.awt.Component value0){
     object.setNextFocusableComponent(value0);
     return this;
}
public JButtonBuilder preferredSize(java.awt.Dimension value0){
     object.setPreferredSize(value0);
     return this;
}
public JButtonBuilder requestFocusEnabled(boolean value0){
     object.setRequestFocusEnabled(value0);
     return this;
}
public JButtonBuilder tooltiptext(java.lang.String value0){
     object.setToolTipText(value0);
     return this;
}
public JButtonBuilder transferHandler(javax.swing.TransferHandler value0){
     object.setTransferHandler(value0);
     return this;
}
public JButtonBuilder verifyInputWhenFocusTarget(boolean value0){
     object.setVerifyInputWhenFocusTarget(value0);
     return this;
}
public JButtonBuilder maximumSize(java.awt.Dimension value0){
     object.setMaximumSize(value0);
     return this;
}
public JButtonBuilder minimumSize(java.awt.Dimension value0){
     object.setMinimumSize(value0);
     return this;
}
public JButtonBuilder visible(boolean value0){
     object.setVisible(value0);
     return this;
}
public JButtonBuilder background(java.awt.Color value0){
     object.setBackground(value0);
     return this;
}
public JButtonBuilder opaque(boolean value0){
     object.setOpaque(value0);
     return this;
}
public JButtonBuilder getIns(){
     object.getInsets();
     return this;
}
public JButtonBuilder getIns(java.awt.Insets value0){
     object.getInsets(value0);
     return this;
}
public JButtonBuilder border(javax.swing.border.Border value0){
     object.setBorder(value0);
     return this;
}
public JButtonBuilder font(java.awt.Font value0){
     object.setFont(value0);
     return this;
}
public JButtonBuilder focusTraversalPolicy(java.awt.FocusTraversalPolicy value0){
     object.setFocusTraversalPolicy(value0);
     return this;
}
public JButtonBuilder ins(){
     object.insets();
     return this;
}
public JButtonBuilder componentZOrder(java.awt.Component value0,int value1){
     object.setComponentZOrder(value0,value1);
     return this;
}
public JButtonBuilder focusCycleRoot(boolean value0){
     object.setFocusCycleRoot(value0);
     return this;
}
public JButtonBuilder focusTraversalPolicyProvider(boolean value0){
     object.setFocusTraversalPolicyProvider(value0);
     return this;
}
public JButtonBuilder name(java.lang.String value0){
     object.setName(value0);
     return this;
}
public JButtonBuilder size(java.awt.Dimension value0){
     object.setSize(value0);
     return this;
}
public JButtonBuilder size(int value0,int value1){
     object.setSize(value0,value1);
     return this;
}
public JButtonBuilder locale(java.util.Locale value0){
     object.setLocale(value0);
     return this;
}
public JButtonBuilder bounds(java.awt.Rectangle value0){
     object.setBounds(value0);
     return this;
}
public JButtonBuilder bounds(int value0,int value1,int value2,int value3){
     object.setBounds(value0,value1,value2,value3);
     return this;
}
public JButtonBuilder cursor(java.awt.Cursor value0){
     object.setCursor(value0);
     return this;
}
public JButtonBuilder focusable(boolean value0){
     object.setFocusable(value0);
     return this;
}
public JButtonBuilder location(int value0,int value1){
     object.setLocation(value0,value1);
     return this;
}
public JButtonBuilder location(java.awt.Point value0){
     object.setLocation(value0);
     return this;
}
public JButtonBuilder componentOrientation(java.awt.ComponentOrientation value0){
     object.setComponentOrientation(value0);
     return this;
}
public JButtonBuilder dropTarget(java.awt.dnd.DropTarget value0){
     object.setDropTarget(value0);
     return this;
}
public JButtonBuilder focusTraversalKeysEnabled(boolean value0){
     object.setFocusTraversalKeysEnabled(value0);
     return this;
}
public JButtonBuilder ignoreRepaint(boolean value0){
     object.setIgnoreRepaint(value0);
     return this;
}

    public static void main(String[] args) {
       
    }
}
