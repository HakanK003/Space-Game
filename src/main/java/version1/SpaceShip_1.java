package version1;

import javax.swing.*;
import java.awt.*;

public class SpaceShip_1 {

    Image spaceShipImage;

    public SpaceShip_1(){


        spaceShipImage = new ImageIcon("maviuzaygemisi.png").getImage();
        spaceShipImage = spaceShipImage.getScaledInstance(100, 100, 100);




    }


    public void paint(Graphics graphics){

        //super.paint(graphics);

        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics2D.drawImage(spaceShipImage, 15,15, null);
        //graphics2D.drawImage(alien, 15,15, null);
        //g2D.drawImage(backgroundImage, 0, 0, null);

    }

}
