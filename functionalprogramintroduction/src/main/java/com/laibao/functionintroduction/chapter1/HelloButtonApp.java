package com.laibao.functionintroduction.chapter1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0
 */
public class HelloButtonApp {
    private final Button button = new Button();

    public HelloButtonApp() {
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                System.out.println("Hello There: event received: " + event);
            }
        });

        button.addActionListener((ActionEvent event) -> System.out.println("Hello There: event received: " + event));
    }
}
