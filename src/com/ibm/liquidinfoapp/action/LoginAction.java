package com.ibm.liquidinfoapp.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.ibm.liquidinfoapp.entity.Profile;
import com.ibm.liquidinfoapp.service.profile.ProfileService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	private ProfileService profileService;
	
	private String notesid;
	private String password;
	
	public String login() {
		
		try {
			
			// find notesID
			Profile profile = profileService.findProfileById(notesid);
			
			// notesID is not exist
			if (null == profile) {
				addFieldError("notesID", "NotesID is not exist, please re-enter");
				return INPUT;
			}
			// password is not exist
			else if (!password.equals(profile.getPassword())) {
				addFieldError("password", "Password is wrong, please re-enter");
				return INPUT;
			}
			
			// save notesID... in session
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("notesid", notesid);
			request.getSession().setAttribute("roleid", profile.getRoleid());
			request.getSession().setAttribute("regiesteredflag", profile.getRegisteredflag());
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return ERROR;
			
		}
		
		return SUCCESS;
		
	}

	public String getNotesid() {
		return notesid;
	}
	public void setNotesid(String notesid) {
		this.notesid = notesid;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
