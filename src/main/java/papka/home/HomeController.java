package papka.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/") //при переходе на localhost:8080/ - выводит это сообщение
    public String greeting(){
        return "Hello! Welcome to SpringBoot";
    }
}
