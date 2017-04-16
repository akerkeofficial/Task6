package com.example.macbookpro.task6;

import android.graphics.Rect;

import java.util.Random;

/**
 * Created by Zhakenov on 4/8/2017.
 */

public class Square {

    int x;
    int y;

    int width;
    int height;
    int speed;
    int speed1 = 5;
    float z;

    int xSign = 1;
    int ySign = 1;

    int min = 10;
    int max = 15;


    public Square(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        Random r = new Random();

        speed = r.nextInt(max - min + 1) + min;
    }

    public Rect getRect(){
        return new Rect(x, y, x+width, y+height);
    }

    public void move( int screenHeight){

        y+=ySign*speed;



        if(y<=0){
            y=0;
//            ySign = 1;
            this.reverse();
        }
// else if(y>=screenHeight-height){
//            y = screenHeight - height;
//            ySign= -1;
//            this.reverse();
//        }
    }

    public void reverse(){
//        if(x<0) {
//            x+=xSign*speed1;
//        }
//        else if (x>0) {
//            x-=xSign*speed1;
//        }
        ySign = ySign * -1;
        speed+=5;
    }

}

