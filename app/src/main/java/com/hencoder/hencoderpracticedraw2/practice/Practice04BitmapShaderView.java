package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice04BitmapShaderView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private BitmapShader clampShader = new BitmapShader(BitmapFactory.decodeResource(getResources(), R.drawable.batman), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

    private BitmapShader mirrorShader = new BitmapShader(BitmapFactory.decodeResource(getResources(), R.drawable.batman), Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);

    private BitmapShader repeatShader = new BitmapShader(BitmapFactory.decodeResource(getResources(), R.drawable.batman), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);

    public Practice04BitmapShaderView(Context context) {
        super(context);
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // 用 Paint.setShader(shader) 设置一个 BitmapShader
        // Bitmap: R.drawable.batman
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        paint.setShader(clampShader);
//        canvas.drawCircle(200, 200, 300, paint);
//        paint.setShader(mirrorShader);
//        canvas.drawCircle(500, 200, 300, paint);
        paint.setShader(repeatShader);
        canvas.drawCircle(800, 200, 300, paint);
    }
}
