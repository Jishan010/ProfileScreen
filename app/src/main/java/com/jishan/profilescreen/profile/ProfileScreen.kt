package com.jishan.profilescreen.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.jishan.profilescreen.model.UserProfile
import com.jishan.profilescreen.model.userProfileList
import com.jishan.profilescreen.ui.theme.ProfileScreenTheme

@Composable
fun ProfileScreen(userProfiles: List<UserProfile>, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp, start = 25.dp, end = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {

        AsyncImage(
            model = "https://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50",
            contentDescription = null,
            modifier = Modifier
                .size(size = 100.dp)
                .clip(shape = CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Jishan", style = TextStyle(
                fontSize = 24.sp, // Font size
            )
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "San Fransisco,CA".uppercase(), style = TextStyle(
                fontSize = 12.sp, // Font size
                fontWeight = FontWeight.Bold, // Font weight
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(size = 5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Follow Jane".uppercase(),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, color = Color.Black),
            shape = RoundedCornerShape(size = 5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Message".uppercase(), color = Color.Black)
        }
        Spacer(modifier = Modifier.height(16.dp))
        UserProfileGrid(userProfiles)
    }
}


@Composable
fun UserProfileGrid(userProfiles: List<UserProfile>) {
    LazyVerticalGrid(
        modifier = Modifier.wrapContentHeight(), columns = GridCells.Adaptive(minSize = 150.dp)
    ) {
        items(userProfiles) { userProfile ->
            UserProfileItem(userProfile)
        }
    }
}

@Composable
fun UserProfileItem(userProfile: UserProfile) {
    AsyncImage(
        model = userProfile.imageUrl,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileScreenTheme {
        ProfileScreen(userProfileList, modifier = Modifier.fillMaxWidth())
    }
}