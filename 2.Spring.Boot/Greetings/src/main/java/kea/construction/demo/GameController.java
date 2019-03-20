package kea.construction.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GameController {


    @RequestMapping(value = "/game/{weapon}", method = RequestMethod.GET)
    public String whoWin(@PathVariable String weapon){
        String[] weapons = new String[3];
        weapons[0] = "sten";
        weapons[1] = "saks";
        weapons[2] = "papir";
        int idx = new Random().nextInt(weapons.length);
        String random = (weapons[idx]);
        idx = new Random().nextInt(weapons.length);
        switch (weapon){
            case "sten":

                if(random.equals("sten")){
                    return "spil igen";
                }
                if(random.equals("saks")){
                    return "du vandt";
                }
                if(random.equals("papir")){
                    return "du tabte";
                }

            case "saks":

                if(random.equals("saks")){
                    return "spil igen";
                }
                if(random.equals("papir")){
                    return "du vandt";
                }
                if(random.equals("sten")){
                    return "du tabte";
                }

            case "papir":
                if(random.equals("papir")){
                    return "spil igen";
                }
                if(random.equals("sten")){
                    return "du vandt";
                }
                if(random.equals("saks")){
                    return "du tabte";
                }

            default: return "vælg et våben";
        }
    }


}
