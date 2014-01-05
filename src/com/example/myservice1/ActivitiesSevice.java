package com.example.myservice1;

import java.util.HashMap;
import java.util.Map;

import com.example.variables.MyTag;
import com.loopj.android.http.RequestParams;

public class ActivitiesSevice extends BaseService {
	private ResponseHandler handler;
	private int typeApi;

	public ActivitiesSevice(ResponseHandler handler, int typeApi) {
		this.handler = handler;
		this.typeApi = typeApi;
	}

	public void GetDataActivities(int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", String.valueOf(page).toString());
		getData(MyTag.api_activities, MyTag.method_get, new RequestParams(
				params), handler, typeApi);
	}

}
