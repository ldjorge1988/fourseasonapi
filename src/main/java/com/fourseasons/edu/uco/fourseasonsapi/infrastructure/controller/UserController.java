package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.user.ApplicationFindUserService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.user.ApplicationSaveUserService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.user.ApplicationUserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class UserController {

    private final ApplicationSaveUserService service;

    private final ApplicationUserListService userListService;

    private final ApplicationFindUserService userFindService;

    @GetMapping("/users")
    public ResponseEntity<GenericResponseDTO> getAllUsers() {
        return ok(userListService.execute());
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDTO) {
        return ok(service.execute(userDTO));
    }

    @GetMapping("/user/{name}")
    public ResponseEntity<UserDTO> getUserByName(@PathVariable(name = "name") String name) {
        return ok(userFindService.findUserByName(name));
    }
}
