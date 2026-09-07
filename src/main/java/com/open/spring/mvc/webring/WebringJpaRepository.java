package com.open.spring.mvc.webring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WebringJpaRepository extends JpaRepository<Webring, Long> {
    // might want List<Webring> findByName(String name);
}
