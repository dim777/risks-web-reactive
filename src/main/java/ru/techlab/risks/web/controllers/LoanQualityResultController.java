package ru.techlab.risks.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.techlab.risks.web.model.LoanQualityResult;
import ru.techlab.risks.web.repository.LoanQualityResultRepository;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

/**
 * Created by dim777 on 05.10.17.
 */
/*@Controller
public class LoanQualityResultController {
    @Autowired
    private LoanQualityResultRepository loanQualityResultRepository;

    @GetMapping("/loansquality")
    public String loansquality() {
        return "loansquality";
    }

    @GetMapping(path = "/loansquality/feed", produces = TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<LoanQualityResult> getAll() {
        loanQualityResultRepository.findAll();
        return WebClient.create("http://localhost:8081")
                .get()
                .uri("/loansquality")
                .accept(APPLICATION_STREAM_JSON)
                .retrieve()
                .bodyToFlux(LoanQualityResult.class)
                .share()
                .log("ru.techlab.risks.web.repository");
    }
}*/
