package com.klef.jfsd.springbootclg.config;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.klef.jfsd.springbootclg.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class customAuthenticationsucesshandler implements AuthenticationSuccessHandler {
		@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                Authentication authentication) throws IOException, ServletException {
// Retrieve username and password from the authenticated principal
User user = (User) authentication.getPrincipal();
String username = user.getEmail();
//String password = user.getPassword();

// Check if the credentials match the admin's
if ("admin1@gmail.com".equals(username)) {
response.sendRedirect("/home"); // Redirect to admin module
} else {
response.sendRedirect("/index"); // Redirect to user module
}
}
}