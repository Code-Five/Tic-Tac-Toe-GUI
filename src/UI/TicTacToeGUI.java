package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI {
    JFrame ticTacToeFrame=new JFrame("TicTacToe");
    JLabel clickText = new JLabel("Click on the boxes to choose a position");
    JButton box1=new JButton("");
    JButton box2=new JButton("");
    JButton box3=new JButton("");
    JButton box4=new JButton("");
    JButton box5=new JButton("");
    JButton box6=new JButton("");
    JButton box7=new JButton("");
    JButton box8=new JButton("");
    JButton box9=new JButton("");
    String userShape="X";


    public void ticTacToe() {
        ticTacToeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ticTacToeFrame.setLayout( new GridBagLayout());
        ticTacToeFrame.setSize(650, 500);
        ticTacToeFrame.setLocationRelativeTo(null);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 87;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.ipadx = 100;
        gridBagConstraints2.ipady = 87;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridy = 0;
        gridBagConstraints3.ipadx = 100;
        gridBagConstraints3.ipady = 87;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 1;
        gridBagConstraints4.ipadx = 100;
        gridBagConstraints4.ipady = 87;
        gridBagConstraints4.anchor = GridBagConstraints.CENTER;
        gridBagConstraints4.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.gridy = 1;

        gridBagConstraints5.ipadx = 100;
        gridBagConstraints5.ipady = 87;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 2;
        gridBagConstraints6.gridy = 1;

        gridBagConstraints6.ipadx = 100;
        gridBagConstraints6.ipady = 87;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets =new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.gridy = 2;

        gridBagConstraints7.ipadx = 100;
        gridBagConstraints7.ipady = 87;
        gridBagConstraints7.anchor = GridBagConstraints.CENTER;
        gridBagConstraints7.insets =new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 1;
        gridBagConstraints8.gridy = 2;

        gridBagConstraints8.ipadx = 100;
        gridBagConstraints8.ipady = 87;
        gridBagConstraints8.anchor = GridBagConstraints.CENTER;
        gridBagConstraints8.insets =new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 2;
        gridBagConstraints9.gridy = 2;

        gridBagConstraints9.ipadx = 100;
        gridBagConstraints9.ipady = 87;
        gridBagConstraints9.anchor = GridBagConstraints.CENTER;
        gridBagConstraints9.insets =new Insets(15, 15, 15, 15);

        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 2;
        gridBagConstraints10.gridy = 2;
        gridBagConstraints10.gridwidth = 3;
        gridBagConstraints10.ipadx = 118;
        gridBagConstraints10.ipady = 87;
        gridBagConstraints10.anchor = GridBagConstraints.CENTER;
        gridBagConstraints10.insets =new Insets(15, 15, 15, 15);

//        ticTacToeFrame.add(clickText,gridBagConstraints);
        ticTacToeFrame.add(box1,gridBagConstraints);
        ticTacToeFrame.add(box2,gridBagConstraints2);
        ticTacToeFrame.add(box3,gridBagConstraints3);
        ticTacToeFrame.add(box4,gridBagConstraints4);
        ticTacToeFrame.add(box5,gridBagConstraints5);
        ticTacToeFrame.add(box6,gridBagConstraints6);
        ticTacToeFrame.add(box7,gridBagConstraints7);
        ticTacToeFrame.add(box8,gridBagConstraints8);
        ticTacToeFrame.add(box9,gridBagConstraints9);

        ticTacToeFrame.setVisible(true);

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box1,userShape);
            }
        });
        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box2,userShape);
            }
        });
        box3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box3,userShape);
            }
        });
        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box4,userShape);
            }
        }); box5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box5,userShape);
            }
        }); box6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box6,userShape);
            }
        });
        box7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box7,userShape);
            }
        });
        box8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box8,userShape);
            }
        });
        box9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addText(box9,userShape);
            }
        });






    }

    public void addText(JButton box, String userShape) {
        box.setText(this.userShape);
    }

}
