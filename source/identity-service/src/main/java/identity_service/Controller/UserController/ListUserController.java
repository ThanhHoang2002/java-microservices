package identity_service.Controller.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class ListUserController {
    
    @GetMapping("/users")
    public String listUsers() {
        String message = "List user zxcxzc zzzz zxcxzc ssssss";
        return message;
    }
}
