package com.ejemplo.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/principal")
    public String mostrarPrincipal(){
        return "principal.html";
    }
    @GetMapping("/notificaciones")
    public String mostrarNotificaciones() {
        return "notificaciones.html";
    }

    @GetMapping("/modificar")
    public String mostrarModificar() {
        return "modificar.html";
    }

    @GetMapping("/form")
    public String mostrarFormulario() {
        return "form.html";
    }
}