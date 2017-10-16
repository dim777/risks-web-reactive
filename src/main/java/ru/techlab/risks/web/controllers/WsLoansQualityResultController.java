package ru.techlab.risks.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by rb052775 on 16.10.2017.
 */
@Controller
public class WsLoansQualityResultController {

    @GetMapping("/websocket")
    public String websocket() {
        return "websocket";
    }
}
