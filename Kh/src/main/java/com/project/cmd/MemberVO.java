package com.project.cmd;

/*
 * user정보 VO
 */
public class MemberVO {
	
	//TBL_TEST 컬럼
	private String ID;
	private String USER_ID;
	private String PWD;
	private String NAME;
	private String INDATE;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getINDATE() {
		return INDATE;
	}
	public void setINDATE(String iNDATE) {
		INDATE = iNDATE;
	}
	
	/*
	 * vo 정보 확인
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "  ID:" + ID + "  PWD:" + PWD + "  NAME:" + NAME + "  INDATE:" + INDATE;
	}
}
