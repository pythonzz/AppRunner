package com.inuker.pluglib;

import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.View;

public interface IPluginProxyActivity {

	void setContentView(int layoutResID);

	Resources getResources();

	AssetManager getAssets();

	void startActivity(Intent intent);

	View findViewById(int id);

	String getPackageName();
}
