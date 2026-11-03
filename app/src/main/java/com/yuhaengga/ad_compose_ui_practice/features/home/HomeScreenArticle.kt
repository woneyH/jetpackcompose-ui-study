package com.yuhaengga.ad_compose_ui_practice.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuhaengga.ad_compose_ui_practice.ui.theme.Ad_compose_ui_practiceTheme
import com.yuhaengga.ad_compose_ui_practice.ui.theme.primaryContainerLight

@Composable
fun HomeScreenContent(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues
) {
    Column(
        modifier = modifier
            .padding(innerPadding)
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Today's suggestion",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.size(25.dp))
        Box(
            modifier = Modifier
                .size(350.dp)
                .background(MaterialTheme.colorScheme.primaryContainer, shape = RoundedCornerShape(30.dp))
                .align(Alignment.CenterHorizontally)
        ) {

        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenContentPreview() {
    Ad_compose_ui_practiceTheme() {
        HomeScreenContent(innerPadding = PaddingValues())
    }
}