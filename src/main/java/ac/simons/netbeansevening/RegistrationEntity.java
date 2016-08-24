package ac.simons.netbeansevening;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Table(name = "registrations")
@Getter
@EqualsAndHashCode(of = "email")
@NoArgsConstructor(access = PROTECTED)
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
    @Setter
    private String name;

    public RegistrationEntity(String email, String name) {
	this.email = email;
	this.name = name;
    }              
}
