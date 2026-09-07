package com.open.spring.mvc.webring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/webring")
public class WebringApiController {
    @Autowired
    private WebringJpaRepository repository;

    // GET members of webring
    @GetMapping("/")
    public ResponseEntity<List<Webring>> getMembers() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
