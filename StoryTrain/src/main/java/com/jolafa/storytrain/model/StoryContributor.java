package com.jolafa.storytrain.model;

import java.util.Date;

public class StoryContributor {

	private int storyId;
	private int authorId;
	private int entryNumber;
	private Date added;
	
	public int getStoryId() {
		return storyId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public int getEntryNumber() {
		return entryNumber;
	}
	public Date getAdded() {
		return added;
	}
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
	
}
