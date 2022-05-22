package com.ibm.academia.restapi.items.modelo.servicios;

import com.ibm.academia.restapi.items.modelo.entidades.Articulo;

import java.util.List;

public interface ItemDAO {

    public List<Articulo> buscarTodos();
    public Articulo buscarPorId(Long id, Integer cantidad);
}
