package kea.construction.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String greetings(@RequestParam(value = "name", required = false) String name){
        if (name == null){
            return "Skriv dit navn";
        }else{
            System.out.println(name);
            return "Hello " + name;
        }

    }
    @RequestMapping(value = "/greetings/{personId}", method = RequestMethod.GET)
    public String mingleWithPerson(@PathVariable Integer personId){
        switch (personId){
            case 0: return "Magnus";

            case 1: return "Victor";

            case 2: return "Jacob";

            default: return "no name";
        }
    }

    @RequestMapping(value = "/getBody", method = RequestMethod.POST)
    public String getBody(@RequestBody String body){
        return body;
    }
}

