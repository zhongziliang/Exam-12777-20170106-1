package pojo;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;


public class Film extends Page{
	
	private Integer id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String description;
	private Date lasetUpdate;
	private Language language;
	 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLasetUpdate() {
		return lasetUpdate;
	}
	public void setLasetUpdate(Date lasetUpdate) {
		this.lasetUpdate = lasetUpdate;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
