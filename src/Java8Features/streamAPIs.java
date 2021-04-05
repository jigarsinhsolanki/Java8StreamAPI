package Java8Features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPIs {

    public static void main(String[] args) {

        List<Integer> arrayList= Arrays.asList(1,2,3,22,33,44,55);
        System.out.println("==============================================");
        arrayList.stream().filter(a->a%2==0).collect(Collectors.toList());

        System.out.println(arrayList);

        System.out.println("==============================================");

        List<Integer> collect = arrayList.stream().filter(b -> b > 10).collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("==============================================");


        String[] s= {"jigar","lancer","jack","jakie"};

        Stream<String> stream= Arrays.stream(s);

        stream.filter(f->f.startsWith("j")).forEach(System.out::println);

        System.out.println("==============================================");

        Stream.of("Jai", "Mahesh", "Vishal", "Naren", "Hemant", "Naren", "Vishal").distinct().forEach(System.out::println);

        System.out.println("==============================================");

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Jai");
        hashMap.put(2, "Mahesh");
        hashMap.put(3, "Vishal");
        hashMap.put(4, "Vivek");
        hashMap.put(5, "Hemant");
        hashMap.put(6, "Naren");
        //forEach to iterate and display each key and value pair
        hashMap.forEach((key,value)->System.out.println(key+" - "+value));

        System.out.println("==============================================");

        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
        intStream1.forEach(System.out::println);

        System.out.println("==============================================");

        System.out.println("==============================================");

        System.out.println("==============================================");

        System.out.println("==============================================");

        System.out.println("==============================================");

        System.out.println("==============================================");







    }
}
