package cn.mikulink;

import cn.mikulink.ui.UIJFrame;
import cn.mikulink.ui.UIJPanel;
import cn.mikulink.ui.UITray;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author MikuLink
 * @date 2020/10/19 1:27
 * for the Reisen
 * 程序入口
 */
public class Main {

    public static void main(String[] args) {
        //初始化主体
        new UIJFrame(new UIJPanel());

        //创建系统托盘
        UITray tray = new UITray();
        try {
            tray.createTray();
        } catch (AWTException awtEx) {
            awtEx.printStackTrace();
        }


        BufferedReader intemp = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = intemp.readLine();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        System.exit(0);
    }
}
