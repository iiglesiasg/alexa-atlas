package alexa.service.serviceImpl;

import alexa.model.Companiero;
import alexa.service.EquiposAtla;

import java.util.Arrays;
import java.util.List;

public class EquiposAtlaImpl implements EquiposAtla {

    private  final static  List<Companiero> EQUIPO_PLATAFORMA = Arrays.asList(
            new Companiero("Alejandro"),
            new Companiero("Daniel"),
            new Companiero("Iñigo"),
            new Companiero("Jose")
    );

    private final static List<Companiero> EQUIPO_ARQUITECTURA = Arrays.asList(
            new Companiero("Ronald"),
            new Companiero("Dante"),
            new Companiero("Adrian"),
            new Companiero("Aldo"),
            new Companiero("Carlitos")
    );

    private final static List<Companiero> EQUIPO_JEFES = Arrays.asList(
            new Companiero("Antonio"),
            new Companiero("Jesus")
    );

    @Override
    public List<Companiero> getIntegrantes(String equipo) {
        return EQUIPO_PLATAFORMA;
    }
}
