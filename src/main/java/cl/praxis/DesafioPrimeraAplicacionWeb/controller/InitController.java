package cl.praxis.DesafioPrimeraAplicacionWeb.controller;

import cl.praxis.DesafioPrimeraAplicacionWeb.model.dto.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InitController {

    @GetMapping
    public String index(Model model) {
        Persona p = new Persona(1, "Pepe", "Palotes", 15, "https://i.etsystatic.com/27103892/r/il/a84304/3132668809/il_1140xN.3132668809_j3f0.jpg");
        model.addAttribute("persona", p);
        System.out.println(p.toString());
        return "index";
    }
}
