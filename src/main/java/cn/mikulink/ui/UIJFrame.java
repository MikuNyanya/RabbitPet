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

    //窗体默认长度
    private static int FRAME_WIDTH = 80;
    //窗体默认高度
    private static int FRAME_HEIGHT = 200;

    private static UIJFrame frame;

    public static UIJFrame getJframe() {
        return frame;
    }

    //封装基本参数的构造
    public UIJFrame(UIJPanel panel) {
        //取当前屏幕大小，初始显示在屏幕右下角
        int system_screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int system_screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;

        int init_x = system_screen_width - FRAME_WIDTH;
        int init_y = system_screen_height - FRAME_HEIGHT;

        //设置窗体大小，位置
        this.setBounds(init_x, init_y, FRAME_WIDTH, FRAME_HEIGHT);

        //设置窗体永远在前
        this.setAlwaysOnTop(true);

        //设置窗体类型，这个可以让窗口不出现在任务栏中
        this.setType(JFrame.Type.UTILITY);

        //设置默认Panel
        this.setContentPane(panel);

        //清除窗口边框和标题栏
        this.setUndecorated(true);
        //窗口背景透明 alpha分量为零
        this.setBackground(new Color(0, 0, 0, 0));

        //加载鼠标事件监听
        this.addMouseListener(new MouseControl());
        this.addMouseMotionListener(new MouseMotionControl());

        //显示窗口
        this.setVisible(true);

        //存储窗口对象，方便其他地方使用
        frame = this;
    }
}
