package io.bootify.banco_mongo_d_b.service;

import io.bootify.banco_mongo_d_b.domain.Libro;
import io.bootify.banco_mongo_d_b.model.LibroDTO;
import io.bootify.banco_mongo_d_b.repos.LibroRepository;
import io.bootify.banco_mongo_d_b.util.NotFoundException;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(final LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<LibroDTO> findAll() {
        final List<Libro> libroes = libroRepository.findAll(Sort.by("id"));
        return libroes.stream()
                .map(libro -> mapToDTO(libro, new LibroDTO()))
                .toList();
    }

    public LibroDTO get(final Long id) {
        return libroRepository.findById(id)
                .map(libro -> mapToDTO(libro, new LibroDTO()))
                .orElseThrow(NotFoundException::new);
    }

    public Long create(final LibroDTO libroDTO) {
        final Libro libro = new Libro();
        mapToEntity(libroDTO, libro);
        return libroRepository.save(libro).getId();
    }

    public void update(final Long id, final LibroDTO libroDTO) {
        final Libro libro = libroRepository.findById(id)
                .orElseThrow(NotFoundException::new);
        mapToEntity(libroDTO, libro);
        libroRepository.save(libro);
    }

    public void delete(final Long id) {
        libroRepository.deleteById(id);
    }

    private LibroDTO mapToDTO(final Libro libro, final LibroDTO libroDTO) {
        libroDTO.setId(libro.getId());
        libroDTO.setNombre(libro.getNombre());
        libroDTO.setAutor(libro.getAutor());
        libroDTO.setTitulo(libro.getTitulo());
        return libroDTO;
    }

    private Libro mapToEntity(final LibroDTO libroDTO, final Libro libro) {
        libro.setNombre(libroDTO.getNombre());
        libro.setAutor(libroDTO.getAutor());
        libro.setTitulo(libroDTO.getTitulo());
        return libro;
    }

}
