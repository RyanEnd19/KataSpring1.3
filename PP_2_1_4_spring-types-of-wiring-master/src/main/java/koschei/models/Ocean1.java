package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    public Ocean1(Island2 island2){
        this.island = island2;
    }

    @Override
    public String toString() {
        return ", на океане остров " + island.toString();
    }
}
