package pl.edu.pjwstk.mprgr36.booksmpr36.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Controller {
    @GetMapping("/sum")
    public long DisplaySum(){
        return 100;
    }
}
