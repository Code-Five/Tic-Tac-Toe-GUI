package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class TicTacToeGUI {







        String userShape;
    String[] userBox = new String[5];
    String[] cmpBox=new String[5];
int userIndex=0;
    int cmpIndex=0;





    public void chooseShape(){
        JFrame chooseShapeFrame=new JFrame("TicTacToe | Shape Pick");
        JLabel chooseText=new JLabel("Choose a Shape To use:");
        JButton xButton=new JButton("X");
        JButton yButton=new JButton("0");

        chooseShapeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        chooseShapeFrame.setLayout( new GridBagLayout());
        chooseShapeFrame.setSize(400, 198);
        chooseShapeFrame.setLocationRelativeTo(null);
        chooseShapeFrame.getContentPane().setBackground(new Color(0, 162, 255));

        chooseText.setFont(new Font("Gill sans", Font.BOLD, 24));
        chooseText.setForeground(Color.darkGray);

        xButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        xButton.setForeground(new Color(94, 94, 94));

        yButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        yButton.setForeground(new Color(94, 94, 94));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0, 162, 255));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        buttonPanel.add(xButton);
        buttonPanel.add(yButton);

        xButton.setPreferredSize(new Dimension(100, 50));
        yButton.setPreferredSize(new Dimension(100, 50));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(5, 0, 10, 0);
        chooseShapeFrame.add(chooseText, gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(15, 0, 15, 0);
        chooseShapeFrame.add(buttonPanel, gridBagConstraints);



        chooseShapeFrame.setVisible(true);

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseShapeFrame.dispose();
                userShape="X";
                ticTacToe(userShape);
            }
        });
        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseShapeFrame.dispose();
                userShape="O";
                ticTacToe(userShape);
            }
        });
    }
    JButton box1=new JButton("");
    JButton box2=new JButton("");
    JButton box3=new JButton("");
    JButton box4=new JButton("");
    JButton box5=new JButton("");
    JButton box6=new JButton("");
    JButton box7=new JButton("");
    JButton box8=new JButton("");
    JButton box9=new JButton("");
    JFrame ticTacToeFrame=new JFrame("TicTacToe");
    public void ticTacToe(String userShape) {

        JLabel clickText = new JLabel("Click on the boxes to choose a position");


        ticTacToeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ticTacToeFrame.setLayout( new GridBagLayout());
        ticTacToeFrame.setSize(650, 500);
        ticTacToeFrame.getContentPane().setBackground(new Color(0, 162, 255));
        ticTacToeFrame.setLocationRelativeTo(null);

        box1.setBackground(Color.gray);

        box1.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box1.setForeground(Color.black);

        box2.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box2.setForeground(Color.black);

        box3.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box3.setForeground(Color.black);

        box4.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box4.setForeground(Color.black);

        box5.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box5.setForeground(Color.black);

        box6.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box6.setForeground(Color.black);

        box7.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box7.setForeground(Color.black);

        box8.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box8.setForeground(Color.black);

        box9.setFont(new Font("Gill sans ultra bold", Font.BOLD, 30));
        box9.setForeground(Color.black);

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
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(1);
                    userIndex++;

                    addText(box1, userShape);

                    computerPick();
                    checkWin(userBox, "user");
                }
            }
        });
        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(2);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box2, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        });
        box3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(3);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box3, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        });
        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(4);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box4, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        }); box5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(5);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box5, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        }); box6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(6);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box6, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        });
        box7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(7);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box7, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox, "user");
                }
            }
        });
        box8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(8);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box8, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox,"user");
                }
            }
        });
        box9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex < userBox.length) {
                    userBox[userIndex] = String.valueOf(9);
                    userIndex++; // Increment userIndex here, after assigning a value to userBox

                    addText(box9, userShape);

                    computerPick(); // Pass userShape to the computerPick method
                    checkWin(userBox,"user");
                }
            }
        });

    }

    public void addText(JButton box, String userShape) {
        if (box != null &&( box.getText().isEmpty() || Objects.equals(box.getText(), "")) ){
            box.setText(userShape);
        }

       else{
            assert box != null;

            System.out.println(box.getText());
            JOptionPane.showMessageDialog(null, "This Box has already being chosen.\nPick an empty box");
        }
    }
    public void computerPick() {
        Random randomNumber = new Random();
        JButton computerBox = null;
        int cmpPosition;

        do {
            int computerPick = randomNumber.nextInt(9) + 1;
            cmpPosition=computerPick;


            switch (computerPick) {
                case 1 -> computerBox = box1;
                case 2 -> computerBox = box2;
                case 3 -> computerBox = box3;
                case 4 -> computerBox = box4;
                case 5 -> computerBox = box5;
                case 6 -> computerBox = box6;
                case 7 -> computerBox = box7;
                case 8 -> computerBox = box8;
                case 9 -> computerBox = box9;
            }
        } while (computerBox != null && !computerBox.getText().isEmpty());

        if (computerBox != null) {
            String computerShape = userShape.equals("X") ? "O" : "X";
            computerBox.setText(computerShape);
            if (cmpIndex < cmpBox.length) {
                cmpBox[cmpIndex] = String.valueOf(cmpPosition);
                cmpIndex++;
                for (String box : cmpBox) {
                    System.out.println(box);
                }
            }
            checkWin(cmpBox,"computer");
        }
    }

    public void checkWin(String[] box, String user){
        TicTacToe ticTacToe=new TicTacToe();
        int boxesIndex=0;
//        for(int i=0;i<box.length;i++){
//            boxIndex++;
//        }
        for (String symbol : box) {

            if ( symbol!=null ) {
                boxesIndex++;
            }
        }
        if(boxesIndex>=3){
            boolean result=ticTacToe.checkWin(box);
            if(result){
                if(Objects.equals(user, "computer")){
                    JOptionPane.showMessageDialog(null,"Computer won!!!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"You won!!!");
                }
                resetGame();

            }
        }

    }

    public void resetGame() {
        ticTacToeFrame.dispose();
        // Clear the text of all buttons
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");

        // Reset user and computer box arrays
        Arrays.fill(userBox, null);
        Arrays.fill(cmpBox, null);

        // Reset user and computer indices
        userIndex = 0;
        cmpIndex = 0;

        // Show a message indicating the start of a new game
        JOptionPane.showMessageDialog(null, "New game started! Choose a position to play.");

        // Start a new game by allowing the user to choose their shape
        chooseShape();
    }




}
