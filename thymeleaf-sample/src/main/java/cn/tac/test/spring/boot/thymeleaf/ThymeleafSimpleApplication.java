package cn.tac.test.spring.boot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tac
 * @since 26/11/2017
 */
@SpringBootApplication
@Controller
public class ThymeleafSimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSimpleApplication.class, args);
    }

    @GetMapping("greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Dear");
        return "greeting";
    }
}
