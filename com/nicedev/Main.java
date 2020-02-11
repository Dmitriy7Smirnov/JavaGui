package com.nicedev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Main {
    public static void main(String[] args) {
        ClickListener clickListener = new ClickListener();
        clickListener.FormCreate();
    }
}
