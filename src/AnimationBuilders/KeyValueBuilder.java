package AnimationBuilders;

public class KeyValueBuilder {

private final javafx.animation.KeyValue object;

public KeyValueBuilder(javafx.beans.value.WritableValue para0,java.lang.Object para1){
     this.object=new javafx.animation.KeyValue( para0, para1);
}

public KeyValueBuilder(javafx.beans.value.WritableValue para0,java.lang.Object para1,javafx.animation.Interpolator para2){
     this.object=new javafx.animation.KeyValue( para0, para1, para2);
}

public javafx.animation.KeyValue build(){
     return object;
}

}
