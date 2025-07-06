package com.example.profiletiaraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class AktivitasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AktivitasScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AktivitasScreen() {
    val aktivitasList = listOf(
        "Belajar mandiri dan mengerjakan tugas",
        "Kuliah daring atau tatap muka",
        "Mendengarkan musik",
        "Menonton film atau drama",
        "Membaca buku",
        "Istirahat dan tidur"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Aktivitas Sehari-hari",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(aktivitasList) { aktivitas ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Text(
                        text = aktivitas,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAktivitasScreen() {
    AktivitasScreen()
}
