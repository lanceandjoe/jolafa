package com.jolafa.storytrain.model;

import java.util.Date;

public class Story {

	private int id;
	private String title;
	private int creatorId;
	private String storyFilePath;
	private Date dateCreated;
	private Date dateModified;
	private int minWords;
	private int maxWords;
	private int voteTimeout;
	private int nextEntrySequence;
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public String getStoryFilePath() {
		return storyFilePath;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public int getMinWords() {
		return minWords;
	}
	public int getMaxWords() {
		return maxWords;
	}
	public int getVoteTimeout() {
		return voteTimeout;
	}
	public int getNextEntrySequence() {
		return nextEntrySequence;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public void setStoryFilePath(String storyFilePath) {
		this.storyFilePath = storyFilePath;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public void setMinWords(int minWords) {
		this.minWords = minWords;
	}
	public void setMaxWords(int maxWords) {
		this.maxWords = maxWords;
	}
	public void setVoteTimeout(int voteTimeout) {
		this.voteTimeout = voteTimeout;
	}
	public void setNextEntrySequence(int nextEntrySequence) {
		this.nextEntrySequence = nextEntrySequence;
	}

}
