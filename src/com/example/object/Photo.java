package com.example.object;

public class Photo {
	private int id;
	private String owner_username;
	private String owner_avatar_url;
	private int width;
	private int height;
	private String created_at;
	private int owner_id;
	private String image_tile_url;
	private String image_list_url;
	private double lon;
	private double lat;
	private String location;
	private boolean like_status;
	private boolean pin_status;
	private String likes_count;
	private String pins_count;
	private String comments_count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner_username() {
		return owner_username;
	}

	public void setOwner_username(String owner_username) {
		this.owner_username = owner_username;
	}

	public String getOwner_avatar_url() {
		return owner_avatar_url;
	}

	public void setOwner_avatar_url(String owner_avatar_url) {
		this.owner_avatar_url = owner_avatar_url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getImage_tile_url() {
		return image_tile_url;
	}

	public void setImage_tile_url(String image_tile_url) {
		this.image_tile_url = image_tile_url;
	}

	public String getImage_list_url() {
		return image_list_url;
	}

	public void setImage_list_url(String image_list_url) {
		this.image_list_url = image_list_url;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isLike_status() {
		return like_status;
	}

	public void setLike_status(boolean like_status) {
		this.like_status = like_status;
	}

	public boolean isPin_status() {
		return pin_status;
	}

	public void setPin_status(boolean pin_status) {
		this.pin_status = pin_status;
	}

	public String getLikes_count() {
		return likes_count;
	}

	public void setLikes_count(String likes_count) {
		this.likes_count = likes_count;
	}

	public String getPins_count() {
		return pins_count;
	}

	public void setPins_count(String pins_count) {
		this.pins_count = pins_count;
	}

	public String getComments_count() {
		return comments_count;
	}

	public void setComments_count(String comments_count) {
		this.comments_count = comments_count;
	}

}
