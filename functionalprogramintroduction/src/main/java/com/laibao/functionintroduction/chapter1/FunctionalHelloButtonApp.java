package com.laibao.functionintroduction.chapter1;

import com.laibao.functionintroduction.function.Function1Void;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0
 */
public class FunctionalHelloButtonApp {
    private final Button button = new Button();

    public FunctionalHelloButtonApp() {
//        button.addActionListener(new Function1Void<ActionEvent>() { // 1
//            public void apply(ActionEvent e) { // 2
//                System.out.println("Hello There: event received: "+e);
//            }
//        });
    }
}
