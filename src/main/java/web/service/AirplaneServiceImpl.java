package web.service;

import web.model.Airplane;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> getAllAirplanes() {
        return List.of(
                new Airplane(1, "Boeing 747", "747", 416, "USA", 4),
                new Airplane(2, "Airbus A380", "A380", 500, "France", 4),
                new Airplane(3, "Concorde", "Concorde", 128, "UK/France", 4),
                new Airplane(4, "Antonov An-225", "An-225", 6, "Ukraine", 6),
                new Airplane(5, "Boeing 777", "777", 396, "USA", 2),
                new Airplane(6, "Airbus A320", "A320", 150, "France", 2),
                new Airplane(7, "Cessna 172", "172", 3, "USA", 1)
        );
    }
}
