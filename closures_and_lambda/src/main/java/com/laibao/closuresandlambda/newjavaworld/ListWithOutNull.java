package com.laibao.closuresandlambda.newjavaworld;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.laibao.closuresandlambda.modle.User;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

/**
 * @author laibao wang.
 */
public class ListWithOutNull {

    private Comparator<User> comparator = comparing(User::getLastName).thenComparing(User::getFirstName);


    Consumer<Iterable> print_Objects = list -> {
        for(Object it : list) {
            System.out.println(it);
        }
    };

    // For the record, this is the same result in more idiomatic Java 8 code:
    Consumer<Iterable> printObjects = (Iterable list) -> list.forEach(System.out::println);

    public static <T> List<T> cloneWithoutNullsOne(final List<T> list) {
        List<T> newList = new ArrayList<T>();
        for (T t :list) {
            if (t != null) {
                newList.add(t);
            }
        }
        return newList;
    }

    // Apache Commons-Collections Implementation of cloneWithoutNulls
    public static <T> List<T> cloneWithoutNullsTwo(final List<T> list) {
        Collection<T> newList = CollectionUtils.select(list, PredicateUtils.notNullPredicate());
        return new ArrayList<>(newList);
    }

    // Google Guava Implementation of cloneWithoutNulls(List)
    public static <A> List<A> cloneWithoutNullsThree(final List<A> list) {
        Collection<A> nonNulls = Collections2.filter(list, Predicates.notNull());
        return new ArrayList<>(nonNulls);
    }

    //Java 8 Predicate Implementation of cloneWithoutNulls(List)
    public static <T> List<T> cloneWithoutNullsFour(final List<T> list) {
        List<T>  newList = new ArrayList<>(list);
        newList.removeIf(Predicate.isEqual(null));
        return newList;
    }

    // Java 8 Lambda Implementation of cloneWithoutNulls
    public static <A> List<A> cloneWithoutNullsFive(final List<A> list) {
        List<A> newList = new ArrayList<>(list);
        newList.removeIf(it -> it == null);
        return newList;
    }
}
