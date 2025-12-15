# 📱 Plantilla Base Android Compose

Proyecto base de Android creado con **Android Studio** utilizando **Jetpack Compose** como sistema de interfaz declarativa.  
Sirve como punto de partida para prácticas y proyectos modernos de desarrollo Android.

---

## 🧩 Información del proyecto

- **Nombre:** plantillaBaseCompose
- **Lenguaje:** Kotlin
- **UI:** Jetpack Compose
- **Tema:** Material 3
- **IDE:** Android Studio
- **SDK mínimo:** API 21+
- **Arquitectura:** ComponentActivity + Composables

---

## 📂 Estructura del proyecto

```text
app/
 ├─ manifests/
 │   └─ AndroidManifest.xml
 │
 ├─ kotlin-java/
 │   └─ com.example.plantillabasecompose/
 │       ├─ MainActivity.kt
 │       └─ ui.theme/
 │           ├─ Color.kt
 │           ├─ Theme.kt
 │           └─ Type.kt
 │
 ├─ res/
 │   ├─ drawable/
 │   │   ├─ ic_launcher_background.xml
 │   │   └─ ic_launcher_foreground.xml
 │   ├─ mipmap/
 │   ├─ values/
 │   │   ├─ colors.xml
 │   │   ├─ strings.xml
 │   │   └─ themes.xml
 │   └─ xml/
 │       ├─ backup_rules.xml
 │       └─ data_extraction_rules.xml
 │
 └─ Gradle Scripts/
````

---

## 🧭 Componentes principales

### 🔹 MainActivity

* Extiende de `ComponentActivity`
* Usa `setContent {}` para definir la UI
* Aplica el tema personalizado del proyecto
* Carga la pantalla principal mediante un composable

### 🔹 Composable `PantallaPrincipal`

* Función composable principal
* Ejemplo de:

  * Estado con `remember` y `mutableStateOf`
  * Layout `Column`
  * Modificadores (`padding`, `fillMaxSize`, alineación)
  * Texto dinámico

---

## ⚙️ Tecnologías usadas

* Kotlin
* Jetpack Compose
* Material 3
* State management (`remember`)
* Gradle Kotlin DSL (`.kts`)

---

## ▶️ Ejecución del proyecto

1. Abrir el proyecto en **Android Studio**
2. Esperar a que finalice la sincronización de Gradle
3. Seleccionar emulador o dispositivo físico
4. Ejecutar con **Run ▶**

---

## 🧪 Uso educativo

Proyecto diseñado como **plantilla base** para:

* DAM / DAW
* Introducción a Jetpack Compose
* Comparar UI declarativa vs XML
* Prácticas de layouts y estado
* Aprender Material Design moderno

---

## 🚀 Posibles ampliaciones

* Navegación con `NavHost`
* Múltiples pantallas composables
* ViewModel + StateFlow
* Animaciones
* Consumo de APIs REST
* Comparativa con XML (proyecto híbrido)

---

## 🧑‍💻 Autor

* **Autor:** *Alejandro*
* **Curso:** DAM / DAW
* **Módulo:** Programació multimèdia / Android
* **Centro:** *El puig castellar*

---

## 📄 Licencia

Proyecto de uso educativo.
Libre para modificar y reutilizar con fines formativos.