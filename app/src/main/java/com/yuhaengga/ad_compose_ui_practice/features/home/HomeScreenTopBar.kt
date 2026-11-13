package com.yuhaengga.ad_compose_ui_practice.features.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenTopBar(
    modifier: Modifier = Modifier,
    userName: String,
    profileImage: String?
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(horizontal = 20.dp, vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Good\nMorning\n${userName}",
            fontSize = 40.sp,
            lineHeight = 48.sp,
            modifier= Modifier.weight(1f))
        RenderingUserImage(profileImage= profileImage)
    }
}


@Composable
fun RenderingUserImage(
    modifier: Modifier = Modifier,
    profileImage: String?
) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(profileImage)
            .crossfade(true)
            .build(),
        contentDescription = "profile image",
        onError = { Log.e("Coil", "이미지 로드 실패") },
        contentScale = ContentScale.Crop,
        modifier = modifier
            .width(60.dp)
            .height(60.dp)
            .clip(CircleShape)
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenTopBarPreview() {
    HomeScreenTopBar(userName = "김원혁", profileImage = null)
}

