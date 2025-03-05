package com.ejemplo.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/principal.html")
    public String mostrarPrincipal() {
        return "principal.html";  //
    }

    @GetMapping("/notificaciones")
    public String mostrarNotificaciones() {
        return "notificaciones";
    }

    @GetMapping("/modificar")
    public String mostrarModificar() {
        return "modificar";
    }

    @GetMapping("/form")
    public String mostrarFormulario() {
        return "form";
    }
}