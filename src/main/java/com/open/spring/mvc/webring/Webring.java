package com.open.spring.mvc.webring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Webring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(
        mappedBy = "webring",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<WebringElement> elements = new ArrayList<>();
}
