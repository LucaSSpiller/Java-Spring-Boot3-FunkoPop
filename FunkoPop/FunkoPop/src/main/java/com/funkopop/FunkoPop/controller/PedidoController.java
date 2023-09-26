package com.funkopop.FunkoPop.controller;

import com.funkopop.FunkoPop.DadosCadastroPedido;
import com.funkopop.FunkoPop.model.Pedido;
import com.funkopop.FunkoPop.repository.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/formulario")
    public ModelAndView form(DadosCadastroPedido dados){
        ModelAndView listagem = new ModelAndView("pedido/formulario");
        return listagem;
    }

    @PostMapping("/novo")
    public ModelAndView novoPedido(@Valid DadosCadastroPedido dados, BindingResult result) {
        ModelAndView listagem;
        if (result.hasErrors()) {
            listagem = new ModelAndView("pedido/formulario");
            return listagem;
        }

        Pedido pedido = new Pedido(dados);
        pedidoRepository.save(pedido);
        listagem = new ModelAndView("redirect:/home");
        return listagem;
    }
}
