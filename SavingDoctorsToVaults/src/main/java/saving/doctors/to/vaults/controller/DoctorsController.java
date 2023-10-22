package saving.doctors.to.vaults.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import saving.doctors.to.vaults.dao.DoctorDAO;
import saving.doctors.to.vaults.model.Doctor;

import javax.validation.Valid;


@Controller
@RequestMapping("/doctors")
public class DoctorsController {



    private final DoctorDAO doctorDAO;

    @Autowired
    public DoctorsController(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }


    @GetMapping()
    public String index(Model model) {
        model.addAttribute("doctors", doctorDAO.index());
        return "doctor/index";
    }


    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("doctor", doctorDAO.show(id));
        return "doctor/show";
    }


    @GetMapping("/new")
    public String newPerson(@ModelAttribute("doctor") Doctor doctor) {

        return "doctor/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("doctor") Doctor doctor) {

        doctorDAO.save(doctor);
        return "redirect:/doctors";
    }




}

