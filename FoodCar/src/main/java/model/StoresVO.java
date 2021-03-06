package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;

public class StoresVO implements java.io.Serializable {

	private Integer sID;
	private String sUsername;
	private String sPassword;
	private String sName;
	private String sBossName;
	private String sLogo;
	private String sIntro;

	private Set<HoursVO> hoursVO = new HashSet<HoursVO>();
	private Set<MapsVO> mapVO = new HashSet<MapsVO>();
	private Set<MenusVO> menusVO = new HashSet<MenusVO>();

	public Set<HoursVO> getHoursVO() {
		return hoursVO;
	}

	public void setHoursVO(Set<HoursVO> hoursVO) {
		this.hoursVO = hoursVO;
	}

	public String getsIntro() {
		return sIntro;
	}

	public void setsIntro(String sIntro) {
		this.sIntro = sIntro;
	}

	public Set<MenusVO> getMenusVO() {
		return menusVO;
	}

	public void setMenusVO(Set<MenusVO> menusVO) {
		this.menusVO = menusVO;
	}

	public Set<MapsVO> getMapVO() {
		return mapVO;
	}

	public void setMapVO(Set<MapsVO> mapVO) {
		this.mapVO = mapVO;
	}

	public Integer getsID() {
		return sID;
	}

	public void setsID(Integer sID) {
		this.sID = sID;
	}

	public String getsUsername() {
		return sUsername;
	}

	public void setsUsername(String sUsername) {
		this.sUsername = sUsername;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsBossName() {
		return sBossName;
	}

	public void setsBossName(String sBossName) {
		this.sBossName = sBossName;
	}

	public String getsLogo() {
		return sLogo;
	}

	public void setsLogo(String sLogo) {

		this.sLogo = sLogo;
	}

}
