package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.AirplaneService;

@RequestMapping("/hello")
@Controller
public class AirplaneController {
    private final AirplaneService airplaneService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @GetMapping(value = "/airplanes")
    public String showAirplanes(ModelMap model) {
        model.addAttribute("airplanes", airplaneService.getAllAirplanes());
        return "airplanes";  // Имя HTML файла
    }
}
