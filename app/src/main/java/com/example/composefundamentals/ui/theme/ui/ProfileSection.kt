package com.example.composefundamentals.ui.theme.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.R
@Composable
fun ProfileSection(
    @DrawableRes fistImageId: Int,
    text: String,
    modifier: Modifier = Modifier,
    iconRight: @Composable () -> Unit = {},
    size: ProfileSectionSize = ProfileSectionSizes.small()

) {

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        ProfilePicture(
            imageId = fistImageId,
            contentDescription = null,
            size = size.profileIconSize
        )

        Text(
            text = text,
            style = size.textStyle,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp)
        )
        iconRight()
    }

}

data class ProfileSectionSize(
    val profileIconSize: Dp,
    val textStyle: TextStyle
)

object ProfileSectionSizes {
    @Composable
    fun small() = ProfileSectionSize(
        ProfileSizes.small,
        MaterialTheme.typography.titleSmall
    )

    @Composable
    fun medium() = ProfileSectionSize(
        ProfileSizes.medium,
        MaterialTheme.typography.bodyMedium
    )
}

@Preview
@Composable
fun PreviewProfileSection() {

    ProfileSection(size =  ProfileSectionSizes.medium(),
        fistImageId = R.drawable.food10,
        text = "asdasd"
    )
}

@Preview
@Composable
fun PreviewProfileSection2() {

    ProfileSection(size =  ProfileSectionSizes.small(),
        fistImageId = R.drawable.food10,
        text = "asdasd"
    )
}