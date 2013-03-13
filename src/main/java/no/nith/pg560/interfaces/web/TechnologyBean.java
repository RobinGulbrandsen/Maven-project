package no.nith.pg560.interfaces.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import no.nith.pg560.domain.Search;

@Named
@SessionScoped
public class TechnologyBean implements Serializable {
	private static final long serialVersionUID = -8664244784129218581L;
	private String technology;
	private String jsr;
	private String url;

	private List<Search> searches;

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void setJsr(String jsr) {
		this.jsr = jsr;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setSearches(List<Search> searches) {
		this.searches = searches;
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

	public List<Search> getSearches() {
		return searches;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}
}
