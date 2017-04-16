package com.example.macbookpro.task6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import java.util.Random;

public class DrawView extends android.view.SurfaceView
        implements SurfaceHolder.Callback {

    boolean isRunning = false;
    SurfaceHolder surfaceHolder;
    Square square = null;
    Square square1 = null;
    Square square2= null;
    Square square3= null;
    Square square4= null;
    Square square5= null;
    Square square6= null;
    Square square7= null;
    Square square8= null;
    Square square9= null;
    Square square10= null;
    Square square11= null;
    Square square12= null;
    Square square13= null;


    int height = 0;

    Bitmap man;
    float manX;
    float manY =1400;

    int min = 100;
    int max = 200;
    int m1= 300;
    int m2 = 500;
    int m3 = 500;
    int m4 = 700;
    int m5 = 800;
    int m6 = 1000;
    int m7 = 1100;
    int m8 = 1300;
    int m9 = 1250;
    int m10 = 1500;
    int begin;
    int end;
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    Random r;
//    Square sq[] = new Square[10];
//    int i;

    public DrawView(Context context) {
        super(context);
        getHolder().addCallback(this);

        man = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
        r = new Random();
        begin = r.nextInt(max - min + 1) + min;
        end = r.nextInt(m8 - m7 + 1) + m7;
        a= r.nextInt(m2 - m1 + 1) + m1;
        b= r.nextInt(m4 - m3 + 1) + m3;
        c= r.nextInt(m6 - m5 + 1) + m5;
        d= r.nextInt(m10 - m9 + 1) + m9;
        e= r.nextInt(900 - min + 1) + 45;
        f= r.nextInt(500 - min + 1) + 78;
        g= r.nextInt(max - min + 1) + min;
        h= r.nextInt(max - min + 1) + min;
        i= r.nextInt(max - min + 1) + min;




    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        surfaceHolder = holder;
        isRunning = true;
       // setVisibility(a);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(isRunning){
                    Canvas canvas = surfaceHolder.lockCanvas();
                    if(canvas == null) continue;
                    long startTime = System.currentTimeMillis();
                    update();
                    draw(canvas);
                    testCollision();
                    long drawTime = System.currentTimeMillis() - startTime;
                    long fps = 1000/(drawTime==0?1:drawTime);
                    Log.d("fps", fps+"");
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }).start();

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {


    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        isRunning = false;
    }

    public void testCollision(){
        if((square.y + square.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square.width + square.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square.x){
            Log.d("test", "3rd case");
        }
        if(((square.y + square.height) >= manY) && (square.width + square.x) >= manX && (manX + 88 >= square.x)){
            Log.d("test", " Yes collapsed....");
            square.reverse();
        }
        if((square1.y + square1.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square1.width + square1.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square1.x){
            Log.d("test", "3rd case");
        }
        if(((square1.y + square1.height) >= manY) && (square1.width + square1.x) >= manX && (manX + 88 >= square1.x)){
            Log.d("test", " Yes collapsed....");
            square1.reverse();
        }
        if((square2.y + square2.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square2.width + square2.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square2.x){
            Log.d("test", "3rd case");
        }
        if(((square2.y + square2.height) >= manY) && (square2.width + square2.x) >= manX && (manX + 88 >= square2.x)){
            Log.d("test", " Yes collapsed....");
            square2.reverse();
        }
        if((square3.y + square3.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square3.width + square3.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square3.x){
            Log.d("test", "3rd case");
        }
        if(((square3.y + square3.height) >= manY) && (square3.width + square3.x) >= manX && (manX + 88 >= square3.x)){
            Log.d("test", " Yes collapsed....");
            square3.reverse();
        }
        if((square4.y + square4.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square4.width + square4.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square4.x){
            Log.d("test", "3rd case");
        }
        if(((square4.y + square4.height) >= manY) && (square4.width + square4.x) >= manX && (manX + 88 >= square4.x)){
            Log.d("test", " Yes collapsed....");
            square4.reverse();
        }
        if((square5.y + square5.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square5.width + square5.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square5.x){
            Log.d("test", "3rd case");
        }
        if(((square5.y + square5.height) >= manY) && (square5.width + square5.x) >= manX && (manX + 88 >= square5.x)){
            Log.d("test", " Yes collapsed....");
            square5.reverse();
        }
        if((square6.y + square6.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square6.width + square6.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square6.x){
            Log.d("test", "3rd case");
        }
        if(((square6.y + square6.height) >= manY) && (square6.width + square6.x) >= manX && (manX + 88 >= square6.x)){
            Log.d("test", " Yes collapsed....");
            square6.reverse();
        }
        if((square7.y + square7.height) >= manY){
            Log.d("test", " 1st case");
        }
        if((square7.width + square7.x) >= manX){
            Log.d("test", " 2nd case");
        }
        if(manX + 88 >= square7.x){
            Log.d("test", "3rd case");
        }
        if(((square7.y + square7.height) >= manY) && (square7.width + square7.x) >= manX && (manX + 88 >= square7.x)){
            Log.d("test", " Yes collapsed....");
            square7.reverse();
        }




    }

    public void update(){
        if(square!=null){
            square.move(height);

        }
        if(square1!=null){
            square1.move(height);
        }
        if(square2!=null){
            square2.move(height);
        }
        if(square3!=null){
            square3.move(height);
        }
        if(square4!=null){
            square4.move(height);
        }
        if(square5!=null){
            square5.move(height);
        }
        if(square6!=null){
            square6.move(height);
        }if(square7!=null){
            square7.move(height);
        }
        if(square8!=null){
            square8.move(height);
        }
        if(square9!=null){
            square9.move(height);
        }
        if(square10!=null){
            square10.move(height);
        }
        if(square11!=null){
            square11.move(height);
        }
        if(square12!=null){
            square12.move(height);
        }
        if(square13!=null){
            square13.move(height);
        }
//        if(sq[i]!=null){
//            sq[i].move(height);
//        }

    }

    public void draw(Canvas canvas) {

//        if (sq[i] == null) {for(i=0; i<10; i++){
//             sq[i] = new Square(0, 0, height/10, height/10);
//        }}


        if (height == 0) height = canvas.getHeight();
        if (square == null) square = new Square(begin, -100, height / 20, height / 20);


        if (height == 0) height = canvas.getHeight();
        if (square1 == null) square1 = new Square(end, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square2 == null) square2 = new Square(a, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square3 == null) square3 = new Square(b, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square4 == null) square4 = new Square(c, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square5 == null) square5 = new Square(d, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square6 == null) square6 = new Square(e, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square7 == null) square7 = new Square(f, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square8 == null) square8 = new Square(h, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square9 == null) square9 = new Square(i, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square10 == null) square10 = new Square(79, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square11 == null) square11 = new Square(1100, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square12 == null) square12 = new Square(945, -100, height / 20, height / 20);

        if (height == 0) height = canvas.getHeight();
        if (square13 == null) square13 = new Square(444, -100, height / 20, height / 20);


        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawColor(Color.WHITE, PorterDuff.Mode.CLEAR);
        canvas.drawARGB(55, 67, 83, 127);
        canvas.drawRect(square.getRect(), p);

       canvas.drawRect(square1.getRect(), p);
        p.setColor(Color.BLUE);

        canvas.drawRect(square2.getRect(), p);
        p.setColor(Color.GRAY);

        canvas.drawRect(square3.getRect(), p);
        p.setColor(Color.GREEN);
        canvas.drawRect(square4.getRect(), p);
        p.setColor(Color.TRANSPARENT);
        canvas.drawRect(square5.getRect(), p);
        p.setColor(Color.YELLOW);
        canvas.drawRect(square6.getRect(), p);
        p.setColor(Color.WHITE);
        canvas.drawRect(square7.getRect(), p);
        p.setColor(Color.MAGENTA);
//        canvas.drawRect(square8.getRect(), p);
//        canvas.drawRect(square9.getRect(), p);
//        canvas.drawRect(square10.getRect(), p);
//        canvas.drawRect(square11.getRect(), p);
//        canvas.drawRect(square12.getRect(), p);
//        canvas.drawRect(square13.getRect(), p);
        //canvas.drawRect(sq[i].getRect(), p);

        p.setColor(Color.CYAN);
        canvas.drawBitmap(man, manX, manY, p);
    }

    public boolean onTouchEvent(MotionEvent event)
    {

        switch(event.getAction())
        {
//            case MotionEvent.ACTION_DOWN: {
//                if()
//                square.reverse();
//                Log.d("td","down");
//
//            }
//            break;

            case MotionEvent.ACTION_MOVE:
            {
                manX=(int)event.getX();
                //manY=(int)event.getY();


                invalidate();

            }

            break;
//            case MotionEvent.ACTION_UP: {
//                square.reverse();
//            }


        }
        return true;
    }
}
