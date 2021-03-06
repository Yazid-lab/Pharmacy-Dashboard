package entities;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "Meds")
public class Meds implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Meds(int idMed, String nameMed) {
		super();
		this.idMed = idMed;
		this.nameMed = nameMed;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idMed;
	private String nameMed;
	
	
	public Meds(String nameMed) {
		super();
		this.nameMed = nameMed;
	}
	public Meds() {
		super();
	}
	
	public int getIdMed() {
		return idMed;
	}
	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}
	public String getNameMed() {
		return nameMed;
	}
	public void setNameMed(String nameMed) {
		this.nameMed = nameMed;
	}
	@Override
	public String toString() {
		return "Meds [idMed=" + idMed + ", nameMed=" + nameMed + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idMed, nameMed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meds other = (Meds) obj;
		return idMed == other.idMed && Objects.equals(nameMed, other.nameMed);
	}
	
	

	
	

}
