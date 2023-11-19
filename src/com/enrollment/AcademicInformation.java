package com.enrollment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcademicInformation extends JFrame{

    private JButton btnContinue;
    private JPanel academicInformationPanel;
    private JTextField tfAcademicYear;
    private JLabel lbAcademicYear;
    private JTextField tfCampus;
    private JLabel lbCampus;
    private JTextField tfProgram;
    private JTextField tfCurriculum;
    private JTextField tfLevel;
    private JTextField tfStatus;
    private JTextField tfBalance;
    private JLabel lbBalance;
    private JLabel lbStatus;
    private JLabel lbLevel;
    private JLabel lbCurriculum;
    private JLabel lbProgram;

    public AcademicInformation(){
        setTitle("Enrollment");
        setContentPane(academicInformationPanel);
        setMinimumSize(new Dimension(510, 429));
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        btnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdvisingForm advisingForm = new AdvisingForm();
                advisingForm.setLocationRelativeTo(null);
                advisingForm.setVisible(true);
            }
        });
    }

}
