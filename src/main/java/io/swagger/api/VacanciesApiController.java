package io.swagger.api;

import io.swagger.model.Vacancy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VacanciesApiController implements VacanciesApi {

    // Тимчасове сховище у пам'яті
    private static final List<Vacancy> vacancies = new ArrayList<>();

    // Отримати список усіх вакансій
    public ResponseEntity<List<Vacancy>> vacanciesGet() {
        return new ResponseEntity<>(vacancies, HttpStatus.OK);
    }

    // Створити нову вакансію
    public ResponseEntity<Void> vacanciesPost(@Valid @RequestBody Vacancy body) {
        if (body.getId() == null) {
            body.setId(vacancies.size() + 1);
        }
        vacancies.add(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}