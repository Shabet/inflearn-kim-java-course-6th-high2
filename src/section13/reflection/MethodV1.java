package section13.reflection;

import section13.reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("===== methods() =====");
        Method[] methods = helloClass.getMethods(); // public 메서드만
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("===== declaredMethods() =====");
        Method[] declaredMethods = helloClass.getDeclaredMethods(); // 모든 메서드 (상속 메서드는 제외)
        for (Method method : declaredMethods) {
            System.out.println("declaredMethod = " + method);
        }
    }
}
