package br.grupointegrado.jucemard.todoproject.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jucemar Dias on 28/03/2017.
 */

public enum Categoria {

    Faculdade(1), Trabalho(2), Outros(3);

    private int id;

    private static Map<Integer, Categoria> categorias = new HashMap<>();

    static {
        for (Categoria c : Categoria.values()) {
            categorias.put(c.getId(), c);
        }
    }

    private Categoria (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Categoria getCategoria (int id) {
        return categorias.get(id);
    }

}
