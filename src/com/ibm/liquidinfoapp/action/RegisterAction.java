package com.ibm.liquidinfoapp.action;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.ibm.liquidinfoapp.entity.Profile;
import com.ibm.liquidinfoapp.service.profile.ProfileService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class RegisterAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(RegisterAction.class);
	
	@Resource
	private ProfileService profileService;
	
	private Profile profile;
	
	public String register() {
		logger.info("RegisterAction:register");
		try {
			
			// find notesID
			Profile p = profileService.findProfileById(profile.getNotesid());
			
			// notesID is already exist
			if (p != null) {
				addFieldError("profile.notesid", "NotesID is already exist, please re-enter");
				return INPUT;
			}
			
			// set OnSiteFlag
			if ("on".equals(profile.getOnsiteflag())) {
				profile.setOnsiteflag("1");
			}
			else {
				profile.setOnsiteflag("0");
			}
			
			// set OnBenchFlag
			if ("on".equals(profile.getOnbenchflag())) {
				profile.setOnbenchflag("1");
			}
			else {
				profile.setOnbenchflag("0");
			}
			
			// set RegiesteredFlag
			if ("on".equals(profile.getRegisteredflag())) {
				profile.setRegisteredflag("1");
			}
			else {
				profile.setRegisteredflag("0");
			}
			
			// set RoleID
			if ("notes@cn.ibm.com".equals(profile.getNotesid())) {
				profile.setRoleid("1000");
			}
			else {
				profile.setRoleid("1001");
			}
			
			// current time
			profile.setCreatetime(new Date());
			profile.setUpdatetime(new Date());
			
			// do register
			logger.info("RegisterAction:saveProfile");
			logger.info(profile.getRoleid());
			profileService.saveProfile(profile);;
			
			// save notesID... in session
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("notesid", profile.getNotesid());
			request.getSession().setAttribute("roleid", profile.getRoleid());
			request.getSession().setAttribute("regiesteredflag", profile.getRegisteredflag());
						
		} catch (Exception e) {
			
			e.printStackTrace();
			return ERROR;
			
		}
		
		return SUCCESS;
		
	}

	public Profile getProfile() {
		return profile;
	}	

	public void setProfile(Profile profile) {
		this.profile = profile;
	
	}
}
