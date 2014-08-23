package com.dtre.iyh;

import java.io.InputStream;

import com.example.test.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	Bitmap tmpBitmap;
	ImageView imageView2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		imageView2=(ImageView)this.findViewById(R.id.imageView2);
		Bitmap mBitmap=readBitMap(this,R.drawable.blue);
		imageView2.setImageBitmap(mBitmap);
//		imageView2.setImageBitmap(new FeatherFilter(mBitmap).imageProcess().getDstBitmap());
		
 
	}

 
	public static Bitmap readBitMap(Context context, int resId) {
		BitmapFactory.Options opt = new BitmapFactory.Options();
		opt.inPreferredConfig = Bitmap.Config.RGB_565;
		opt.inPurgeable = true;
		opt.inInputShareable = true;
		// 获取资源图片
		InputStream is = context.getResources().openRawResource(resId);
		return BitmapFactory.decodeStream(is, null, opt);
	}
	
	
}
