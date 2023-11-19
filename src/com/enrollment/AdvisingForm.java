package com.enrollment;

import javax.swing.*;
import java.awt.*;

public class AdvisingForm extends JFrame {
    private JPanel advisingPanel;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;

    public AdvisingForm(){
        setTitle("Enrollment");
        setContentPane(advisingPanel);
        setMinimumSize(new Dimension(510, 429));
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
