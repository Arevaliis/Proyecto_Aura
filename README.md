# Proyecto Aura

Proyecto Aura es una aplicación de bienestar digital que busca simplicidad y accesibilidad. 

---
## ¿Porque el uso de JavaFX?

El proyecto está implementado en Java 23, utilizando JavaFX 23 como framework de interfaz gráfica y Maven como herramienta de gestión de dependencias y construcción. Actualmente el proyecto se encuentra en la Fase 1 (Inicialización del Prototipo), cuyo objetivo es desplegar una primera versión funcional en entornos de escritorio. 

La selección de JavaFX responde a los siguientes criterios técnicos:

- Integración directa con el ecosistema Java.

- Separación  de responsabilidades: FXML (vista) y Controller (lógica).

- Uso de CSS, permitiendo separar el diseño de la estructura.

- Compatibilidad con Scene Builder para la reproducción del diseño Hi-Fi.

---
## Crear el Proyecto Base

Se utilizó un **Maven Archetype** para generar la estructura inicial del proyecto:

```
mvn archetype:generate -DarchetypeGroupId=org.openjfx -DarchetypeArtifactId=javafx-archetype-simple -DarchetypeVersion=0.0.6 -DgroupId=ProyectoAura -DartifactId=Aura -Dversion=1.0-SNAPSHOT -Dpackage=app -Djavafx-version=23.0.2
```

---
## Tecnologías

- Java 23
- JavaFX 23.0.2
- Maven
- FXML
- CSS
---

## Ejecutar el Programa

Una vez creado el proyecto, para compilar y ejecutar la aplicación utiliza el siguiente comando desde la raíz del proyecto:

```
mvn clean javafx:run
```

#### ¿Qué hace este comando?

- `clean` → elimina compilaciones anteriores.
- `javafx:run` → compila el proyecto y ejecuta la clase principal configurada en el `pom.xml`.

---