package escuelaing.arsw.damasyfijas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import escuelaing.arsw.damasyfijas.model.Tablero;
import escuelaing.arsw.damasyfijas.repository.ITableroRepo;
import escuelaing.arsw.damasyfijas.service.IServiceTablero;

@Controller
@RequestMapping(path = "/game")
public class DamasYFijasController {
	
	
	@Autowired
	//Inyección de atributo
	private ITableroRepo repo;
	
	@Autowired 
	//Inyección de atributo
	private IServiceTablero service;
	

	
	@RequestMapping(value="/agregar", method = RequestMethod.GET)
	/**
	 * Método get que nos muestra la página principal de picas y famas
	 * @param model
	 * @return greetin que es un string que es el nombre del html de la página principal
	 */
	public String greeting(Model model) {
		
	
	    model.addAttribute("tablero", new Tablero());
	    
	    model.addAttribute("listado",repo.findAll());
	    return "greeting";
	}
		
	/**
	 * Método Post.Si el número es ganador nos envía a la página intento de lo contrario nos enviara a la página principal
	 * @param tableroModel que es de tipo Tablero
	 * @return  Pagina html donde muestra que es ganador o página principal
	 */
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
    public String guardarProducto(@ModelAttribute Tablero tableroModel) {
		int picas = tableroModel.getPicas();
		int valor = service.calculatePicas(picas);
		int famas = service.getFamas();
		tableroModel.setNumero(picas);
		tableroModel.setPicas(valor);
		tableroModel.setFamas(famas);
        repo.save(tableroModel);
        
        if(service.isGanador()) {
        	service.setGanador(false);
			return "intentos";
		}else {
			
			return "redirect:/game/agregar";
		}
        
        
        
    }
	
	/**
	 * Método post. Borra todos los datos de la entidad Tablero y nos redirige a la página principal
	 * @return página principal
	 */
	@RequestMapping(value="/volver", method = RequestMethod.POST)
    public String volver() {
		
		repo.deleteAll();
		return "redirect:/game/agregar";
		
        
    }

}
