package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.user.ApplicationSaveUserService;
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

    @GetMapping("/users")
    public ResponseEntity<GenericResponseDTO> getAllProducts() {
        return ok(null);
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> createProduct(@Valid @RequestBody UserDTO userDTO) {
        return ok(service.execute(userDTO));
    }

}
