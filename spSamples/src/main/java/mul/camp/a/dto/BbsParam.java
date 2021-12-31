package mul.camp.a.dto;

import java.io.Serializable;

public class BbsParam implements Serializable{

	private String choice;
	private String search;
	
	public BbsParam() {
		// TODO Auto-generated constructor stub
	}
	

	public BbsParam(String choicel, String search) {
		super();
		this.choice = choicel;
		this.search = search;
	}


	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}


	@Override
	public String toString() {
		return "BbsParam [choicel=" + choice + ", search=" + search + "]";
	}
	
	
}
