package version1;

import javax.swing.*;
import java.awt.*;

public class GameFrame1 extends JFrame {

    GamePanel1 panel;
    GamePanel2_1 panel2;

    public GameFrame1(){

        panel = new GamePanel1();

        panel2 = new GamePanel2_1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.add(panel, BorderLayout.SOUTH);
        this.add(panel2, BorderLayout.EAST);


        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(500, 500);
//        this.setLayout(new BorderLayout(10,10));
//        this.setVisible(true);

////        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
////        JPanel panel3 = new JPanel();
////        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//
////        panel1.setBackground(Color.red);
//        panel2.setBackground(Color.green);
////        panel3.setBackground(Color.yellow);
////        panel4.setBackground(Color.magenta);
//        panel5.setBackground(Color.blue);
//
//        panel5.setLayout(new BorderLayout());
//
////        panel1.setPreferredSize(new Dimension(100,100));
//        panel2.setPreferredSize(new Dimension(150,100));
////        panel3.setPreferredSize(new Dimension(150,100));
////        panel4.setPreferredSize(new Dimension(100,100));
//        panel5.setPreferredSize(new Dimension(100,100));
//
//
////        this.add(panel1,BorderLayout.NORTH);
//        this.add(panel2,BorderLayout.WEST);
////        this.add(panel3,BorderLayout.EAST);
////        this.add(panel4,BorderLayout.SOUTH);
//        this.add(panel5,BorderLayout.CENTER);
//
//
//
//        //------------- sub panels --------------------
//
////        JPanel panel6 = new JPanel();
//        JPanel panel7 = new JPanel();
////        JPanel panel8 = new JPanel();
////        JPanel panel9 = new JPanel();
////        JPanel panel10 = new JPanel();
////
////        panel6.setBackground(Color.black);
//        panel7.setBackground(Color.darkGray);
////        panel8.setBackground(Color.gray);
////        panel9.setBackground(Color.lightGray);
////        panel10.setBackground(Color.white);
////
////        panel5.setLayout(new BorderLayout());
////
////        panel6.setPreferredSize(new Dimension(50,50));
//        panel7.setPreferredSize(new Dimension(50,150));
////        panel8.setPreferredSize(new Dimension(50,50));
////        panel9.setPreferredSize(new Dimension(50,50));
////        panel10.setPreferredSize(new Dimension(50,50));
////
////        panel5.add(panel6,BorderLayout.NORTH);
//        panel5.add(panel7,BorderLayout.SOUTH);
////        panel5.add(panel8,BorderLayout.WEST);
////        panel5.add(panel9,BorderLayout.EAST);
////        panel5.add(panel10,BorderLayout.CENTER);
////
//
//
//        //panel7.add(spaceShip,BorderLayout.SOUTH);

    }

}
