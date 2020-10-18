package cn.mikulink.controls;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author MikuLink
 * @date 2020/10/19 1:51
 * for the Reisen
 * 鼠标操作事件控制
 */
public class MouseControl implements MouseListener {
    //鼠标相对于窗口位置
    public static int MOUSE_PRESSED_POINT_X = 0;
    public static int MOUSE_PRESSED_POINT_Y = 0;

    //当前屏幕分辨率
    public static int SYSTEM_SCREEN_WIDTH = 0;
    public static int SYSTEM_SCREEN_HEIGHT = 0;


    //单击(常规单击鼠标，按下并放开)
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    //按下鼠标（按下没有放开时）
    @Override
    public void mousePressed(MouseEvent e) {
        //记录当前鼠标和窗口的相对位置
        Point mouse_frame_point = e.getPoint();
        MOUSE_PRESSED_POINT_X = mouse_frame_point.x;
        MOUSE_PRESSED_POINT_Y = mouse_frame_point.y;

        //刷新并记录当前屏幕分辨率
        SYSTEM_SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
        SYSTEM_SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    }

    //放开鼠标(按下鼠标后，放开鼠标时)
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    //鼠标移动到组件上的时候
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //鼠标里开组件上的时候
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
