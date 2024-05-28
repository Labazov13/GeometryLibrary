package org.train.maven;

public class CircleUtil {
    public static void circleUtils(){
        System.out.println("I am a method from the library GeometryUtils");
    }
    public static void circleUtils(Object circle){
        System.out.println(circle.getClass() + "Из версии GeometryUtils 1.1.0-SNAPSHOT");
        System.out.println("I am a method from the library GeometryUtils");
    }
}
