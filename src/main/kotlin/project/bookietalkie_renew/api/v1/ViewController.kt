package project.bookietalkie_renew.api.v1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ViewController {
    @GetMapping("about")
    fun about(model: Model): String {
        model.addAttribute("data", "about test")
        return "about";
    }
}
