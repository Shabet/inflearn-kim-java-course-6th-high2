package section12.reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("section12.reflection.data.BasicData");

        System.out.println("===== getConstructors() =====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("===== getDeclaredConstructors() =====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
