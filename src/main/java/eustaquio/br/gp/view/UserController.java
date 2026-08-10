package eustaquio.br.gp.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String users(Model model) {

        List<String> users = List.of(
                "João",
                "Maria",
                "Carlos",
                "Ana"
        );

        model.addAttribute("users", users);

        return "users";
    }
}