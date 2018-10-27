package mx.edu.ittepic.u3practica1_joseantoniorivasnavarrete;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {
    float x, y;
    int desx, desy;
    CountDownTimer timer;
    int color;
    int radio;

    public Circulo(int posx,int posy,int r,int c,final Lienzo l){
        x = posx;
        y = posy;
        radio = r;
        color = c;

        timer = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                x+=desx;
                if (x >= l.getWidth() -radio)
                    desx *= -1;
                if (x <=radio)
                    desx *= -1;
                y += desy;
                if (y >= l.getHeight()-radio)
                    desy *= -1;
                if (y <=radio)
                    desy*= -1;
                l.invalidate();
            }
            @Override
            public void onFinish() {
                start();
            }
        };
    }
    public void pintar(Canvas c, Paint p){
        p.setColor(color);
        c.drawCircle(x,y,radio,p);
    }
    public void mover(int des){
        desy=des;
        desx=des;
        timer.start();
    }

}

