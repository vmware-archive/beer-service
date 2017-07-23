package com.example.beerservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String style;
	private String hops;
	private String malt;
	private String yeast;

	public Beer() {
	}

	public Beer(String name, String style, String hops, String malt, String yeast) {
		this.name = name;
		this.style = style;
		this.hops = hops;
		this.malt = malt;
		this.yeast = yeast;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getHops() {
		return hops;
	}

	public void setHops(String hops) {
		this.hops = hops;
	}

	public String getMalt() {
		return malt;
	}

	public void setMalt(String malt) {
		this.malt = malt;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String yeast) {
		this.yeast = yeast;
	}

	@Override
	public String toString() {
		return String.format("Beer [id=%s, name=%s, style=%s, hops=%s, malt=%s, yeast=%s]", id, name, style, hops, malt, yeast);
	}

}
