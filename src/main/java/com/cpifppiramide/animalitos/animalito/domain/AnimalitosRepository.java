package com.cpifppiramide.animalitos.animalito.domain;

import java.util.List;

public interface AnimalitosRepository {

    public List<Animalito> getAll();
    public Animalito get(Integer id);
}
