package Components;

import Behaviours.IEngineStart;

public class Engine implements IEngineStart {

    private String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }

    public String start() {
        return "Vroooom";
    }

    public String getEngineType() {
        return engineType;
    }
}
