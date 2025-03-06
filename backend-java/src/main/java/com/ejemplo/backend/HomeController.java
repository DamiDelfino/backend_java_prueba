package com.ejemplo.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/inicio")
    public String mostrarInicio(){
        return "inicio";
    }

    @GetMapping("/principal")
    public String mostrarPrincipal() {
        return "principal";  //
    }

    @GetMapping("/notificaciones")
    public String mostrarNotificaciones() {
        return "notificaciones";
    }
    @GetMapping("/estadistica")
    public String mostrarEstadistica() {
        return "estadisitca";
    }

    @GetMapping("/modificar")
    public String mostrarModificar() {
        return "modificar";
    }

    @GetMapping("/form")
    public String mostrarFormulario() {
        return "form";
    }
    
    @GetMapping("/admin")
    public String mostrarAdmin(){
        return "admin";
    }    
        
    @GetMapping("/menu")
    public String mostrarMenu(){
        return "menu";
    }
    @GetMapping("/nuevo")
    public String mostrarNuevo(ModelExtensionsKt model) {
        // Lógica para el formulario
        return "nuevoFormulario";
    }

    @ExceptionHandler(Exception.class)
    public String handleError(Exception e) {
        return "error";  // Asegúrate de tener una página de error configurada
    }

    @GetMapping("/popup")
    public String mostrarPopup() {
        return "popup";  
    }
    @GetMapping("/reporte")
    public String mostrarReporte(){
        return "reporte";
    }
    @GetMapping("/reqAutoridades")
    public String mostrarReqAutoridades(){
        return "reqAutoridades";
    }
     @GetMapping("/requerimiento")
    public String mostrarRequerimiento(){
        return "requerimiento";
    }

}
