package com.example.myservice1;

import java.util.HashMap;
import java.util.Map;


import com.example.variables.MyTag;
import com.loopj.android.http.RequestParams;

public class LoginService extends BaseService {
	private ResponseHandler handler;
	private int  typeApi;

	public LoginService(ResponseHandler handler, int typeApi) {
		this.handler = handler;
		this.typeApi = typeApi;
	}

	public void Login(String username, String password) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", username);
		params.put("password", password);

		getData(MyTag.api_login, MyTag.method_post, new RequestParams(params),
				handler, typeApi);
	}
}
