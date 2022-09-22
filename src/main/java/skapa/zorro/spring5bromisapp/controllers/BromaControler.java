package skapa.zorro.spring5bromisapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import skapa.zorro.spring5bromisapp.services.BromaService;

@Controller
public class BromaControler {

	// inyeccion de dependencia, no es necesario hacer el autowired, porque se esta
	// haciendo a travez de constructor, por lo que spring reconocera esta injeccion
	private final BromaService bromaService;

	public BromaControler(BromaService bromaService) {
		this.bromaService = bromaService;
	}

	// respuesta del controlador, poniendo el servicio broma, en el modelo para que
	// pueda ser accedido a travez de thymeleaf
	@RequestMapping({ "/", "" })
	public String muestraBroma(Model model) {

		model.addAttribute("broma", bromaService.getBroma());

		return "index";
	}
}
