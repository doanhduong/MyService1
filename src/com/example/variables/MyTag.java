package com.example.variables;

public class MyTag {
	public static String method_get = "GET";
	public static String method_post = "POST";
	public static String name_header = "X-AUTH-TOKEN";
	public static String baseUrl = "http://beta.pashadelic.com/api/v1/";
	public static String auth_token = "PTNN7JRHEQ7eigsos1Fz";
	public static String api_followings = "followings.json";
	public static String api_activities = "activities.json";
	public static String api_upcomings = "upcomings.json";
	public static String api_login = "sessions.json";
	

	public static String getAuth_token() {
		return auth_token;
	}

	public static void setAuth_token(String auth_token) {
		MyTag.auth_token = auth_token;
	}

}
