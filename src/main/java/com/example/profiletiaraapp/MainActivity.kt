package com.example.profiletiaraapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilSayaScreen(
                onBiodataClick = {
                    startActivity(Intent(this, BiodataActivity::class.java))
                },
                onPendidikanClick = {
                    startActivity(Intent(this, PendidikanActivity::class.java))
                },
                onHobiClick = {
                    startActivity(Intent(this, HobiActivity::class.java))
                }
            )
        }
    }
}

@Composable
fun ProfilSayaScreen(
    onBiodataClick: () -> Unit,
    onPendidikanClick: () -> Unit,
    onHobiClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto Profil
        Image(
            painter = painterResource(id = R.drawable.foto_tiara),
            contentDescription = "Foto Tiara",
            modifier = Modifier
                .size(160.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nama
        Text(
            text = "Tiara Cahya",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Deskripsi
        Text(
            text = "Mahasiswi Ilmu Komputer di Universitas Yatsi Madani.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Tombol Biodata
        Button(
            onClick = onBiodataClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Biodata")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Tombol Riwayat Pendidikan
        Button(
            onClick = onPendidikanClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Riwayat Pendidikan")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Tombol Hobi
        Button(
            onClick = onHobiClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Hobi")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfilSaya() {
    ProfilSayaScreen(
        onBiodataClick = {},
        onPendidikanClick = {},
        onHobiClick = {}
    )
}
