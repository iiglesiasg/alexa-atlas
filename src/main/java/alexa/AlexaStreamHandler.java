package alexa;

import alexa.handlers.IntegrantesEquiposRequestHandler;
import alexa.handlers.LaunchRequestHandler;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class AlexaStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Grupo de conocimiento";

    private static Skill getSkill() {
        return Skills
                .custom()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new IntegrantesEquiposRequestHandler())
                .build();
    }

    public AlexaStreamHandler(){
        super(getSkill());
    }
}
