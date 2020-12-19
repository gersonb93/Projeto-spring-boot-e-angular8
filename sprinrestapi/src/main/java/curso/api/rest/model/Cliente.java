package curso.api.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idcli;
	
	private String nomecli;
	
	private String emailcli;
	
	private String dddcli;
	
	private String telefonecli;

	public Long getIdcli() {
		return idcli;
	}

	public void setIdcli(Long idcli) {
		this.idcli = idcli;
	}

	public String getNomecli() {
		return nomecli;
	}

	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}

	public String getEmailcli() {
		return emailcli;
	}

	public void setEmailcli(String emailcli) {
		this.emailcli = emailcli;
	}

	public String getDddcli() {
		return dddcli;
	}

	public void setDddcli(String dddcli) {
		this.dddcli = dddcli;
	}

	public String getTelefonecli() {
		return telefonecli;
	}

	public void setTelefonecli(String telefonecli) {
		this.telefonecli = telefonecli;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcli == null) ? 0 : idcli.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idcli == null) {
			if (other.idcli != null)
				return false;
		} else if (!idcli.equals(other.idcli))
			return false;
		return true;
	}
	
	
	

}
