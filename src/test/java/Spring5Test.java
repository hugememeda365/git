import com.memeda.extend.Normal;
import com.memeda.generic.ArrayAlg;
import com.memeda.generic.Pair;
import com.memeda.impl.ReadImageFile;
import com.memeda.pojo.*;
import com.memeda.reflection.Good;
import com.memeda.reflection.Huge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.Timer;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.List;
import java.util.function.*;


@DisplayName("我的第一个Spring5测试")
public class Spring5Test {

    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        user.setName("huge");
        System.out.println(user.getName());
        user.add();

    }

    @Test
    public void test02(int a) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(null);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == null)
                    return 1;
                if (o2 == null)
                    return - 1;
                return o1 - o2;
            }
        });
        System.out.println(list);
    }
    /**
     *
     * @author hugememeda
     * @date 2023-08-14 22:19:15

     * @param
     * @return
     * @throws
     */
    public void read() throws IOException {

        try {
            ReadImageFile readImageFile = new ReadImageFile();
            readImageFile.readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    @Test
    public void test03() {
        try {
            read();
        } catch (IOException e) {
            Throwable throwable = e.getCause();
            if (throwable != null)
                System.out.println(throwable.getMessage());
            System.out.println("end");
        }
    }

    @Test
    public void test04() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String name = "java.util.Random";
        Class<?> cl = Class.forName(name);
        Object o = cl.getConstructor().newInstance();
        System.out.println(o);

        System.out.println(cl);
        cl = int.class;
        System.out.println(cl);
        cl = double[].class;
        System.out.println(cl);
        cl = Double[].class;
        System.out.println(cl);
    }

    @Test
    public void test05() {
        for (int i = 0; i < 33; ++i) {
            String s = Modifier.toString(i);
            System.out.println(s);
        }
    }

    @Test
    public void test06() throws IllegalAccessException, NoSuchFieldException {
        User user = new User();
        user.setName("huxingting");
        Class cl = user.getClass();
        System.out.println(cl);
        System.out.println(cl.getName());
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object o = f.get(user);
        System.out.println(o);
    }

    @Test
    public void test07() {
        Integer[] a = {1, 2, 3};
        System.out.println(ArrayAlg.<Integer>getMiddle(a));
        String[] b = {"baaa", "bbb", "aba"};
        System.out.println(ArrayAlg.<String>min(b));
    }

    @Test
    public void test08() {
        Pair[] p = new Pair<?>[10];
        p[0] = new Pair<String>();
        Pair<User>[] pairs = (Pair<User>[])p;
        pairs[0].getFirst().add();


    }
    @Test
    public void test09() {
        ArrayList<Pair<User>> user = new ArrayList<>();
        user.add(new Pair<>());
    }
    @SafeVarargs
    public static <T> void addAll(Collection<T> coll, T... ts) {
        for (T t : ts)
            coll.add(t);
    }

    @Test
    public void test10() {
        User[] users = new User[3];
        users[0] = new User();
        users[0].setName("bab");
        users[1] = new User();
        users[1].setName("aba");
        users[2] = new User();
        users[2].setName("bba");
        Pair<User> minmax = ArrayAlg.minmax(users);
        System.out.println(minmax.getFirst().getName());
        System.out.println(minmax.getSecond().getName());

    }
    @Test
    public void test11() {
        VIP[] users = new VIP[3];
        users[0] = new VIP();
        users[0].setName("bab");
        users[1] = new VIP();
        users[1].setName("aba");
        users[2] = new VIP();
        users[2].setName("bba");
        Pair<User> minmax = ArrayAlg.minmax(users);
        System.out.println(minmax.getFirst().getName());
        System.out.println(minmax.getSecond().getName());
        LocalDate[] lds = new LocalDate[3];
        lds[0] = LocalDate.of(2023, 10, 11);
        lds[1] = LocalDate.of(2023, 9, 21);
        lds[2] = LocalDate.of(2022, 10, 23);
        Pair<ChronoLocalDate> res = ArrayAlg.minmax(lds);
        System.out.println(res.getFirst());
        System.out.println(res.getSecond());
    }

    @Test
    public void test12() {
        User user1 = new User();
        VIP vip1 = new VIP();
        User vip2 = new VIP();
        System.out.println(user1.getClass());
        System.out.println(User.class);
        System.out.println(vip1.getClass());
        System.out.println(VIP.class);
        System.out.println(vip2.getClass());
        vip2.add();
    }

    @Test
    public void test13() {
        Normal normal = new Normal();
        normal.addLess();
        Teacher teacher = new Teacher();
        teacher.test();
        byte b = (byte) -129;
        System.out.println(b);
        Double.compare(3, 9);
        Size size = Enum.<Size>valueOf(Size.class, "MID");
        System.out.println(size);
    }
    @Test
    public void test14() {
        BiFunction<String, String, Integer> comp;
        Predicate<String> predicate;
        List<Fruit> fruits = new ArrayList<>();
        List<RedApple> redApples = new ArrayList<>();
        List<Apple> apples = new ArrayList<>();
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        Fruit f4 = new Fruit();
        RedApple r1 = new RedApple();
        RedApple r2 = new RedApple();
        RedApple r3 = new RedApple();
        RedApple r4 = new RedApple();
        apples.add(r1);
        apples.add(r2);
        apples.add(r3);
        apples.add(r4);
        apples.add(r4);
        System.out.println(apples);
//        Predicate<Fruit> f = new Predicate<Fruit>() {
//            @Override
//            public boolean test(Fruit fruit) {
//                return fruit.getScore() < 60;
//            }
//        };
        Predicate<Fruit> f = fruit -> fruit.getScore() < 60;
        apples.removeIf(f);
        System.out.println(apples);
        Arrays.sort(null, String::compareToIgnoreCase);
    }

    @Test
    public void test15() {
//        Fruit f = new RedApple();
//        System.out.println(f);
        Huge huge = new Huge("huxingting", System.out::println);
        huge.say();
        javax.swing.Timer timer = new Timer(1000, System.out::println);
    }

    @Test
    public void test16() {
        Good.Bad bad = new Good.Bad();
        Good.Bad bad2 = new Good.Bad();
        Good.Bad bad3 = new Good.Bad();
        System.out.println(bad + " " + System.identityHashCode(bad));
        System.out.println(bad2 + " " + System.identityHashCode(bad2));
        System.out.println(bad3 + " " + System.identityHashCode(bad3));
        bad.hello("HUGE");
        Arrays.sort(null, String::compareToIgnoreCase);
        Supplier<String> t;
        Consumer<String> t1;
        BiConsumer<Integer, String> t3;
        Function<Integer, String> t4;
        BiFunction<Integer, Integer, Integer> t5;
        UnaryOperator<Integer> t6;
        Comparator<String> t7;
        Toolkit.getDefaultToolkit().beep();
    }

    @Test
    public void test17() {
        System.out.println("hello git");
    }

}

enum Size {
    SMALL, MID
}
