package com.example.myservice1;

import java.util.HashMap;
import java.util.Map;


import com.example.variables.MyTag;
import com.loopj.android.http.RequestParams;

public class UpcomingService extends BaseService {
	private ResponseHandler handler;
	private int  typeApi;

	public UpcomingService(ResponseHandler handler, int typeApi) {
		this.handler = handler;
		this.typeApi = typeApi;
	}

	public void GetDataUpcoming(int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", String.valueOf(page).toString());
		getData(MyTag.api_upcomings, MyTag.method_get,
				new RequestParams(params), handler, typeApi);
	}
}
