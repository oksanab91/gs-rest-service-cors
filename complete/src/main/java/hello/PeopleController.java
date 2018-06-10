package hello;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class PeopleController {
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/{name}/people")
    public People peopleWithName(@PathVariable("name") String name) {
        System.out.println("==== in people ====");
        System.out.println(name);

        //should then wrap People List into response object which fits datatable  - similar to peopleData.json ??
        return new People("Tiger", "System Architect", "Edinburgh", "5421", 320.80);
    }
}
