package at.refugeescode.Mp17_TheThievesDen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ThievesEndPoint {

    @GetMapping
    String uncover(){
        return "The tresures:Gold,Money, Diamonds";
    }
}
