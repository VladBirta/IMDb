package ro.fasttrackit.project.IMDB.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.project.IMDB.service.ActionService;

@Controller
@RequestMapping("actions")
public class ActionUIController {
    private final ActionService actionService;

    public ActionUIController(ActionService actionService){
        this.actionService = actionService;
    }
    @GetMapping
    String getUserPage(Model pageModel){
        pageModel.addAttribute("trailer", "Trailer");
        pageModel.addAttribute("myModal", true);
        pageModel.addAttribute("actions", actionService.getAllAction());
        return "actions";
    }
}
