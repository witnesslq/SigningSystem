package com.genuine.admin.cleardb.action;

import javax.annotation.Resource;

import com.genuine.admin.cleardb.service.CleardbService;
import com.opensymphony.xwork2.ActionSupport;

public class CleardbAction extends ActionSupport{

	@Resource
	private CleardbService cleardbService;
	
	public String cleardbOne(){
		cleardbService.clearOne();
		return SUCCESS;
	}

	public String cleardbTwo() {
		cleardbService.clearTwo();
		return SUCCESS;
	}

	public String cleardbThree() {
		cleardbService.clearThree();
		return SUCCESS;
	}

	public String cleardbFour() {
		cleardbService.clearFour();
		return SUCCESS;
	}

	public String cleardbFive() {
		cleardbService.clearFive();
		return SUCCESS;
	}
	
}
