package com.sca.monitoramento_barragens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootRedirectController {
    @GetMapping
    public String swaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}