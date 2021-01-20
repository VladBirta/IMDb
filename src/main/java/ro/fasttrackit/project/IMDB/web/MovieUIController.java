package ro.fasttrackit.project.IMDB.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class MovieUIController {

    @GetMapping
    String getUserPage(){
        return "user";
    }

}
