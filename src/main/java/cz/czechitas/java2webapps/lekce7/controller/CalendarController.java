package cz.czechitas.java2webapps.lekce7.controller;

import cz.czechitas.java2webapps.lekce7.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Filip Jirsák
 */
@Controller
public class CalendarController {
    private final CalendarService service;

    @Autowired
    public CalendarController(CalendarService service) {
        this.service = service;
    }

    @ModelAttribute("currentYear")
    public int getCurrentYear() {
        return service.getCurrentYear();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/vypocet")
    public String form(int rok, String typ) {
        return String.format("redirect:/%s/%d", typ, rok);
    }

    @GetMapping("/easter/{year}")
    public ModelAndView easter(@PathVariable int year) {
        return new ModelAndView("easter")
                .addObject("calendar", service.easter(year));
    }

    @GetMapping("/pentecost/{year}")
    public ModelAndView pentecost(@PathVariable int year) {
        return new ModelAndView("pentecost")
                .addObject("calendar", service.pentecost(year));
    }

    @GetMapping("/christmas/{year}")
    public ModelAndView christmas(@PathVariable int year) {
        return new ModelAndView("christmas")
                .addObject("calendar", service.christmas(year));
    }

    @GetMapping("/sylvester/{year}")
    public ModelAndView sylvester(@PathVariable int year) {
        return new ModelAndView("sylvester")
                .addObject("calendar", service.sylvester(year));
    }
}
