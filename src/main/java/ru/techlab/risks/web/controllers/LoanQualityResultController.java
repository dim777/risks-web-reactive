package ru.techlab.risks.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.query.CassandraPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.techlab.risks.web.model.LoanQualityResult;
import ru.techlab.risks.web.repository.LoanQualityResultRepository;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Created by dim777 on 05.10.17.
 */
@Controller
@CrossOrigin
public class LoanQualityResultController {
    @Autowired
    private LoanQualityResultRepository loanQualityResultRepository;

    @GetMapping(path = "/loansquality/list", produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Flux<LoanQualityResult> getAll() {
        Flux<LoanQualityResult> results = loanQualityResultRepository.findAll();
        return results;
    }
}
