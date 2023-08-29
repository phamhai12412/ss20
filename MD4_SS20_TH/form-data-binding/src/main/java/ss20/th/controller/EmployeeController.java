package ss20.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ss20.th.model.Employee;


@Controller
public class EmployeeController {
    @GetMapping(value = {"/","/employee"})
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        System.out.println("model"+model);
        return "employee/create";
    }

    //    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    @PostMapping("/addEmployee")

    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("phone", employee.getPhone());
        model.addAttribute("id", employee.getId());
        return "employee/info";
    }

}
