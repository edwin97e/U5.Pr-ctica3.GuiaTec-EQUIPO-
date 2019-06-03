package e.evera.mapa_guia_tec;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Edificio{
    Bitmap imagen;
    int x,y;
    int num,w,h;
    String desc;

    public Edificio(Lienzo este,int img, int posx, int posy,int w,int h,String desc){
        this.imagen = BitmapFactory.decodeResource(este.getResources(),img);
        this.imagen = Bitmap.createScaledBitmap(this.imagen, w,h,false);
        this.desc = desc;
        x = posx;
        y = posy;
        this.num = num;
    }


    public void dibujar(Canvas c, Paint p) {
        c.drawBitmap(imagen, x, y, p);
    }

    public boolean estaEnArea(int Xdedo, int Ydedo){
        int x2 = x+imagen.getWidth();
        int y2= y+imagen.getHeight();

        if(Xdedo >= x && Xdedo <= x2){
            if(Ydedo >= y && Ydedo <= y2){
                return true;
            }
        }
        return false;
    }

    public boolean estaEnColision(Edificio objetoB){
        int x2 = x+imagen.getWidth();
        int y2= y+imagen.getHeight();
        if(objetoB.estaEnArea(x,y)){
            return true;
        }if(objetoB.estaEnArea(x2,y)){
            return true;
        }if(objetoB.estaEnArea(x,y2)){
            return true;
        }if(objetoB.estaEnArea(x2,y2)){
            return true;
        }
        return false;
    }

}