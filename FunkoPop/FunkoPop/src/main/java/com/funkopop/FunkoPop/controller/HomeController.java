package com.funkopop.FunkoPop.controller;

import com.funkopop.FunkoPop.repository.PedidoRepository;
import com.funkopop.FunkoPop.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ModelAndView home(){
        List<Pedido> pedidos = pedidoRepository.findAll();
        ModelAndView listagem = new ModelAndView("home");
        listagem.addObject("pedidos", pedidos);
        return listagem;
    }
}
