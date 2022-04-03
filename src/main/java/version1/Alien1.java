package version1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Alien1 extends JLabel implements ActionListener{
// implements ActionListener, version1.FireAction, KeyListener

    Random random= new Random();

    final int PANEL_WIDTH = 1500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    //Image backgroundImage;
    Timer timer;
    int xVelocity = random.nextInt(3)+1;
    int yVelocity = random.nextInt(3)+1;
    int x = 0;
    int y = 0;

    Alien1(){

//        enemy = new ImageIcon("enemy.png").getImage();
        enemy = new ImageIcon("alien1.png").getImage();
        enemy = enemy.getScaledInstance(50,50,50);
        //backgroundImage = new ImageIcon("space.png").getImage();
//        timer = new Timer(10, this);
//        timer.start();
//        this.addKeyListener(this);

        this.setVisible(true);
    }

    public void paint(Graphics g) {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        //g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=PANEL_WIDTH-enemy.getWidth(null)) {
            xVelocity = (random.nextInt(3)+1) * -1;
        }else if(x<0) {
            xVelocity = (random.nextInt(3)+1) * 1;
        }
        x = x + xVelocity;

        if(y>=PANEL_HEIGHT-enemy.getHeight(null)) {
            yVelocity = (random.nextInt(3)+1) * -1;
        }else if(y<0) {
            yVelocity = (random.nextInt(3)+1) * 1;
        }
        y = y + yVelocity;
        repaint();
    }
//
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        switch(e.getKeyChar()) {
//            case 'a':
//                fireAction();
//                break;
//            case 's':
//                //               label.setLocation(PANEL_WIDTH/2, PANEL_HEIGHT/2);
//                break;
//        }
//    }
//
//
//    @Override
//    public void fireAction(){
//
//        JLabel fireLabel = new JLabel();
//        fireLabel.setIcon( new ImageIcon("alien3.png") );
//        fireLabel.setLocation(25, 25);
//
//        fireLabel.setVisible(true);
//        this.add(fireLabel);
//
//
//
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
//
//

}
