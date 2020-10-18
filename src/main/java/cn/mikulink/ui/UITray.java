package cn.mikulink.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author MikuLink
 * @date 2020/10/19 2:20
 * for the Reisen
 * 系统托盘相关
 */
public class UITray {

    /**
     * 为程序创建一个后台图标
     */
    public void createTray() throws AWTException {
        //检查当前系统是否支持系统托盘
        boolean isSupported = SystemTray.isSupported();

        if (!isSupported) {
            return;
        }


        //创建右键菜单
        PopupMenu popMenu = new PopupMenu();

        //退出程序选项
        MenuItem itemExit = new MenuItem("Exit");
        itemExit.addActionListener(e -> System.exit(0));

        popMenu.add(itemExit);

        //设置托盘图标
        ImageIcon icon = new ImageIcon("image/ico.png");
        Image image = icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT);
        //创建系统托盘对象
        TrayIcon trayIcon = new TrayIcon(image, "pet", popMenu);
        //图片自适应尺寸
        trayIcon.setImageAutoSize(true);

        //获取当前系统托盘
        SystemTray systemTray = SystemTray.getSystemTray();
        systemTray.add(trayIcon);
    }
}
