package ru.techlab.risks.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.techlab.risks.web.model.LoanQualityResult;
import ru.techlab.risks.web.repository.LoanQualityResultRepository;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

/**
 * Created by dim777 on 05.10.17.
 */
@Controller
public class LoanQualityResultController {
    @Autowired
    private LoanQualityResultRepository loanQualityResultRepository;

    @GetMapping(path = "/loansquality/echo", produces = TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<LoanQualityResult> getAll() {
        Flux<LoanQualityResult> results = loanQualityResultRepository.findAll();
        return results;
    }
}
