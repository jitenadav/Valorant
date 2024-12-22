package com.valorant.Valorant.restapi.web.controller;

import com.valorant.Valorant.model.User;
import com.valorant.Valorant.restapi.request.UserParams;
import com.valorant.Valorant.service.UserService;
import jakarta.inject.Singleton;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Singleton
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String getAllUsers() {
        return "All uyser";
    }

    @PostMapping
    public Response createUser(@Context HttpServletRequest httpServletRequest, @Context UriInfo uriInfo,
                               @NotNull @Valid UserParams loginParams) {
        User user = new User();
        user.setEmail(loginParams.getEmail());
        user.setFirstName(loginParams.getFirstName());
        user.setLastName(loginParams.getLastName());
        user.setHashedPassword(loginParams.getPassword());
        user = userService.createUser(user);
        return Response.ok().build();
    }
}
