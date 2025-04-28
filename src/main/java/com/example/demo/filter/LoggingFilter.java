package com.example.demo.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest http = (HttpServletRequest) servletRequest;
        log.info("[Filter] Requête entrante -> "+http.getMethod()+" "+http.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("[Filter] Réponse traitée");
    }
}
