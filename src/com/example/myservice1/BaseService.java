package com.example.myservice1;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.example.object.DataActivities;
import com.example.object.DataLogin;
import com.example.variables.MyTag;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class BaseService {
	protected ResponseHandler handler;
	protected Gson gson = new Gson();

	private AsyncHttpClient client = new AsyncHttpClient();

	private void get(String url, RequestParams params,
			AsyncHttpResponseHandler responseHandler) {
		client.setTimeout(10000);
		client.addHeader(MyTag.name_header, MyTag.getAuth_token());
		client.get(getAbsoluteUrl(url), params, responseHandler);
	}

	private void post(String url, RequestParams params,
			AsyncHttpResponseHandler responseHandler) {
		client.setTimeout(10000);
		client.addHeader(MyTag.name_header, MyTag.getAuth_token());
		client.post(getAbsoluteUrl(url), params, responseHandler);
	}

	private String getAbsoluteUrl(String relativeUrl) {
		return MyTag.baseUrl + relativeUrl;
	}

	protected void getData(String api, String method, RequestParams params,
			ResponseHandler responseHandler, int typeApi) {
		if (method.equals(MyTag.method_get)) {
			get(api, params, new ResponseListener(responseHandler, typeApi));
		} else {
			post(api, params, new ResponseListener(responseHandler, typeApi));
		}
	}

	protected Object parseData(String json, int typeApi) {
		Object data = null;
		switch (typeApi) {
		case 0:
			data = gson.fromJson(json, DataLogin.class);
			break;
		case 1:
			data = gson.fromJson(json, DataActivities.class);
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
		return data;
	}

	/*
	 * ================ ResponseListener ===============
	 */
	protected class ResponseListener extends AsyncHttpResponseHandler {
		private final String TAG = "ResponseListener";
		private ResponseHandler handler;
		private int typeApi;

		public ResponseListener(ResponseHandler handler, int typeApi) {
			this.handler = handler;
			this.typeApi = typeApi;
		}

		@Override
		@Deprecated
		public void onFailure(Throwable error, String content) {
			Log.v(TAG, "Failure");
			super.onFailure(error, content);
		}

		@Override
		public void onFinish() {
			Log.v(TAG, "Finished");
			super.onFinish();
		}

		@Override
		public void onStart() {
			Log.v(TAG, "Started");
			super.onStart();
		}

		@Override
		@Deprecated
		public void onSuccess(String content) {
			Log.v(TAG, content);

			try {
				JSONObject a = new JSONObject(content);

				int status_code = a.getInt("status_code");
				if (status_code == 200) {
					Object data = parseData(a.getString("data"), this.typeApi);

					if (data != null)
						handler.onSuccess(data);
					else {
						Log.v(TAG, "Error PaserData");
						handler.parseFailure();
					}
				} else {
					handler.onFailure(status_code, a.getString("message"));
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			super.onSuccess(content);
		}
	}

}
