package cn.mikulink.ui;

import cn.mikulink.controls.MouseControl;
import cn.mikulink.controls.MouseMotionControl;

import javax.swing.*;
import java.awt.*;

/**
 * @author MikuLink
 * @date 2020/10/19 1:16
 * for the Reisen
 * 封装窗口参数
 */
public class UIJFrame extends JFrame {

    private static UIJFrame frame;

    public static UIJFrame getJframe() {
        return frame;
    }

    //封装基本参数的构造
    public UIJFrame(UIJPanel panel) {

        //设置窗体大小
        this.setBounds(1000, 300, 80, 200);
        //取当前屏幕大小，初始显示在屏幕右下角


        //设置窗体永远在前
        this.setAlwaysOnTop(true);

//		this.setType(JFrame.Type.UTILITY);

        //设置默认Panel
        this.setContentPane(panel);

        //设置窗体透明
        this.setUndecorated(true);
        //alpha分量为零
        this.setBackground(new Color(0, 0, 0, 0));

        //加载鼠标事件监听
        this.addMouseListener(new MouseControl());
        this.addMouseMotionListener(new MouseMotionControl());

        //显示窗口
        this.setVisible(true);

        frame = this;
    }
}
