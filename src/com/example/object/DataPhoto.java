package com.example.object;

import java.util.List;

public class DataPhoto {
	private int total_pages;
	private int total_count;
	private int page;
	private List<Photo> photos;

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
}
