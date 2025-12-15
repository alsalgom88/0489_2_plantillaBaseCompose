package com.example.plantillabasecompose
// Defineix el paquet del projecte (nom lògic que agrupa les classes)

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*    // Llibreria Material 3 (botons, textos, etc.)
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantillabasecompose.ui.theme.PlantillaBaseComposeTheme
// Importem el tema personalitzat del projecte

/**
 * Classe principal de l'aplicació.
 * ComponentActivity és la base de totes les activitats que utilitzen Jetpack Compose.
 */
class MainActivity : ComponentActivity() {

    /**
     * Funció que s'executa en crear l'activitat.
     * Aquí no s'utilitza setContentView(XML), sinó setContent { ... } amb codi Compose.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // PlantillaBaseComposeTheme defineix els colors, tipografies i estils globals
            PlantillaBaseComposeTheme {

                // Surface crea una "base visual" amb el color de fons del tema
                Surface(
                    modifier = Modifier.fillMaxSize(), // ocupa tota la pantalla
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Cridem a la funció composable principal (la interfície d’usuari)
                    PantallaPrincipal()
                }
            }
        }
    }
}

/**
 * Funció composable: és una funció que dibuixa UI declarativament.
 * Aquí es defineix el contingut de la pantalla.
 */
@Composable
fun PantallaPrincipal() {

    // "remember" guarda l'estat (com el text) dins del cicle de vida del composable
    var nom by remember { mutableStateOf("") }

    // Column = layout vertical
    Column(
        modifier = Modifier
            .fillMaxSize()       // ocupa tot l’espai disponible
            .padding(24.dp),     // marges interiors
        verticalArrangement = Arrangement.Center,    // centra verticalment
        horizontalAlignment = Alignment.CenterHorizontally // centra horitzontalment
    ) {
        // Títol
        Text(
            text = "Benvingut a Jetpack Compose!",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp)) // espai entre elements

        // Camp de text (TextField) per introduir el nom
        OutlinedTextField(
            value = nom,                  // valor actual del text
            onValueChange = { nom = it }, // què fer quan l'usuari escriu
            label = { Text("Escriu el teu nom") } // etiqueta sobre el camp
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Botó per mostrar un missatge
        Button(
            onClick = { /* No fem res aquí directament, el text canvia automàticament */ }
        ) {
            // El text canvia segons si s’ha introduït o no un nom
            Text(text = if (nom.isNotEmpty()) "Hola, $nom!" else "Saluda’m")
        }
    }
}

/**
 * Funció Preview: permet veure la UI sense executar l’app.
 * Només funciona a Android Studio (no en el dispositiu real).
 */
@Preview(showBackground = true)
@Composable
fun PantallaPrincipalPreview() {
    PlantillaBaseComposeTheme {
        PantallaPrincipal()
    }
}