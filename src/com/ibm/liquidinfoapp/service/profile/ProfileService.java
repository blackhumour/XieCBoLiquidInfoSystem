package com.ibm.liquidinfoapp.service.profile;

import java.util.List;

import com.ibm.liquidinfoapp.entity.Profile;

public interface ProfileService {
	public void saveProfile(Profile profile);
	public void deleteProfile(Profile profile);
	public void updateProfile(Profile profile);
	public Profile findProfileById(String notesID);
	public List<Profile> findProfileAll();
}
