package com.quimeajude_api.services;

import com.quimeajude_api.models.Element;
import com.quimeajude_api.repositories.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementService {

    @Autowired
    private ElementRepository repository;

    public Element setNewElement (Element element) {
        return repository.save(element);
    }
}
