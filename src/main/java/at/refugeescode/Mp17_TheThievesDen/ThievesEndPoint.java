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

/*Mp17 - The Thieves' Den
        The Thieves Den web application has one single page displaying all the treasures that the thievery organization has been robbing for decades.
         However, its access is not that easy, for it is secured tightly
         and it won’t be shown unless the user “alibaba” logs in with the password “open sesame”.*/

