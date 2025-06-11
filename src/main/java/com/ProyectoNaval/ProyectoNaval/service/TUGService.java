package com.ProyectoNaval.ProyectoNaval.service;

import com.ProyectoNaval.ProyectoNaval.model.Vessel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class TUGService {

  public Vessel getAsdTug3212Data() {
    Vessel tugData = new Vessel();

    // Información básica
    tugData.setTitle("ASD Tug 3212");
    tugData.setDescription(
        "The ASD Tug 3212 has excellent seakeeping behaviour, superb manoeuvrability and outstanding towing capabilities. Good seakeeping characteristics are achieved through a more slender waterline in combination with a relatively low wheelhouse, slope frames and bilge keels. These measures guarantee low accelerations which in turn, results in improved crew comfort and better stability.");

    // Características clave
    tugData.setKeyFeatures(Arrays.asList(
        "IMO Tier III compliant",
        "Fire-fighting",
        "Oil pollution control",
        "Aft winch",
        "Compact multi-purpose vessel",
        "Spacious working deck without obstacles",
        "Full vision bridge with Damen safety glass",
        "Damen Triton, remote monitoring system"));

    // Key Figures - Usando constructor de Lombok
    Vessel.Figuras keyFigures = new Vessel.Figuras("82", "32.70", "10", "13.5", "12.82");
    tugData.setKeyFigures(keyFigures);

    // Dimensiones
    Map<String, String> dimensions = new LinkedHashMap<>();
    dimensions.put("Length o.a.", "32.7 m");
    dimensions.put("Beam o.a.", "12.82 m");
    dimensions.put("Draught aft max", "5.90 m");
    dimensions.put("Displacement", "800 t");
    dimensions.put("Gross tonnage", "450 t");
    tugData.setDimensions(dimensions);

    // Performances
    Map<String, String> performances = new LinkedHashMap<>();
    performances.put("Bollard pull ahead", "82.4 t");
    performances.put("Bollard pull astern", "77.4 t");
    performances.put("Speed", "13.5 kn");
    tugData.setPerformances(performances);

    // Capacidades
    Map<String, String> capacities = new LinkedHashMap<>();
    capacities.put("Fuel oil", "148.3 m³");
    capacities.put("Fresh water", "15.4 m³");
    capacities.put("Sewage", "5.1 m³");
    capacities.put("Clean lubrication oil", "6.5 m³");
    capacities.put("Dirty lubrication oil", "7.8 m³");
    capacities.put("Bilge water", "6.5 m³");
    tugData.setCapacities(capacities);

    // Tugs de comparación - Usando constructor de Lombok
    tugData.setComparisonTugs(Arrays.asList(
        new Vessel.ComparacionTug("ASD Tug 3212", "82", "32.70", "10", "13.5", "12.82", "#"),
        new Vessel.ComparacionTug("ASD Tug 2813", "60", "28.57", "8", "13", "11.43",
            "/vessels/tugs/asd-tugs/asd-tug-2813"),
        new Vessel.ComparacionTug("ASD Tug 3214", "83", "27.59", "10", "12.7", "12.93",
            "/vessels/tugs/asd-tugs/asd-tug-3214")));

    // Artículos de noticias - Usando constructor de Lombok
    tugData.setNewsArticles(Arrays.asList(
        new Vessel.Noticias("4 Nov 2024",
            "Damen ASD Tug 3212 Multratug 36 is the newest addition to Multraship's fleet",
            "https://medialibrary.damen.com/transform/b743fadd-2caa-448d-a225-69aa265b5b69/512580-ASD-Tug-3212-MULTRATUG-36-Sea-trial-footage?io=transform:fill,width:750,height:542&quality=75"),
        new Vessel.Noticias("1 Jul 2024",
            "Damen Shipyards and Muller Dordrecht christen new Damen ASD Tug 3212",
            "https://medialibrary.damen.com/transform/687ef3df-36ad-4489-86ad-a5221c281007/damen-shipyards-and-muller-dordrecht-christen-new-damen-asd-tug-3212-teaser?io=transform:fill,width:750,height:542&quality=75"),
        new Vessel.Noticias("31 May 2024",
            "A new addition to the Multraship fleet with the naming of the Damen ASD Tug 3212 Multratug 35",
            "https://medialibrary.damen.com/transform/435a66dc-d725-40b1-ab5a-5c76c40b7333/a-new-addition-with-the-naming-of-the-damen-asd-tug-3212-multratug-35-teaser?io=transform:fill,width:750,height:542&quality=75"),
        new Vessel.Noticias("7 May 2021",
            "Additional news article",
            "https://medialibrary.damen.com/transform/f0c8c575-9a33-4516-a54e-f1dff76a4599/teaser?io=transform:fill,width:750,height:542&quality=75")));

    // URLs de imágenes
    tugData.setImages(Arrays.asList(
        "https://medialibrary.damen.com/transform/b743fadd-2caa-448d-a225-69aa265b5b69/512580-ASD-Tug-3212-MULTRATUG-36-Sea-trial-footage?io=transform:fill,width:750,height:542&quality=75",
        "https://medialibrary.damen.com/transform/687ef3df-36ad-4489-86ad-a5221c281007/damen-shipyards-and-muller-dordrecht-christen-new-damen-asd-tug-3212-teaser?io=transform:fill,width:750,height:542&quality=75"));

    // URL del configurador
    tugData.setConfiguratorUrl("https://vesselconfigurator.damen.com/configure/ASD%20Tug%203212");

    return tugData;
  }
}
