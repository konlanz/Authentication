package com.kodelan.authcode.services;

import com.kodelan.authcode.dtos.AuthenticationDto;
import com.kodelan.authcode.dtos.AuthenticationResponseDto;
import com.kodelan.authcode.dtos.RegistrationDto;
import jakarta.mail.MessagingException;

public interface AuthenticationService {
    public void register(RegistrationDto registrationDto) throws MessagingException;

    public AuthenticationResponseDto authenticate(AuthenticationDto authenticationDto);

    public void activateAccount(String token) throws MessagingException;
}
