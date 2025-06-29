package com.example.profiletiaraapp

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

class BiodataActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BiodataScreen()
        }
    }
}

@Composable
fun BiodataScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Foto Profil Tengah
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.foto_tiara),
                contentDescription = "Foto Tiara",
                modifier = Modifier
                    .size(160.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Data Biodata Rapi Kolom Kiri
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Nama",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "Tiara Cahya Kurniawati",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Tanggal Lahir",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "28 September 2004",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Email",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "tiara@email.com",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Alamat",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "Kp. Kadu Sukmulya RT/RW 10/04, Kec. Cikupa, Kab. Tangerang-Banten, 15710",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Deskripsi",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "Mahasiswi Ilmu Komputer di Universitas Yatsi Madani.",
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBiodata() {
    BiodataScreen()
}


