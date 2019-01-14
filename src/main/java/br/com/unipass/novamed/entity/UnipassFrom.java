package br.com.unipass.novamed.entity;

public class UnipassFrom {
	
	private String unipass;
	
	private String url;

	private String id;
	
	public UnipassFrom(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setUnipass(String unipass) {
		this.unipass = unipass;
	}
	
	public String getUnipass() {
		return unipass;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}

}
