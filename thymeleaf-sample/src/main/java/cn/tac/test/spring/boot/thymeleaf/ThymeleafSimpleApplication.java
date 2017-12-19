package cn.tac.test.spring.boot.thymeleaf;

import cn.tac.test.spring.boot.thymeleaf.pojo.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("expression-test")
    public String variableExpr(Model model) {
        Book book = new Book("peter");
        model.addAttribute("book", book);

        List<Book> books = new ArrayList<>();
        books.add(new Book("foo1"));
        books.add(new Book("foo2"));
        books.add(new Book("foo3"));
        model.addAttribute("books", books);

        Book titledBook = new Book("罗贯中", "三国演义");
        model.addAttribute("titledBook", titledBook);
        return "expression-test";
    }
}
