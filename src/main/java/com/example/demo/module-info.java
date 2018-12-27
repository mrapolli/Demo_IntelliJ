module cancelamentoReservaAereo {

    requires spring.boot;
    requires spring.beans;
    requires spring.core;
    requires spring.web;
    requires spring.webmvc;
    requires spring.boot.autoconfigure;
    requires spring.context;

    requires spring.security.core;
    requires spring.security.config;
    requires spring.security.web;


    requires tomcat.embed.core;
    requires java.sql;

    requires com.fasterxml.jackson.databind;
    requires nimbus.jose.jwt;

    requires log4j.api;
    requires commons.io;
    requires java.net.http;

    requires com.tngtech.archunit;
    requires org.junit.jupiter.api;
    requires spring.cloud.context;
}

