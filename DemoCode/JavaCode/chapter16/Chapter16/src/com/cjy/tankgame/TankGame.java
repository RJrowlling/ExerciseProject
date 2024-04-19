package com.cjy.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author cjy
 * @version 1.0
 */
public class TankGame extends JFrame {

    MyPanel mp = null;//定义 MyPanel

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }

    public TankGame() {
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000,750);
        this.addKeyListener(mp);//让 JFrame 监听 mp 的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
