package edu.virginia.cs2110.scribsDean;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/**
 * Sample ScribbleView Class that creates 5 randomly drawn lines.
 * @author Dean
 *
 */
public class ScribbleView extends View {
	private Paint p;

	public ScribbleView(Context context) {
		super(context);
		init();
	}

	public ScribbleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ScribbleView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	private void init() {
		p = new Paint();
		p.setARGB(255, 255, 128, 0);
		p.setStyle(Paint.Style.STROKE);
		p.setStrokeWidth(5);
	}

	@Override
	public void onDraw(Canvas c) {
		super.onDraw(c);
		for (int i = 0; i < 5; i++) {
			c.drawLine((float) (this.getWidth() * Math.random()),
					(float) (this.getHeight() * Math.random()),
					(float) (this.getWidth() * Math.random()),
					(float) (this.getHeight() * Math.random()), p);
		}
	}
}
