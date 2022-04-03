package version2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameFrame extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JLabel spaceShipLabel;

    JLabel alienLabel;

    final int FRAME_HEIGHT =750;
    final int FRAME_WIDTH=1500;



    //Spaceship moves (to activate key listener)
    KeyListener keyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };


    //Spaceship moves with arrows
//    Action upAction= new UpAction();
//    Action downAction = new DownAction();
    Action leftAction = new LeftAction();
    Action rightAction = new RightAction();
    /////////////////////////////////////////////////////////////////////



    //Alien moves
    Random random= new Random();

    Image alien1Image;
    Image alien2Image;
    //Image backgroundImage;
    Timer timer;
    int xVelocity = random.nextInt(3)+1;
    int yVelocity = random.nextInt(3)+1;
    int x = 255;
    int y = 255;
    /////////////////////////////////////////////////////////////////////



    public GameFrame(){


        //Main panels setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));

        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(FRAME_WIDTH/10,FRAME_HEIGHT));

        panel2.setBackground(Color.black);


        panel3.setBackground(Color.cyan);
        panel3.setPreferredSize(new Dimension(FRAME_WIDTH*885/1000, FRAME_HEIGHT*695/1000));

        panel4.setBackground(Color.green);
        panel4.setPreferredSize(new Dimension(FRAME_WIDTH*885/1000, FRAME_HEIGHT*230/1000));


        panel2.add(panel3, BorderLayout.CENTER);
        panel2.add(panel4, BorderLayout.SOUTH);


        this.add(panel, BorderLayout.WEST);
        this.add(panel2, BorderLayout.CENTER);
        /////////////////////////////////////////////////////////////////////




        //Spaceship
        ImageIcon image = new ImageIcon("maviuzaygemisi.png");
        image.setImage(image.getImage().getScaledInstance(150, 150, 150));

        spaceShipLabel = new JLabel();
        spaceShipLabel.setIcon(image);
        spaceShipLabel.setBounds(10, 10, 250, 250);
        
        spaceShipLabel.addKeyListener(keyListener);

//        spaceShipLabel.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
//        spaceShipLabel.getActionMap().put("upAction", upAction);
//        spaceShipLabel.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
 //       spaceShipLabel.getActionMap().put("downAction", downAction);
        spaceShipLabel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        spaceShipLabel.getActionMap().put("leftAction", leftAction);
        spaceShipLabel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        spaceShipLabel.getActionMap().put("rightAction", rightAction);


        panel4.add(spaceShipLabel);
        /////////////////////////////////////////////////////////////////////



        //Add alien from class



        /////////////////////////////////////////////////////////////////////




        //Add alien

//        for (int i = 0; i < 10; i++) {
//
//        }

        alien1Image = new ImageIcon("alien1.png").getImage().getScaledInstance(50, 50,50);
//        ImageIcon image2 = new ImageIcon("alien1.png");
//        image2.setImage(image2.getImage().getScaledInstance(50, 50, 50));


//        alien2Image = new ImageIcon("alien1.png").getImage().getScaledInstance(50, 50,50);
//        ImageIcon image3 = new ImageIcon("alien1.png");
//        image2.setImage(image3.getImage().getScaledInstance(50, 50, 50));


        timer = new Timer(10, this);
        timer.start();


//        alienLabel = new JLabel();
//        alienLabel.setIcon(image2);
//        alienLabel.setBounds(10, 10, 250, 250);
//
//        panel3.add(alienLabel);
        /////////////////////////////////////////////////////////////////////


        //Main Frame Setup
        ImageIcon imageIcon = new ImageIcon("maviuzaygemisi.png");

        this.setTitle("SpaceShip.V.1.2");
        this.setIconImage(imageIcon.getImage());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        /////////////////////////////////////////////////////////////////////


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=(FRAME_WIDTH*885/1000)+(FRAME_WIDTH/10)-alien1Image.getWidth(null)) {
            xVelocity = (random.nextInt(3)+1) * -1;
        }else if(x<(FRAME_WIDTH/10)) {
            xVelocity = (random.nextInt(3)+1);
        }
        x = x + xVelocity;

        if(y>=(FRAME_HEIGHT*675/1000)-alien1Image.getHeight(null)) {
            yVelocity = (random.nextInt(3)+1) * -1;
        }else if(y<25) {
            yVelocity = (random.nextInt(3)+1) ;
        }
        y = y + yVelocity;
        repaint();



        /*

        //lambda version

             ActionListener actionPerformed = e-> {

            if(x>=(FRAME_WIDTH*885/1000)+(FRAME_WIDTH/10)-alien1Image.getWidth(null)) {
                xVelocity = (random.nextInt(3)+1) * -1;
            }else if(x<(FRAME_WIDTH/10)) {
                xVelocity = (random.nextInt(3)+1);
            }
            x = x + xVelocity;

            if(y>=(FRAME_HEIGHT*675/1000)-alien1Image.getHeight(null)) {
                yVelocity = (random.nextInt(3)+1) * -1;
            }else if(y<25) {
                yVelocity = (random.nextInt(3)+1) ;
            }
            y = y + yVelocity;
            repaint();
        };

         */



    }


    //Spaceship Moves
//    public class UpAction extends AbstractAction{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//   //             spaceShipLabel.setLocation(spaceShipLabel.getX(), spaceShipLabel.getY()-10);
//        }
//    }
//    public class DownAction extends AbstractAction{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//  //          spaceShipLabel.setLocation(spaceShipLabel.getX(), spaceShipLabel.getY()+10);
//        }
//    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            spaceShipLabel.setLocation(spaceShipLabel.getX()-10, spaceShipLabel.getY());
            if(spaceShipLabel.getX()<0){
                spaceShipLabel.setLocation(spaceShipLabel.getX()+10, spaceShipLabel.getY());
            }
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            spaceShipLabel.setLocation(spaceShipLabel.getX()+10, spaceShipLabel.getY());
            if(spaceShipLabel.getX()>=(FRAME_WIDTH*885/1000)-spaceShipLabel.getWidth()){
                spaceShipLabel.setLocation(spaceShipLabel.getX()-10, spaceShipLabel.getY());
            }
        }
    }
    /////////////////////////////////////////////////////////////////////



    //Alien moves
    public void paint(Graphics g) {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        //g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(alien1Image, x, y, null);
        g2D.drawImage(alien2Image, x+35, y+35, null);

    }



//    public ActionListener.actionPerformed()

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(x>=(FRAME_WIDTH*885/1000)+(FRAME_WIDTH/10)-alien1Image.getWidth(null)) {
//            xVelocity = (random.nextInt(3)+1) * -1;
//        }else if(x<(FRAME_WIDTH/10)) {
//            xVelocity = (random.nextInt(3)+1) ;
//        }
//        x = x + xVelocity;
//
//        if(y>=(FRAME_HEIGHT*675/1000)-alien1Image.getHeight(null)) {
//            yVelocity = (random.nextInt(3)+1) * -1;
//        }else if(y<25) {
//            yVelocity = (random.nextInt(3)+1) ;
//        }
//        y = y + yVelocity;
//        repaint();
//    }


    /////////////////////////////////////////////////////////////////////

}
