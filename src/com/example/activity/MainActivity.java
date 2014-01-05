package com.example.activity;

import android.os.Bundle;
import android.util.Log;

import com.example.myservice1.ActivitiesSevice;
import com.example.myservice1.R;
import com.example.myservice1.ResponseHandler;
import com.example.object.DataActivities;

public class MainActivity extends BaseActivity implements ResponseHandler {
	private final String TAG = "MainActivity";
	private ActivitiesSevice service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		service = new ActivitiesSevice(this, 1);
		service.GetDataActivities(1);
	}

	@Override
	public void onSuccess(Object object) {
		DataActivities data = (DataActivities)object;
		Log.v(TAG, data.toString());
	}

	@Override
	public void parseFailure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFailure(int statusCode, String message) {
	
	}
}
