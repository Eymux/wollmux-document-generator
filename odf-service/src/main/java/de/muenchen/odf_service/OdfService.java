package de.muenchen.odf_service;

import com.typesafe.config.ConfigFactory;

import akka.actor.ActorSystem;
import akka.actor.Props;

public class OdfService {
    public static void main(String... args) {
        ActorSystem system = ActorSystem.create("OdfService", ConfigFactory.load());
        system.actorOf(Props.create(OdfGeneratorActor.class), "OdfGeneratorActor");
    }
}