package ac.simons.netbeansevening;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = RegistrationController.class)
public class RegistrationControllerTest {

    @MockBean
    private RegistrationRepository registrationRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void listShouldWork() throws Exception {
	when(registrationRepository.findAll()).thenReturn(Arrays.asList(
		new RegistrationEntity("michael@simons.ac", "Michael"),
		new RegistrationEntity("geertjan.wielenga@oracle.com", "Geertjan"))
	);

	this.mockMvc
		.perform(get("/registrations"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(2)))
		.andExpect(jsonPath("$[1].name", is("Geertjan")));

	verify(this.registrationRepository).findAll();
    }

    @Test
    public void createShouldWork() throws Exception {
	when(registrationRepository.save(any(RegistrationEntity.class))).thenAnswer(returnsFirstArg());

	final RegistrationEntity requestBody = new RegistrationEntity("test@test.com", "Test");
	this.mockMvc
		.perform(
			post("/registrations")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(requestBody))
		)
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$.name", is("Test")));

	verify(this.registrationRepository).save(any(RegistrationEntity.class));
    }
}
