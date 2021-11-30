package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarsController {
    final CarDAO carDAO;

    public CarsController() {
        this.carDAO = new CarDAO();
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null) {
            model.addAttribute("cars", carDAO.getCars(5));
            return "/cars";
        } else {
            model.addAttribute("cars", carDAO.getCars(count));
            return "/cars";
        }
    }
}
