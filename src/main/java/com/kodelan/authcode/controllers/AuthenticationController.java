package com.kodelan.authcode.controllers;


import com.kodelan.authcode.dtos.AuthenticationDto;
import com.kodelan.authcode.dtos.AuthenticationResponseDto;
import com.kodelan.authcode.dtos.RegistrationDto;
import com.kodelan.authcode.services.AuthenticationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {
    private final AuthenticationService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(
            @RequestBody @Valid RegistrationDto registrationDto
    ) throws MessagingException {
        service.register(registrationDto);
        return ResponseEntity.accepted().build();
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDto> authenticate(
            @RequestBody AuthenticationDto authenticationDto
    ) {
        return ResponseEntity.ok(service.authenticate(authenticationDto));
    }


    @GetMapping("/activate-account")
    public void confirm(
            @RequestParam String token
    ) throws MessagingException {
        service.activateAccount(token);
    }

}
