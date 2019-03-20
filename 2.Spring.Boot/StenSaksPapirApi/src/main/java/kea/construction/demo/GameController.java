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
        new Random().nextInt(weapons.length);

        switch (weapon){
            case "sten":

                if(random.equals("sten")){
                    return "du valgte: sten     computeren valgte: " + random + " spil igen";
                }
                else if(random.equals("saks")){
                    return "du valgte: sten     computeren valgte: " + random + " du vandt";
                }
                else{
                    return "du valgte: sten     computeren valgte: " + random + " du tabte";
                }

            case "saks":

                if(random.equals("saks")){
                    return "du valgte: saks     computeren valgte: " + random + " spil igen";
                }
                if(random.equals("papir")){
                    return "du valgte: saks     computeren valgte: " + random + " du vandt";
                }
                if(random.equals("sten")){
                    return "du valgte: saks     computeren valgte: " + random + " du tabte";
                }

            case "papir":
                if(random.equals("papir")){
                    return "du valgte: papir     computeren valgte: " + random + " spil igen";
                }
                if(random.equals("sten")){
                    return "du valgte: papir     computeren valgte: " + random + " du vandt";
                }
                if(random.equals("saks")){
                    return "du valgte: papir     computeren valgte: " + random + " du tabte";
                }

            default: return "vælg et våben";
        }
    }


}

