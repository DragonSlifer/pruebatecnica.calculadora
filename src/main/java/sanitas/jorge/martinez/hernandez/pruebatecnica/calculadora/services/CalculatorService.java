package sanitas.jorge.martinez.hernandez.pruebatecnica.calculadora.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorService {
    public Float sub(float a, float b) {
        return a - b;
    }
}
