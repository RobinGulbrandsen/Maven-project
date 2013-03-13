package no.nith.pg560.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PG560_SEARCH")
public class Search {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String technology;
	private String jsr;
	private String url; 
	private String acrynom;
	private String version;
	private String description;
	
	public Search() {
	}
	
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public void setJsr(String jsr) {
		this.jsr = jsr;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setAcrynom(String acrynom) {
		this.acrynom = acrynom;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTechnology() {
		return technology;
	}
	
	public String getJsr() {
		return jsr;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getAcrynom() {
		return acrynom;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getDescription() {
		return description;
	}
	
	public long getId() {
		return id;
	}
	
}
