package ac.simons.netbeansevening;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(SpringRunner.class)
@ActiveProfiles("it")
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RegistrationRepositoryIT {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Test
    public void findOneShouldWork() {
	final RegistrationEntity registration = this.registrationRepository.findOne(1);
	Assert.assertThat(registration, is(notNullValue()));
	Assert.assertThat(registration.getName(), is("Geertjan"));	
    }

    @Test
    public void saveShouldWork() {
	final RegistrationEntity registration = this.registrationRepository.save(new RegistrationEntity("test@test", "Test"));
	Assert.assertThat(registration, is(notNullValue()));
	Assert.assertThat(registration.getId(), is(3));
    }
}
