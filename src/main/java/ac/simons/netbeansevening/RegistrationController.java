package ac.simons.netbeansevening;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/registrations")
@RequiredArgsConstructor
public class RegistrationController {
    
    private final RegistrationRepository registrationRepository;
   
    @RequestMapping(method = GET)
    public Iterable<RegistrationEntity> list() {
	return this.registrationRepository.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = GET)
    public RegistrationEntity get(@PathVariable Integer id) {
	return this.registrationRepository.findOne(id);
    }
    
    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public RegistrationEntity create(@Valid @RequestBody RegistrationEntity newRegistration) {
	return this.registrationRepository.save(newRegistration);
    }
}
