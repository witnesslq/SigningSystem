package com.genuine.front.login.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class School implements Serializable{
	
	//id
	private String s_Id;
	//ѧУ����
	private String s_Name;
	//��ʼ����
	private String s_Password;
	//���ڳ���
	private String s_City;
	//ѧУ���ܲ���
	private String s_Dept;
	//�������
	private String s_Type;
	//��������
	private String s_Admin;
	//��ְ��ר
	private String s_Manage;
	//��ַ��
	private String s_Address;
	//75ʡ��ѧУ
	private String s_75;
	//�ύ״̬
	private String s_Submit;
	
	//ǩ��map
	public static String SCHOOL_SUBMIT_NO = "0";
	public static String SCHOOL_SUBMIT_YES = "1";
	public static Map<String,String> SCHOOL_SUBMIT_MAP = new HashMap<String,String>();
	static {
		SCHOOL_SUBMIT_MAP.put(SCHOOL_SUBMIT_NO,"��");
		SCHOOL_SUBMIT_MAP.put(SCHOOL_SUBMIT_YES,"��");
	}
	//���ڳ���map
	public static String SCHOOL_City_AS = "��ɽ";
	public static String SCHOOL_City_BX = "��Ϫ";
	public static String SCHOOL_City_CY = "����";
	public static String SCHOOL_City_DL = "����";
	public static String SCHOOL_City_DD = "����";
	public static String SCHOOL_City_FS = "��˳";
	public static String SCHOOL_City_FX = "����";
	public static String SCHOOL_City_HLD = "��«��";
	public static String SCHOOL_City_LY = "����";
	public static String SCHOOL_City_PJ = "�̽�";
	public static String SCHOOL_City_SY = "����";
	public static String SCHOOL_City_TL = "����";
	public static String SCHOOL_City_YK = "Ӫ��";
	public static Map<String,String> cityMap = new HashMap<String,String>();
	static {
		cityMap.put(SCHOOL_City_AS, SCHOOL_City_AS);
		cityMap.put(SCHOOL_City_BX, SCHOOL_City_BX);
		cityMap.put(SCHOOL_City_CY, SCHOOL_City_CY);
		cityMap.put(SCHOOL_City_DL, SCHOOL_City_DL);
		cityMap.put(SCHOOL_City_DD, SCHOOL_City_DD);
		cityMap.put(SCHOOL_City_FS, SCHOOL_City_FS);
		cityMap.put(SCHOOL_City_FX, SCHOOL_City_FX);
		cityMap.put(SCHOOL_City_HLD, SCHOOL_City_HLD);
		cityMap.put(SCHOOL_City_LY, SCHOOL_City_LY);
		cityMap.put(SCHOOL_City_PJ, SCHOOL_City_PJ);
		cityMap.put(SCHOOL_City_SY, SCHOOL_City_SY);
		cityMap.put(SCHOOL_City_TL, SCHOOL_City_TL);
		cityMap.put(SCHOOL_City_YK, SCHOOL_City_YK);
	}
	public static String SCHOOL_TYPE_BS = "����";
	public static String SCHOOL_TYPE_DLXY = "����ѧԺ";
	public static String SCHOOL_TYPE_PSBK = "ʡ������";
	public static String SCHOOL_TYPE_PSZK = "ʡ��ר��";
	public static String SCHOOL_TYPE_SSBK = "��������";
	public static String SCHOOL_TYPE_SSZK = "����ר��";
	public static Map<String,String> typeMap = new HashMap<String,String>();
	static {
		typeMap.put(SCHOOL_TYPE_BS, SCHOOL_TYPE_BS);
		typeMap.put(SCHOOL_TYPE_DLXY, SCHOOL_TYPE_DLXY);
		typeMap.put(SCHOOL_TYPE_PSBK, SCHOOL_TYPE_PSBK);
		typeMap.put(SCHOOL_TYPE_PSZK, SCHOOL_TYPE_PSZK);
		typeMap.put(SCHOOL_TYPE_SSBK, SCHOOL_TYPE_SSBK);
		typeMap.put(SCHOOL_TYPE_SSZK, SCHOOL_TYPE_SSZK);
	}
	public static String SCHOOL_ADMIN_GB = "����";
	public static String SCHOOL_ADMIN_MB = "���";
	public static Map<String,String> adminMap = new HashMap<String,String>();
	static {
		adminMap.put(SCHOOL_ADMIN_GB, SCHOOL_ADMIN_GB);
		adminMap.put(SCHOOL_ADMIN_MB,SCHOOL_ADMIN_MB);
	}
	public static String SCHOOL_S75_YES = "1";
	public static String SCHOOL_S75_NO = "0";
	public static Map<String,String> s75Map = new HashMap<String,String>();
	static {
		s75Map.put(SCHOOL_S75_YES, "��");
		s75Map.put(SCHOOL_S75_NO, "��");
	}
	public String getS_Id() {
		return s_Id;
	}
	public void setS_Id(String s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public String getS_Password() {
		return s_Password;
	}
	public void setS_Password(String s_Password) {
		this.s_Password = s_Password;
	}
	public String getS_City() {
		return s_City;
	}
	public void setS_City(String s_City) {
		this.s_City = s_City;
	}
	public String getS_Dept() {
		return s_Dept;
	}
	public void setS_Dept(String s_Dept) {
		this.s_Dept = s_Dept;
	}
	public String getS_Type() {
		return s_Type;
	}
	public void setS_Type(String s_Type) {
		this.s_Type = s_Type;
	}
	public String getS_Admin() {
		return s_Admin;
	}
	public void setS_Admin(String s_Admin) {
		this.s_Admin = s_Admin;
	}
	public String getS_Manage() {
		return s_Manage;
	}
	public void setS_Manage(String s_Manage) {
		this.s_Manage = s_Manage;
	}
	public String getS_Address() {
		return s_Address;
	}
	public void setS_Address(String s_Address) {
		this.s_Address = s_Address;
	}
	public String getS_75() {
		return s_75;
	}
	public void setS_75(String s_75) {
		this.s_75 = s_75;
	}

	public School(String s_Id, String s_Name, String s_Password, String s_City,
			String s_Dept, String s_Type, String s_Admin, String s_Manage,
			String s_Address, String s_75, String s_Submit) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Password = s_Password;
		this.s_City = s_City;
		this.s_Dept = s_Dept;
		this.s_Type = s_Type;
		this.s_Admin = s_Admin;
		this.s_Manage = s_Manage;
		this.s_Address = s_Address;
		this.s_75 = s_75;
		this.s_Submit = s_Submit;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "School [s_Id=" + s_Id + ", s_Name=" + s_Name + ", s_Password="
				+ s_Password + ", s_City=" + s_City + ", s_Dept=" + s_Dept
				+ ", s_Type=" + s_Type + ", s_Admin=" + s_Admin + ", s_Manage="
				+ s_Manage + ", s_Address=" + s_Address + ", s_75=" + s_75
				+ ", s_Submit=" + s_Submit + "]";
	}
	public String getS_Submit() {
		return s_Submit;
	}
	public void setS_Submit(String s_Submit) {
		this.s_Submit = s_Submit;
	}
	
	
	
}
