package com.jolafa.storytrain.dao;

import java.util.List;

import com.jolafa.storytrain.model.Entry;
import com.jolafa.storytrain.model.Story;
import com.jolafa.storytrain.model.User;

public interface StoryTrainDao {

	public Entry getEntry(int id);
	public List<Entry> getEntries();
	
	public Story getStory(int id);
	public List<Story> getStories();
	
	public User getUser(int id);
	public List<User> getUsers();
}
