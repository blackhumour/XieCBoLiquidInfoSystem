package com.ibm.liquidinfoapp.service.profile.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ibm.liquidinfoapp.dao.BaseDao;
import com.ibm.liquidinfoapp.entity.Profile;
import com.ibm.liquidinfoapp.service.profile.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	
	@Resource
	private BaseDao<Profile> baseDAO;
	
	@Override
	public void saveProfile(Profile profile) {
		baseDAO.insertObj(profile);
	}

	@Override
	public void deleteProfile(Profile profile) {
		baseDAO.deleteObj(profile);
	}

	@Override
	public void updateProfile(Profile profile) {
		baseDAO.updateObj(profile);
	}

	@Override
	public Profile findProfileById(String notesID) {
		return baseDAO.selectObj(Profile.class, notesID);
	}

	@Override
	public List<Profile> findProfileAll() {
		return baseDAO.selectObjList(" from Profile p order by p.createtime");
	}

}
