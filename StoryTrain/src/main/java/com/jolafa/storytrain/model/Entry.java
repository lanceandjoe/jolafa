package com.jolafa.storytrain.model;

import java.util.Date;

public class Entry {

	private int id;
	private int storyId;
	private int authorId;
	private String text;
	private Date dateCreated;
	private Date dateModified;
	
	public int getId() {
		return id;
	}
	public int getStoryId() {
		return storyId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public String getText() {
		return text;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

}
