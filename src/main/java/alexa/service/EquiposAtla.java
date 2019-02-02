package alexa.service;

import alexa.model.Companiero;

import java.util.List;

public interface EquiposAtla {

    List<Companiero> getIntegrantes(String equipo);
}
