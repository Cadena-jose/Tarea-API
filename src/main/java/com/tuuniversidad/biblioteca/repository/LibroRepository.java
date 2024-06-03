package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(10l, "Harry Potter", "J.K Rowling", "Bloomsbury Publishing Scholastic", 1999));
        libros.add(new Libro(11l, "El Alquimista", "Paulo Coelho", "Editorial Planeta", 2016));
        libros.add(new Libro(12l, "Guerra de Titanes", "Desconocido", "Desconocido", 2012));
        libros.add(new Libro(13l, "Guerra de Clames", "\tDesconocido", "Desconocido", 2012));
    }
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
