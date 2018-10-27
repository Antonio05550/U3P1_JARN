package mx.edu.ittepic.u3practica1_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Circulo c1,c2,c3,c4,c5;
    public Lienzo(Context context){
        super(context);
        c1= new Circulo(300,500,100,Color.GREEN,this);
        c1.mover(10);
        c2= new Circulo(200,400,80,Color.RED,this);
        c2.mover(9);
        c3= new Circulo(100,300,70,Color.WHITE,this);
        c3.mover(8);
        c4= new Circulo(100,250,60,Color.YELLOW,this);
        c4.mover(7);
        c5= new Circulo(100,200,50,Color.MAGENTA,this);
        c5.mover(6);
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p= new Paint();
        c.drawColor(Color.BLUE);
        c1.pintar(c,p);
        c2.pintar(c,p);
        c3.pintar(c,p);
        c4.pintar(c,p);
        c5.pintar(c,p);
    }
}
