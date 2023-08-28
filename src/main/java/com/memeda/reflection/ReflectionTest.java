package com.memeda.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-18 00:17:27
 */
public class ReflectionTest {
    private static void printSpace(int n, char c) {
        for (int i = 0; i < n; ++i) {
            System.out.print(c);
        }
    }

    /**
     *  打印类所有构造器
     * @author hugememeda
     * @date 2023-08-18 00:33:09

     * @param cl 类的对象
     * @return
     * @throws
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            printSpace(4, ' ');
            String modifiers = Modifier.toString(c.getModifiers());
            if (!modifiers.isEmpty())
                System.out.print(modifiers + " ");
            System.out.print(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; ++j) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     *  打印类的所有方法
     * @author hugememeda
     * @date 2023-08-19 00:39:44

     * @param cl
     * @return
     * @throws
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            printSpace(4, ' ');
            String modifiers = Modifier.toString(m.getModifiers());
            if (!modifiers.isEmpty()) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; ++i) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     *  打印所有属性
     * @author hugememeda
     * @date 2023-08-19 00:49:14

     * @param cl
     * @return
     * @throws
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            printSpace(4, ' ');
            String modifiers = Modifier.toString(f.getModifiers());
            if (!modifiers.isEmpty()) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    /**
     *  打印所有接口
     * @author hugememeda
     * @date 2023-08-19 00:55:19

     * @param cl
     * @return
     * @throws
     */
    public static void printInterfaces(Class cl) {
        Class<?>[] interfaces = cl.getInterfaces();
        for (int i = 0; i < interfaces.length; ++i) {
            if (i == 0) {
                System.out.print(cl.isInterface() ? " extends " : " implements ");
            } else {
                System.out.print(", ");
            }
            System.out.print(interfaces[i].getName());
        }
    }

    public List<Date> getDate(Map<String, String> map) {
        return new ArrayList<>();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = scanner.next();
        }
        Class cl = Class.forName(name);
        String modifiers = Modifier.toString(cl.getModifiers());
        if (!modifiers.isEmpty()) {
            System.out.print(modifiers + " ");
        }
        if (cl.isEnum()) {
            System.out.print("eum " + name);
        } else if (cl.isInterface()) {
            System.out.print("interface " + name);
        } else {
            System.out.print("class " + name);
        }
        Class supercl = cl.getSuperclass();
        if (supercl != null && supercl != Object.class) {
            System.out.print(" extends " + supercl.getName());
        }
        printInterfaces(cl);
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println();
        System.out.print("}\n");
        System.out.println("basic________________");
        System.out.println(byte.class.getName());
        System.out.println(short.class.getName());
        System.out.println(int.class.getName());
        System.out.println(long.class.getName());
        System.out.println(float.class.getName());
        System.out.println(double.class.getName());
        System.out.println(boolean.class.getName());
        System.out.println(char.class.getName());
        System.out.println("basic[]________________");
        System.out.println(byte[].class.getName());
        System.out.println(short[].class.getName());
        System.out.println(int[].class.getName());
        System.out.println(long[].class.getName());
        System.out.println(float[].class.getName());
        System.out.println(double[].class.getName());
        System.out.println(boolean[].class.getName());
        System.out.println(char[].class.getName());
        System.out.println("BASIC________________");
        System.out.println(Byte.class.getName());
        System.out.println(Short.class.getName());
        System.out.println(Integer.class.getName());
        System.out.println(Long.class.getName());
        System.out.println(Float.class.getName());
        System.out.println(Double.class.getName());
        System.out.println(Boolean.class.getName());
        System.out.println(Character.class.getName());
        System.out.println("BASIC________________");
        System.out.println(Byte[].class.getName());
        System.out.println(Short[].class.getName());
        System.out.println(Integer[].class.getName());
        System.out.println(Long[].class.getName());
        System.out.println(Float[].class.getName());
        System.out.println(Double[].class.getName());
        System.out.println(Boolean[].class.getName());
        System.out.println(Character[].class.getName());
        System.out.println("other________________");
        System.out.println(String.class.getName());
        System.out.println(String[].class.getName());
        System.out.println(int[].class.getComponentType().getName());
        System.out.println(String[].class.getComponentType().getName());
    }
    public static int aa[];
    public String[] bb;

}
// com.memeda.reflection.ReflectionTest
