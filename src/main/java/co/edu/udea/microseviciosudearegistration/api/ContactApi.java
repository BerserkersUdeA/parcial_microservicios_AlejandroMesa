package co.edu.udea.microseviciosudearegistration.api;



import co.edu.udea.microseviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping("/contact")
    public Contact returnContact() {
        return new Contact(10L, "Alejandro", "Mesa Gómez", "+57 123456789", "alejandro.mesa2@udea.edu.co");
    }

}
