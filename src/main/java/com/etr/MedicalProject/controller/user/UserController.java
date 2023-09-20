package com.etr.MedicalProject.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etr.MedicalProject.entity.user.User;
import com.etr.MedicalProject.service.user.UserService;

@RestController
@RequestMapping("/usr")
@CrossOrigin(origins="http://localhost:4200/")
public class UserController {
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/getdetails")
    public ResponseEntity<User> getUserDetailsByApptNameAndUserId(
            @RequestParam("apptname") String apptname,
            @RequestParam("userId") Long userId) {
        User user = userService.getUserDetailsByApptNameAndUserId(apptname, userId);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
