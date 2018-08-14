package com.laibao.functionintroduction.chapter1;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0
 */
public class Java8FunctionalHelloButtonApp {
    private final Button button = new Button();

    public Java8FunctionalHelloButtonApp() {
        button.addActionListener(( ActionEvent event) -> System.out.println("Hello There: event received: "+event));
    }
}
