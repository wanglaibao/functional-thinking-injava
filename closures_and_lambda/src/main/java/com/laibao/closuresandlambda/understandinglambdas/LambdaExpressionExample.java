package com.laibao.closuresandlambda.understandinglambdas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Function;

/**
 * @author laibao wang
 */
public class LambdaExpressionExample {


    //Identity Function Implemented Using a Lambda
    public static <T> Function<T,T> identityFunction() {
        return t -> t;
    }

    public static void main(String[] args) {
        Function<File, Byte> firstByte = file -> {
            try (InputStream is = new FileInputStream(file)) {
                return (byte) is.read();
            } catch (IOException ioe) {
                throw new RuntimeException("Could not read " + file, ioe);
            }
        };
        for (String filename : args) {
            File file = new File(filename);
            int byte1 = firstByte.apply(file);
            System.out.println(filename + "\t=>\t" + byte1);
        }
    }
}
