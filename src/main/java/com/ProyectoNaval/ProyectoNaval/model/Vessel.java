// Vessel.java - Modelo principal para embarcaciones
package com.ProyectoNaval.ProyectoNaval.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Vessel {
  @JsonProperty("titulo")
  private String title;

  @JsonProperty("descripcion")
  private String description;

  @JsonProperty("caracteristicas")
  private List<String> keyFeatures;

  @JsonProperty("figuras")
  private Figuras figuras;

  @JsonProperty("dimensiones")
  private Map<String, String> dimensions;

  @JsonProperty("rendimientos")
  private Map<String, String> performances;

  @JsonProperty("capacidades")
  private Map<String, String> capacities;

  @JsonProperty("comparaciones")
  private List<ComparacionTug> comparacionTugs;

  @JsonProperty("noticias")
  private List<Noticias> noticias;

  @JsonProperty("imagenes")
  private List<String> images;

  @JsonProperty("url_configurador")
  private String configuratorUrl;

  // ELIMINADO: Constructor manual duplicado
  // Las anotaciones de Lombok ya generan todos los constructors necesarios

  // Getters y Setters manuales (aunque @Data ya los genera)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getKeyFeatures() {
    return keyFeatures;
  }

  public void setKeyFeatures(List<String> keyFeatures) {
    this.keyFeatures = keyFeatures;
  }

  public Figuras getKeyFigures() {
    return figuras;
  }

  public void setKeyFigures(Figuras figuras) {
    this.figuras = figuras;
  }

  public Map<String, String> getDimensions() {
    return dimensions;
  }

  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }

  public Map<String, String> getPerformances() {
    return performances;
  }

  public void setPerformances(Map<String, String> performances) {
    this.performances = performances;
  }

  public Map<String, String> getCapacities() {
    return capacities;
  }

  public void setCapacities(Map<String, String> capacities) {
    this.capacities = capacities;
  }

  public List<ComparacionTug> getComparisonTugs() {
    return comparacionTugs;
  }

  public void setComparisonTugs(List<ComparacionTug> comparacionTugs) {
    this.comparacionTugs = comparacionTugs;
  }

  public List<Noticias> getNewsArticles() {
    return noticias;
  }

  public void setNewsArticles(List<Noticias> noticias) {
    this.noticias = noticias;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public String getConfiguratorUrl() {
    return configuratorUrl;
  }

  public void setConfiguratorUrl(String configuratorUrl) {
    this.configuratorUrl = configuratorUrl;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Figuras {
    @JsonProperty("barco")
    private String bollardPull;

    @JsonProperty("largo")
    private String length;

    @JsonProperty("capacidad_maxima_crew")
    private String maxCrew;

    @JsonProperty("velocidad")
    private String speed;

    @JsonProperty("beam")
    private String beam;

    // Getters y Setters manuales (aunque @Data ya los genera)
    public String getBollardPull() {
      return bollardPull;
    }

    public void setBollardPull(String bollardPull) {
      this.bollardPull = bollardPull;
    }

    public String getLength() {
      return length;
    }

    public void setLength(String length) {
      this.length = length;
    }

    public String getMaxCrew() {
      return maxCrew;
    }

    public void setMaxCrew(String maxCrew) {
      this.maxCrew = maxCrew;
    }

    public String getSpeed() {
      return speed;
    }

    public void setSpeed(String speed) {
      this.speed = speed;
    }

    public String getBeam() {
      return beam;
    }

    public void setBeam(String beam) {
      this.beam = beam;
    }
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ComparacionTug {
    @JsonProperty("nombre")
    private String name;

    @JsonProperty("barco")
    private String bollardPull;

    @JsonProperty("largo")
    private String length;

    @JsonProperty("capacidad_maxima_crew")
    private String maxCrew;

    @JsonProperty("velocidad")
    private String speed;

    @JsonProperty("beam")
    private String beam;

    @JsonProperty("url")
    private String url;

    // Constructor eliminado - @AllArgsConstructor ya lo genera

    // Getters y Setters manuales (aunque @Data ya los genera)
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getBollardPull() {
      return bollardPull;
    }

    public void setBollardPull(String bollardPull) {
      this.bollardPull = bollardPull;
    }

    public String getLength() {
      return length;
    }

    public void setLength(String length) {
      this.length = length;
    }

    public String getMaxCrew() {
      return maxCrew;
    }

    public void setMaxCrew(String maxCrew) {
      this.maxCrew = maxCrew;
    }

    public String getSpeed() {
      return speed;
    }

    public void setSpeed(String speed) {
      this.speed = speed;
    }

    public String getBeam() {
      return beam;
    }

    public void setBeam(String beam) {
      this.beam = beam;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Noticias {
    @JsonProperty("fecha")
    private String date;

    @JsonProperty("titulo")
    private String title;

    @JsonProperty("image_url")
    private String imageUrl;

    // Constructor eliminado - @AllArgsConstructor ya lo genera

    // Getters y Setters manuales (aunque @Data ya los genera)
    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getImageUrl() {
      return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
    }
  }
}
