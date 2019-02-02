package alexa.handlers;

import alexa.AlexaStreamHandler;
import alexa.model.Companiero;
import alexa.service.EquiposAtla;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntegrantesEquiposRequestHandler implements RequestHandler {

    EquiposAtla equipos;

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("IntegrantesEquipos"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //List<Companiero> compis = new ArrayList<Companiero>();
        //input.getRequest();
        String kk = "";
        if (input.matches(Predicates.slotValue("equipo", "plataforma"))) {
            kk = "Alejandro, Daniel, Jose y Dios.";
        }
        else if (input.matches(Predicates.slotValue("equipo", "infra"))) {
            kk = "Aldo, Adrian y Jesus";
        }
        else if (input.matches(Predicates.slotValue("equipo", "framework"))) {
            kk = "Dante, Carlitos y Ronald";
        }

        String speechText = "La mesa esta formada por: "+kk;

        //for(Companiero c : compis) speechText = speechText + " " + c.getNombre();

        return input.getResponseBuilder()
                .withSpeech(speechText.toString())
                .withSimpleCard(AlexaStreamHandler.SKILL_TITLE, speechText.toString())
                .withShouldEndSession(true)
                .build();
    }
}