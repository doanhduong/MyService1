package com.example.object;

import java.util.List;

public class DataActivities {
	private int count;
	private boolean try_paginate;
	private String page;
	private List<Activities> activities;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isTry_paginate() {
		return try_paginate;
	}

	public void setTry_paginate(boolean try_paginate) {
		this.try_paginate = try_paginate;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public List<Activities> getActivities() {
		return activities;
	}

	public void setActivities(List<Activities> activities) {
		this.activities = activities;
	}

}
