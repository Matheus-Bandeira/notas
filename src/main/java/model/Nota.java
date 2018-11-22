package model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Nota {

	@JsonProperty("Id")
	private Integer id;
	
	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Body")
	private String body;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
