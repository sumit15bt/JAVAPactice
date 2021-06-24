
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sumit
 */
public class Streaming {

    public static void main(String[] agrs) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        list.add(4);
        
        int mult = list.stream().reduce(1, (mul, i) -> mul * i);
        System.out.println(mult);
        list.stream().sorted().filter(i -> i % 2 == 0).forEach(System.out::println);
        list = list.stream().sorted().map(l -> l * l).collect(Collectors.toList());
        System.out.println("list ===>");
        System.out.println(list);
        list = list.stream().filter(i -> i % 3 == 0).map(i -> i * i * i).collect(Collectors.toList());
      System.out.println("list cube that is  divisible by3 = 0 ===>");
        System.out.println(list);

    }
}
