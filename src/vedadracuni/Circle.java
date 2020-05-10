/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vedadracuni;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author wedad
 */
public class Circle {

    private static final Stroke S = new BasicStroke(0f);

    public Circle() {
    }

    

    public static Image getRoundeImage(Image image, int radius) {

        int width = image.getWidth(null);
        int height = image.getHeight(null);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        RoundRectangle2D rectangle2D = new RoundRectangle2D.Double(0, 0, width, height, radius, radius);

        Graphics2D graphics2D = (Graphics2D) bi.getGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.clip(rectangle2D);
        graphics2D.drawImage(image, 0, 0,null);
        graphics2D.setStroke(S);
        graphics2D.setColor(new Color(255,255,255));
        graphics2D.draw(rectangle2D);
        
        return image;
    }
    

}
