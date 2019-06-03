package e.evera.mapa_guia_tec;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Lienzo extends View {
    Edificio AD,BP,B,CB,CL,D,EE,F,GP,G,H,J,L,LC,LICBI,M,MAPA,N,PP,P,Q,S,TA,UD,UVP,X,puntero;
    int gx=0,gy=0;
    AlertDialog.Builder alerta;

    public Lienzo(Context context) {
        super(context);
        alerta= new AlertDialog.Builder(context);
        alerta.setTitle("Info");
        alerta.setPositiveButton("ok",null);
        MAPA = new Edificio(this,R.drawable.mapa,0,0,1200,1750,"mapa");
        AD = new Edificio(this,R.drawable.edificio_ad,648,850,120,80,"Edificio Administrativo");
        BP = new Edificio(this,R.drawable.edificio_bb,175,375,245,80,"Laboratorio de Idustrial");
         B = new Edificio(this,R.drawable.edificio_b,440,420,130,60,"Bodegas de Industrial");
        CB = new Edificio(this,R.drawable.edificio_cb,177,1290,370,150,"Edificio CB: Destinado a Clases de Ciencias Basicas");
        CL = new Edificio(this,R.drawable.edificio_cl,810,750,160,130,"Edificio CL: Biblioteca ");
         D = new Edificio(this,R.drawable.edificio_d,395,820,160,50,"Edificio D: Oficina de Clauia y Dona Paz Verde");
        EE = new Edificio(this,R.drawable.edificio_ee,610,470,67,50,"Edificio E: Extra Escolares");
         F = new Edificio(this,R.drawable.edificio_f,220,820,95,95,"Edificio F: Laboratorios Electrica y Civil");
        GP = new Edificio(this,R.drawable.edificio_gg,860,490,120,50,"Edificio G': Salones");
         G = new Edificio(this,R.drawable.edificio_g,730,490,120,50,"Edificio G: Salones");
         H = new Edificio(this,R.drawable.edificio_h,360,625,150,45,"Edificio H: Salones y Laboratorios de Arquitectura");
         J = new Edificio(this,R.drawable.edificio_j,360,725,130,35,"Edificio J: Centro de Copiado y salones de Electrica y Mecatronica");
         L = new Edificio(this,R.drawable.edificio_l,550,690,130,55,"Edificio L: Laboratorios de Industrial y salones");
        LC = new Edificio(this,R.drawable.edificio_lc,177,1210,120,120,"Edificio LC: Laboratorio de Computo huele feo");
        LICBI = new Edificio(this,R.drawable.edificio_licbi,0,550,75,450,"Edificio LICBI:  Laboratorios para Bioquimica, Electrica, y sala de Administracion.");
        M = new Edificio(this,R.drawable.edificio_m,605,600,140,50,"Edificio M: Laboratorios de Quminica");
        N = new Edificio(this,R.drawable.edificio_n,900,680,150,50,"Edificio N: Departamento de IG y Administracion y Salones");
        PP = new Edificio(this,R.drawable.edificio_pp,365,530,65,30,"Edificio P': Bodega");
         P = new Edificio(this,R.drawable.edificio_p,440,520,160,50,"Edificio P: Sala AudiVisula y Bodega");
         Q = new Edificio(this,R.drawable.edificio_q,720,400,120,60,"Edificio Q: Laboratorios de Quimica");
         S = new Edificio(this,R.drawable.edificio_s,400,890,100,50,"Edificio S: Derapamento de becas y bodega y oficinas");
        TA = new Edificio(this,R.drawable.edificio_ta,1010,760,120,150,"Edificio TA: Departamento de Arquitectura y salones");
        UD = new Edificio(this,R.drawable.edificio_ud,645,1170,190,100,"Edificio UD: Departamento de Sistemas, Departamento de Industrial y Destinado a Clases");
        UVP = new Edificio(this,R.drawable.edificio_uvp,0,1340,75,150,"Edificio UVP: Oficionas de Servicio social, Residencia e Ingles");
        X = new Edificio(this,R.drawable.edificio_x,780,670,90,50,"Edificio X: Edificio destinado para clases");
    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        c.drawText("Edificio",0,0,p);
        MAPA.dibujar(c,p);
        AD.dibujar(c,p);
        BP.dibujar(c,p);
        B.dibujar(c,p);
        CB.dibujar(c,p);
        CL.dibujar(c,p);
        D.dibujar(c,p);
        EE.dibujar(c,p);
        F.dibujar(c,p);
        GP.dibujar(c,p);
        G.dibujar(c,p);
        H.dibujar(c,p);
        J.dibujar(c,p);
        L.dibujar(c,p);
        LC.dibujar(c,p);
        LICBI.dibujar(c,p);
        M.dibujar(c,p);
        N.dibujar(c,p);
        PP.dibujar(c,p);
        P.dibujar(c,p);
        Q.dibujar(c,p);
        S.dibujar(c,p);
        TA.dibujar(c,p);
        UD.dibujar(c,p);
        UVP.dibujar(c,p);
       X.dibujar(c,p);
    }


    public void info(int x,int y){
        if(AD.estaEnArea(x,y)){
            alerta.setMessage(AD.desc).show();
        }else if(BP.estaEnArea(x,y)){
            alerta.setMessage(BP.desc).show();
        }else if(B.estaEnArea(x,y)){
            alerta.setMessage(B.desc).show();
        }else if(CB.estaEnArea(x,y)){
            alerta.setMessage(CB.desc).show();
        }else if(CL.estaEnArea(x,y)){
            alerta.setMessage(CL.desc).show();
        }else if(D.estaEnArea(x,y)){
            alerta.setMessage(D.desc).show();
        }else if(EE.estaEnArea(x,y)){
            alerta.setMessage(EE.desc).show();
        }else if(F.estaEnArea(x,y)){
            alerta.setMessage(F.desc).show();
        }else if(GP.estaEnArea(x,y)){
            alerta.setMessage(GP.desc).show();
        }else if(G.estaEnArea(x,y)){
            alerta.setMessage(G.desc).show();
        }else if(H.estaEnArea(x,y)){
            alerta.setMessage(H.desc).show();
        }else if(J.estaEnArea(x,y)){
            alerta.setMessage(J.desc).show();
        }else if(L.estaEnArea(x,y)){
            alerta.setMessage(L.desc).show();
        }else if(LC.estaEnArea(x,y)){
            alerta.setMessage(LC.desc).show();
        }else if(LICBI.estaEnArea(x,y)){
            alerta.setMessage(LICBI.desc).show();
        }else if(M.estaEnArea(x,y)){
            alerta.setMessage(M.desc).show();
        }else if(N.estaEnArea(x,y)){
            alerta.setMessage(N.desc).show();
        }else if(PP.estaEnArea(x,y)){
            alerta.setMessage(PP.desc).show();
        }else if(P.estaEnArea(x,y)){
            alerta.setMessage(P.desc).show();
        }else if(Q.estaEnArea(x,y)){
            alerta.setMessage(Q.desc).show();
        }else if(S.estaEnArea(x,y)){
            alerta.setMessage(S.desc).show();
        }else if(TA.estaEnArea(x,y)){
            alerta.setMessage(TA.desc).show();
        }else if(UD.estaEnArea(x,y)){
            alerta.setMessage(UD.desc).show();
        }else if(UVP.estaEnArea(x,y)){
            alerta.setMessage(UVP.desc).show();
        }
    }

    public boolean onTouchEvent (MotionEvent me){
        int accion = me.getAction();
        int posx = (int) me.getX();
        int posy = (int) me.getY();
        switch (accion){
            case MotionEvent.ACTION_DOWN:
                info(posx,posy);
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        invalidate();
        return true;
    }


}

