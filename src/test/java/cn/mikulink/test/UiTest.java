package cn.mikulink.test;

import org.junit.Test;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author MikuLink
 * @date 2020/10/19 1:29
 * for the Reisen
 */
public class UiTest {
    @Test
    public void test() {
        JFrame frame = new JFrame("测试窗口");
//        //设置窗体大小
//        frame.setBounds(1000, 300, 500, 500);


        //设置窗体透明
        frame.setUndecorated(false);
        //alpha分量为零
//        frame.setBackground(new Color(0, 0, 0, 0));
        //设置窗体永远在前
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);


        JPanel panel = new JPanel();
//        panel.setSize(100,100);

//        JButton button_exit = new JButton("Exit 退出");
//
//
//        panel.add(button_exit);
//
//        frame.add(panel);


        BufferedReader intemp = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("任意键继续");
        try {
            String s = intemp.readLine();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        System.exit(0);
    }

    @Test
    public void test_2() {


        System.out.println("");
    }
}
