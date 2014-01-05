package com.example.myservice1;

public interface ResponseHandler {
	public void onSuccess(Object object);
	public void onFailure(int statusCode, String message);
	public void parseFailure();
}
