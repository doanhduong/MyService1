package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myservice1.LoginService;
import com.example.myservice1.R;
import com.example.myservice1.ResponseHandler;
import com.example.object.DataLogin;
import com.example.variables.MyTag;

public class LoginActivity extends BaseActivity implements ResponseHandler,
		OnClickListener {
	private final String TAG = "LoginAcrivity";
	private Button btnLogin;
	private EditText etUsername, etPassword;
	private LoginService service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		getControls();
		setEvents();
		Log.v(TAG, Object.class.toString());
	}

	private void getControls() {
		btnLogin = (Button) findViewById(R.id.btn_login);
		etUsername = (EditText) findViewById(R.id.et_username);
		etPassword = (EditText) findViewById(R.id.et_password);
	}

	private void setEvents() {
		service = new LoginService(this, 0);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onSuccess(Object object) {
		// Log.v(TAG, content);
		DataLogin data = (DataLogin) object;
		MyTag.setAuth_token(data.getAuth_token());
		startActivity(new Intent(LoginActivity.this, MainActivity.class));
	}

	@Override
	public void onFailure(int statusCode, String message) {
		Toast.makeText(getApplicationContext(),
				"Error " + statusCode + ": " + message, Toast.LENGTH_LONG)
				.show();
		Log.v(TAG, "FAILURE");
	}

	@Override
	public void parseFailure() {
		Toast.makeText(getApplicationContext(), "ParseData Failure!",
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onClick(View v) {
		String username = etUsername.getText().toString();
		String password = etPassword.getText().toString();
		service.Login(username, password);
	}
}
