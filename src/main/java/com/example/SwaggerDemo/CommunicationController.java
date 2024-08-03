package com.example.SwaggerDemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommunicationController {

    @PostMapping("/sendVoice")
    public String sendVoice(
            @RequestParam String A,
            @RequestParam String B,
            @RequestParam int Duration,
            @RequestParam String Location
    ) {
        return String.format("A call was made from %s to %s for %d minutes in %s.", A, B, Duration, Location);
    }

    @PostMapping("/sendSms")
    public String sendSms(
            @RequestParam String A,
            @RequestParam String B,
            @RequestParam String Location
    ) {
        return String.format("An SMS was sent from %s to %s in %s.", A, B, Location);
    }

    @PostMapping("/sendData")
    public String sendData(
            @RequestParam String A,
            @RequestParam int mb,
            @RequestParam String RG,
            @RequestParam String Location
    ) {
        return String.format("Data usage from %s: %d MB in %s with rating group %s.", A, mb, Location, RG);
    }
}
