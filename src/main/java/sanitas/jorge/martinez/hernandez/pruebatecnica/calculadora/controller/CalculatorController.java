package sanitas.jorge.martinez.hernandez.pruebatecnica.calculadora.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sanitas.jorge.martinez.hernandez.pruebatecnica.calculadora.services.CalculatorService;

import java.net.http.HttpResponse;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private static CalculatorService calculatorService;

    @GetMapping(value = "/add")
    public ResponseEntity<Float> add (float a, float b){
        
        return ResponseEntity
                .status(HttpStatus.NOT_IMPLEMENTED)
                .build();
    }

    @GetMapping(value = "/sub")
    public ResponseEntity<Float> sub (float a, float b){

        return ResponseEntity
                .status(HttpStatus.NOT_IMPLEMENTED)
                .build();
    }
}
