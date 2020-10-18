package cn.mikulink.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @author MikuLink
 * @date 2020/10/19 1:16
 * for the Reisen
 */
public class UIJPanel extends JPanel {
    public UIJPanel() {
        this.setOpaque(false);//设置panel透明
    }

    @Override
    public void paintComponent(Graphics g) {
        Image img = null;
        try {
            img = ImageIO.read(new File("image/rabbit.png"));
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        if (null == img) return;

        //绘制图片
        g.drawImage(img, 0, 0, null);
    }

}
