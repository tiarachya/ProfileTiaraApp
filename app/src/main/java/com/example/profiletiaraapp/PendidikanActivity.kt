package com.example.profiletiaraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PendidikanActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PendidikanScreen()
        }
    }
}

@Composable
fun PendidikanScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Riwayat Pendidikan",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        PendidikanCard(
            text = "SDIT Ash-Shibgoh (2010–2016)",
            imageRes = R.drawable.sd
        )

        PendidikanCard(
            text = "MTs. Nurul Ilmi Cikupa (2016–2019)",
            imageRes = R.drawable.smp
        )

        PendidikanCard(
            text = "SMK Kesehatan Utama Insani (2019–2022)",
            imageRes = R.drawable.smk
        )

        PendidikanCard(
            text = "Universitas Yosonegoro Madani – Ilmu Komputer (2022–Sekarang)",
            imageRes = R.drawable.kuliah
        )
    }
}

@Composable
fun PendidikanCard(text: String, imageRes: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .height(160.dp) // Lebih besar
            .clip(RoundedCornerShape(12.dp))
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(Color(0x99000000)) // semi-transparent overlay
        )
        Text(
            text = text,
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPendidikan() {
    PendidikanScreen()
}
