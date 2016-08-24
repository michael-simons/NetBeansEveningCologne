package ac.simons.netbeansevening;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "registrations")
public class RegistrationEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 1024, nullable = false, unique = false)
    @NotBlank
    @Email
    @Size(max = 1024)
    private String email;
    
    @Column(length = 512, nullable = false)
    @NotBlank
    @Size(max = 512)
    private String name;

    protected RegistrationEntity() {
    }

    public RegistrationEntity(String email, String name) {
	this.email = email;
	this.name = name;
    }    
    
    public Integer getId() {
	return id;
    }

    public String getEmail() {
	return email;
    }
  
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 53 * hash + Objects.hashCode(this.email);
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final RegistrationEntity other = (RegistrationEntity) obj;
	return Objects.equals(this.email, other.email);
    }    
}
