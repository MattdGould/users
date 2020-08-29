package com.mattg.users.controller;

import com.mattg.users.dto.UserResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Operation(summary = "Finds all users")
    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserResponseDto> getAllUsers() {
        LOGGER.info("entering /users");
        //List<DwpUser> usersNearLondon = getUsersNearLondon(UserResultService.MILES_IN_LONDON_CATCHMENT);
        //LOGGER.info("Find all users,  Found Size: " + usersNearLondon.size());
        return null;
    }

    @Operation(summary = "Finds all users with given id")
    @GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDto getUserWithId(@PathVariable(value="id") String id) {
        LOGGER.info("entering /users/London");
        //List<DwpUser> usersNearLondon = userResultService.getUsersNearLondon(distance);
        LOGGER.info("Users with id " + id);
        return null;
    }
}
