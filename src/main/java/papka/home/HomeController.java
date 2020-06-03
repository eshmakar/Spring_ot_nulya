package papka.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.Formatter;

@RestController
public class HomeController {

    @RequestMapping(value = "/") //при переходе на localhost:8080/ - выводит это сообщение
    public String greeting() {
        return "Hello! Welcome to SpringBoot";
    }


    @RequestMapping(value = "/time")
    public LocalTime sto() {
        return LocalTime.now();
    }

    @RequestMapping(value = "/longtime")
    public long count(){
        return System.currentTimeMillis();
    }

    @GetMapping(value = "/{name}") //Приветствует пользователя именем, который ввел в адресную строку http://localhost:8080/Marat
    public String greetWithName(@PathVariable String name){   //@PathVariable - вставляет введенное имя
        return String.format("Welcome %s to our SpringBoot App", name);

    }
}