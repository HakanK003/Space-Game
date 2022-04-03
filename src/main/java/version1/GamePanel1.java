package version1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GamePanel1 extends JPanel implements KeyListener {


    final int PANEL_WIDTH = 1500;
    final int PANEL_HEIGHT = 250;
    ImageIcon spaceShip = new ImageIcon("maviuzaygemisi.png");
    Image alien;
    //Image backgroundImage;
    //Timer timer;
    int xVelocity = 2;
    int yVelocity = 2;
    int x = 0;
    int y = 0;



    JLabel label;


    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

//    Action fireAction;


    GamePanel1(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);

//        this.setBounds( new Bounds );
//        enemy = new ImageIcon("enemy.png").getImage();
        //spaceShip.getImage().getScaledInstance(100, 100, 100);
//        spaceShip = spaceShip.getScaledInstance(150,150,150);

//        alien = new ImageIcon("alien1.png").getImage();
//        alien = alien.getScaledInstance(50,50,50);
//        //backgroundImage = new ImageIcon("space.png").getImage();
//        timer = new Timer(10, this);
//        timer.start();


        label = new JLabel();
        label.setBackground(Color.black);

        spaceShip.setImage(spaceShip.getImage().getScaledInstance(150, 150, 150));
        label.setIcon(spaceShip);

        label.setBounds(PANEL_WIDTH/2, PANEL_HEIGHT/2, spaceShip.getIconWidth(), spaceShip.getIconHeight());



        label.setOpaque(true);


        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();


        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        label.addKeyListener(this);

        label.setVisible(true);



        this.add(label);

    }

//    public void paint(Graphics g) {
//
//        super.paint(g); // paint background
//
//        Graphics2D g2D = (Graphics2D) g;
//
//        //g2D.drawImage(backgroundImage, 0, 0, null);
//        g2D.drawImage(spaceShip, x, y, null);
// //       g2D.drawImage(alien, x, y, null);
//    }

   @Override
   public void keyTyped(KeyEvent e) {
//        switch(e.getKeyChar()) {
//            case 'a':
//                label.setLocation(PANEL_WIDTH/2, PANEL_HEIGHT/2);
//                break;
//            case 's':
//                label.setLocation(PANEL_WIDTH/2, PANEL_HEIGHT/2);
//                break;
//            }
        }

    @Override
    public void keyPressed(KeyEvent e) {
//        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
//        switch(e.getKeyCode()) {
//            case 37: label.setLocation(label.getX()-10, label.getY());
//                break;
//            case 38: label.setLocation(label.getX(), label.getY()-10);
//                break;
//            case 39: label.setLocation(label.getX()+10, label.getY());
//                break;
//            case 40: label.setLocation(label.getX(), label.getY()+10);
//                break;
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (x<0)
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }





//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(x>=PANEL_WIDTH-spaceShip.getWidth(null) || x<0) {
//            xVelocity = xVelocity * -1;
//        }
//        x = x + xVelocity;
//
//        if(y>=PANEL_HEIGHT-spaceShip.getHeight(null) || y<0) {
//            yVelocity = yVelocity * -1;
//        }
//        y = y + yVelocity;
//        repaint();
//
//
//    }



//    final int PANEL_WIDTH = 1500;
//    final int PANEL_HEIGHT = 750;
//
//    Image spaceShip;
//    Image alien;
//
//    Timer timer;
//
//
//    int xVelocity = 2;
//    int yVelocity = 2;
//    int x = 0;
//    int y = 0;
//
//    public version1.GamePanel(){
//
//        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
//        this.setBackground(Color.black);
//
//        spaceShip = new ImageIcon("maviuzaygemisi.png").getImage();
//        spaceShip = spaceShip.getScaledInstance(100, 100, 100);
//
//
//
//        alien = new ImageIcon("alien1.png").getImage();
//        alien = alien.getScaledInstance(50, 50, 50);
//
//
//        timer = new Timer(10, this);
//        timer.start();
//
//
//    }
//
//
//    public void paint(Graphics graphics){
//
//        super.paint(graphics);
//
//        Graphics2D graphics2D = (Graphics2D) graphics;
//
//        graphics2D.drawImage(spaceShip, 100,100, null);
//        graphics2D.drawImage(alien, 15,15, null);
//        //g2D.drawImage(backgroundImage, 0, 0, null);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(x>=PANEL_WIDTH-spaceShip.getWidth(null) || x<0) {
//            xVelocity = xVelocity * -1;
//        }
//        x = x + xVelocity;
//
//        if(y>=PANEL_HEIGHT-spaceShip.getHeight(null) || y<0) {
//            yVelocity = yVelocity * -1;
//        }
//        y = y + yVelocity;
//        repaint();
//
////
////        if(x>=PANEL_WIDTH-alien.getWidth(null) || x<0) {
////            xVelocity = (xVelocity+3) * -1;
////        }
////        x = x + xVelocity;
////
////        if(y>=PANEL_HEIGHT-alien.getHeight(null) || y<0) {
////            yVelocity = (yVelocity+3) * -1;
////        }
////        y = y + yVelocity;
////        repaint();
//
//    }

}
