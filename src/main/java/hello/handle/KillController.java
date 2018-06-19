package hello.handle;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KillController {
    @Cacheable
//    @RateLimiting(limit = "10/1s", scope = {IP, USER})
    @RequestMapping(value = "/proxy/users/{id}", method = RequestMethod.GET)
    public Object info(@PathVariable int id) {
        return id;
    }
}
