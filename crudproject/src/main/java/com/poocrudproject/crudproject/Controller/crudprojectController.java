package com.poocrudproject.crudproject.Controller;

import java.util.List;

import com.poocrudproject.crudproject.InterfaceService.PessoaInterfServ;
import com.poocrudproject.crudproject.Model.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class crudprojectController {

    @Autowired
    private PessoaInterfServ service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Pessoa> pessoas = service.listar();
        model.addAttribute("pessoas", pessoas);
        return "index";
    }

}
