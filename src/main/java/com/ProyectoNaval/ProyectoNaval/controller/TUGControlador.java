package com.ProyectoNaval.ProyectoNaval.controller;

import com.ProyectoNaval.ProyectoNaval.model.Vessel;
import com.ProyectoNaval.ProyectoNaval.service.TUGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vessels/tugs")
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
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData);
    } catch (Exception e) {
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
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener solo las dimensiones del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/dimensions
   */
  @GetMapping("/asd-tug-3212/dimensions")
  public ResponseEntity<?> getAsdTug3212Dimensions() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getDimensions());
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener solo las performances del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/performances
   */
  @GetMapping("/asd-tug-3212/performances")
  public ResponseEntity<?> getAsdTug3212Performances() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getPerformances());
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener las capacidades del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/capacities
   */
  @GetMapping("/asd-tug-3212/capacities")
  public ResponseEntity<?> getAsdTug3212Capacities() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getCapacities());
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener las comparaciones con otros tugs
   * GET /api/vessels/tugs/asd-tug-3212/comparisons
   */
  @GetMapping("/asd-tug-3212/comparisons")
  public ResponseEntity<?> getAsdTug3212Comparisons() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getComparisonTugs());
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener las noticias del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/news
   */
  @GetMapping("/asd-tug-3212/news")
  public ResponseEntity<?> getAsdTug3212News() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getNewsArticles());
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  /**
   * Endpoint para obtener las imágenes del ASD Tug 3212
   * GET /api/vessels/tugs/asd-tug-3212/images
   */
  @GetMapping("/asd-tug-3212/images")
  public ResponseEntity<?> getAsdTug3212Images() {
    try {
      Vessel tugData = tugService.getAsdTug3212Data();
      return ResponseEntity.ok(tugData.getImages());
    } catch (Exception e) {
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
}
