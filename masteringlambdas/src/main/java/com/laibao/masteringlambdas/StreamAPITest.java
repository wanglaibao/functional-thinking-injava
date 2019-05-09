package com.laibao.masteringlambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello","world","welcome","hangzhong","china");

        List<String> list = stream.collect(() -> new ArrayList<String>(),                       //待返回的集合列表
                                           (theList,element) -> theList.add(element),           // 累加器
                                            (listOne,listTwo) -> listOne.addAll(listTwo));      //聚合器


        list.forEach(System.out::println);


        List<String> list1 = stream.collect(ArrayList::new,           //待返回的集合列表
                                            ArrayList::add,           // 累加器
                                            ArrayList::addAll);       //聚合器


        list1.forEach(System.out::println);
    }
}
