package org.utopia.thor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.utopia.thor.entity.User;
import org.utopia.thor.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huazhu
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/user")
    public List<User> getUsers() {
        return userService.list();
    }
}
