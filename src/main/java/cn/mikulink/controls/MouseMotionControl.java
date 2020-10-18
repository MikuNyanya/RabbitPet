package cn.mikulink.controls;

import cn.mikulink.ui.UIJFrame;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @author MikuLink
 * @date 2020/10/19 1:51
 * for the Reisen
 * 鼠标运动事件控制
 */
public class MouseMotionControl implements MouseMotionListener {

    //鼠标按住并拖动事件
    public void mouseDragged(MouseEvent e) {
        //鼠标左键拖动主体
//        if(1 != e.getButton()){
//            return;
//        }

        //获取当前窗口坐标
//        UIJFrame.getJframe().getLocationOnScreen();

        //获取当前鼠标相对屏幕位置
        Point mouse_point = MouseInfo.getPointerInfo().getLocation();

        //把窗口保持和鼠标相对位置拉到鼠标当前位置
        int new_point_x = mouse_point.x - MouseControl.MOUSE_PRESSED_POINT_X;
        int new_point_y = mouse_point.y - MouseControl.MOUSE_PRESSED_POINT_Y;

        //如果最终窗体位置超出屏幕分辨率，则强行拉回屏幕内
        Point finalNewPoint = frameOverPoint(new Point(new_point_x, new_point_y));

        //更新窗体位置
        UIJFrame.getJframe().setLocation(finalNewPoint.x, finalNewPoint.y);
    }

    //鼠标移动事件
    public void mouseMoved(MouseEvent e) {

    }


    /**
     * 如果拖拽后，窗口超出屏幕，则拉回屏幕中
     *
     * @param newPoint 窗口新坐标
     * @return 修正后的窗口新坐标，保证窗口完整的显示在屏幕中
     */
    private Point frameOverPoint(Point newPoint) {
        int point_x = newPoint.x;
        int point_y = newPoint.y;

        //获取当前窗口大小
        Dimension dimension = UIJFrame.getJframe().getSize();

        //窗口左边x坐标为负值，则修正新坐标为0
        if (point_x < 0) {
            point_x = 0;
        }

        //窗口上边y坐标为负值，则修正新坐标为0
        if (point_y < 0) {
            point_y = 0;
        }

        //窗口右边x坐标超出当前屏幕长度，则修正新坐标为(屏幕长度-窗口长度)
        if ((point_x + dimension.width) > MouseControl.SYSTEM_SCREEN_WIDTH) {
            point_x = MouseControl.SYSTEM_SCREEN_WIDTH - dimension.width;
        }

        //窗口下边y坐标超出当前屏幕高度，则修正新坐标为(屏幕高度-窗口高度)
        if ((point_y + dimension.height) > MouseControl.SYSTEM_SCREEN_HEIGHT) {
            point_y = MouseControl.SYSTEM_SCREEN_HEIGHT - dimension.height;
        }

        return new Point(point_x, point_y);
    }
}
