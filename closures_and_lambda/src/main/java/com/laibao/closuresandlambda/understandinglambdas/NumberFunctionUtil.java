package com.laibao.closuresandlambda.understandinglambdas;

import java.util.Random;
import java.util.function.*;

/**
 * @author laibao wang
 */
public class NumberFunctionUtil {

    private static final IntFunction<String> intToString = intNumber -> String.valueOf(intNumber);

    private static final ToIntFunction<String> parseStringAsInt = str -> Integer.valueOf(str);

    private static final IntPredicate isEven = i -> i % 2 == 0;

    private static final IntPredicate isOdd = i -> i % 2 != 0;

    private static final ToIntBiFunction<String,String> maxLength = (left, right) -> Math.max(left.length(), right.length());

    private static final IntConsumer printInt = i -> System.out.println(Integer.toString(i));

    private static final ObjIntConsumer<String> printParsedIntWithRadix = (str,radix) -> System.out.println(Integer.parseInt(str,radix));

    private static final IntSupplier randomInt = () -> new Random().nextInt();

    private static final IntUnaryOperator negateInt = i -> -1 * i;

    private static final IntBinaryOperator multiplyInt = (x,y) -> x*y;

    private static final IntToDoubleFunction intAsDouble = i -> Integer.valueOf(i).doubleValue();

    private static final DoubleToIntFunction doubleAsInt = d -> Double.valueOf(d).intValue();

    private static final IntToLongFunction intAsLong = i -> Integer.valueOf(i).longValue();

    private static final LongToIntFunction longAsInt = x -> Long.valueOf(x).intValue();

    public static void main(String[] args) {
        System.out.println(intToString.apply(1000));
        System.out.println();
        System.out.println(parseStringAsInt.applyAsInt("123123123"));
        System.out.println();
        System.out.println(isEven.test(123));
        System.out.println();
        System.out.println(isOdd.test(234234));
        System.out.println();
        System.out.println(maxLength.applyAsInt("afasfdasfd","fasfasdfasfdasfdasf"));
        System.out.println();
        printInt.accept(10000);
        System.out.println();
        System.out.println(randomInt.getAsInt());
        System.out.println();
        System.out.println(negateInt.applyAsInt(-1000));
        System.out.println();
        System.out.println(multiplyInt.applyAsInt(100,200));
        System.out.println();
        System.out.println(intAsDouble.applyAsDouble(100));
        System.out.println();
        System.out.println(doubleAsInt.applyAsInt(100.01));
        System.out.println();
        System.out.println(intAsLong.applyAsLong(100012));
        System.out.println();
        System.out.println(longAsInt.applyAsInt(1000000));
        System.out.println();

        // This will throw an exception
        methodBeingCalled((Integer i) -> Integer.toString(i));

        // This will not
        methodBeingCalled((int i) -> Integer.toString(i));
    }

    private static void methodBeingCalled(Function<Integer, String> function) {
        String value = function.apply(100000);
        System.out.println(value);
    }

    private static void methodBeingCalled(IntFunction<String> function) {
        String value = function.apply(113123);
        System.out.println(value);
    }
}
