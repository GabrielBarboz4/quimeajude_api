package com.quimeajude_api.repositories;

import com.quimeajude_api.models.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository <Element, Long> {
}
