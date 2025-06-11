package com.ProyectoNaval.ProyectoNaval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoNaval.ProyectoNaval.model.Vessel;
import com.ProyectoNaval.ProyectoNaval.service.TUGService;

@RestController
@RequestMapping("/api/vessels/tugs")
@CrossOrigin(origins = "*") // Permite todas las origins para desarrollo
public class TUGControlador {

  @Autowired
  private TUGService tugService;

  /**
   * Endpoint para obtener la información del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212
   */
  @GetMapping("/asd-tug-3212")
  public ResponseEntity<Vessel> getAsdTug3212() {
    try {
      System.out.println("Request received for ASD Tug 3212"); // Log para debugging
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData);
    } catch (Exception e) {
      System.err.println("Error in getAsdTug3212: " + e.getMessage());
      e.printStackTrace();
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint alternativo más específico
   * GET /api/vessels/tugs/3212
   */
  @GetMapping("/3212")
  public ResponseEntity<Vessel> getTug3212() {
    return getAsdTug3212();
  }

  /**
   * Endpoint para obtener solo las figuras clave del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/key-figures
   */
  @GetMapping("/asd-tug-3212/key-figures")
  public ResponseEntity<Vessel.Figuras> getAsdTug3212KeyFigures() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getKeyFigures());
    } catch (Exception e) {
      System.err.println("Error in getAsdTug3212KeyFigures: " + e.getMessage());
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint health check para verificar que el servicio está funcionando
   * GET /api/vessels/tugs/health
   */
  @GetMapping("/health")
  public ResponseEntity<String> healthCheck() {
    return ResponseEntity.ok("TUG Service is running!");
  }

  /**
   * Endpoint de prueba para debugging
   * GET /api/vessels/tugs/test
   */
  @GetMapping("/test")
  public ResponseEntity<String> testEndpoint() {
    return ResponseEntity.ok("TUG Controller is working! Current time: " + System.currentTimeMillis());
  }
}