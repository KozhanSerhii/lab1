package io.swagger.api;

import io.swagger.model.Employer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployersApiController implements EmployersApi {

    // Тимчасове сховище у пам'яті
    private static final List<Employer> employers = new ArrayList<>();

    // Отримати всіх роботодавців
    public ResponseEntity<List<Employer>> employersGet() {
        return new ResponseEntity<>(employers, HttpStatus.OK);
    }

    // Додати нового роботодавця
    public ResponseEntity<Void> employersPost(@Valid @RequestBody Employer body) {
        // Проста логіка генерації ID
        if (body.getId() == null) {
            body.setId(employers.size() + 1);
        }
        employers.add(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Отримати дані роботодавця за ID
    public ResponseEntity<Void> employersIdGet(@PathVariable("id") Integer id) {
        boolean exists = employers.stream().anyMatch(e -> e.getId().equals(id));
        return exists ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Видалити роботодавця
    public ResponseEntity<Void> employersIdDelete(@PathVariable("id") Integer id) {
        boolean removed = employers.removeIf(e -> e.getId().equals(id));
        return removed ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}