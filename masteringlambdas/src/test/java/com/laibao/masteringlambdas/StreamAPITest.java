package com.laibao.masteringlambdas;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest {

    @Test
    public void testCollectFunction() {

        Stream<String> stream = Stream.of("hello","world","welcome","hangzhong","china");

        List<String> list = stream.collect(() -> new ArrayList<String>(),                       //待返回的集合列表
                                           (theList,element) -> theList.add(element),           // 累加器
                                            (listOne,listTwo) -> listOne.addAll(listTwo));      //聚合器


        list.forEach(System.out::println);


//        List<String> list1 = stream.collect(ArrayList::new,           //待返回的集合列表
//                                            ArrayList::add,           // 累加器
//                                            ArrayList::addAll);       //聚合器


        /**
         * java.lang.IllegalStateException: stream has already been operated upon or closed
         *
         * 	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
         * 	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:510)
         * 	at com.laibao.masteringlambdas.StreamAPITest.testCollectFunction(StreamAPITest.java:24)
         */


        List<String> list1 = Stream.of("hello","world","welcome","hangzhong","china").collect(ArrayList::new,           //待返回的集合列表
                ArrayList::add,                                       // 累加器
                ArrayList::addAll);                                   //聚合器


        list1.forEach(System.out::println);


        List<String> list2 = Stream.of("hello","world","welcome","hangzhong","china").collect(Collectors.toCollection(ArrayList::new));

        list2.forEach(System.out::println);

        Set<String> set = Stream.of("hello","world","welcome","hangzhong","china").collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);

        Set<String> set1 = Stream.of("hello","world","welcome","hangzhong","china").collect(Collectors.toCollection(LinkedHashSet::new));
        set1.forEach(System.out::println);

        String str = Stream.of("hello","world","welcome","hangzhong","china").collect(Collectors.joining());
        System.out.println(str);
    }
}

