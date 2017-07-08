package javaobjectbuilder;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Properties;
import javafx.beans.property.IntegerProperty;

public class ClassBuilderGenarator {

    private Class<?> gClass;
    private String masterPackage;
    private String superPackage;


    public ClassBuilderGenarator(String classString, String masterPackage, String superPackage) throws Exception {
        this.gClass = Class.forName(classString, false, ClassLoader.getSystemClassLoader());
        this.masterPackage = masterPackage;
        this.superPackage = superPackage;

    }

    public ClassBuilderGenarator getNewGenarator(String classString, String masterPackage, String superPackage) throws Exception {
        this.gClass = Class.forName(classString, false, ClassLoader.getSystemClassLoader());
        this.masterPackage = masterPackage;
        this.superPackage = superPackage;
        return this;
    }
    
    public String getClassName(){
        return gClass.getSimpleName() + "Builder";
    }

    public String getGenaratedClass() {
        String className = gClass.getSimpleName() + "Builder";
        String fullName = gClass.getName();

        String gc = "package " + masterPackage + (superPackage.trim().isEmpty() ? "" : ".") + superPackage + ";\n\n";
        gc += "public class " + className + " {\n\n";
        gc += "private final " + fullName + " object;\n\n";

        Constructor<?>[] constructors = gClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            Parameter[] ps = constructor.getParameters();
            String cpList = "";
            String cpnList = "";
            for (int i = 0; i < ps.length; i++) {
                if (i == ps.length - 1) {
                    cpList += ps[i].getType().getName() + " para" + i;
                    cpnList += " para" + i;
                } else {
                    cpList += ps[i].getType().getName() + " para" + i + ",";
                    cpnList += " para" + i + ",";
                }
            }
            gc += "public " + className + "(" + cpList + "){\n";
            gc += "     this.object=new " + fullName + "(" + cpnList + ");\n";
            gc += "}\n\n";
        }
        gc += "public " + fullName + " build(){\n";
        gc += "     return object;\n";
        gc += "}\n\n";

        Method[] methods = gClass.getMethods();
        for (Method m : methods) {

            String mName = m.getName();

            
            if (mName.contains("set")) {
                Class<?>[] parameterTypes = m.getParameterTypes();
                String paraList = "(";
                String sendList = "(";
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        paraList += parameterTypes[i].getName() + " value" + i;
                        sendList += "value" + i;
                    } else {
                        paraList += parameterTypes[i].getName() + " value" + i + ",";
                        sendList += "value" + i + ",";

                    }
                }
                paraList += ")";
                sendList += ")";
                String r = mName.replace("set", "");
                String ss = r.substring(0, 1);
                String sName = r.replace(ss, ss.toLowerCase());
                gc += "public " + className + " " + sName + paraList + "{\n"
                        + "     object." + mName + sendList + ";\n"
                        + "     return this;\n"
                        + "}\n";

            }

        }

        gc += "}\n";

        return gc;
    }

    
}
