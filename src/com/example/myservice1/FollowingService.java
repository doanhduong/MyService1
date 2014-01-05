package com.example.myservice1;

import java.util.HashMap;
import java.util.Map;

import com.example.variables.MyTag;
import com.loopj.android.http.RequestParams;

public class FollowingService extends BaseService {
	private ResponseHandler handler;
	private int typeApi;

	public FollowingService(ResponseHandler handler, int typeApi) {
		this.handler = handler;
		this.typeApi = typeApi;
	}

	public void GetDataFollowing(int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", String.valueOf(page).toString());
		getData(MyTag.api_followings, MyTag.method_get, new RequestParams(
				params), handler, typeApi);
	}
}