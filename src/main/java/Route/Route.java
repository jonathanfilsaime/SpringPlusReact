package Route;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Route {

    @RequestMapping("/")
    public String home()
    {
        return "Hi";
    }
}
