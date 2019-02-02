package alexa.handlers;

import alexa.AlexaStreamHandler;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }
    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Bienvenido a \"Atlas\". Dime Dios, en que te puedo ayudar?.";
        return input.getResponseBuilder()
                .withSimpleCard(AlexaStreamHandler.SKILL_TITLE, speechText)
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
