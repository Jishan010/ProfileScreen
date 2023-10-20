package com.jishan.profilescreen.model

data class UserProfile(
    val id: Int, val imageUrl: String, val name: String
)

val userProfileList = listOf(
    UserProfile(1, "https://www.kasandbox.org/programming-images/avatars/spunky-sam.png", "John"),
    UserProfile(
        2, "https://www.kasandbox.org/programming-images/avatars/spunky-sam-green.png", "Alice"
    ),
    UserProfile(3, "https://www.kasandbox.org/programming-images/avatars/purple-pi.png", "Bob"),
    UserProfile(
        4, "https://www.kasandbox.org/programming-images/avatars/purple-pi-teal.png", "Eve"
    ),
    UserProfile(
        5, "https://www.kasandbox.org/programming-images/avatars/purple-pi-pink.png", "Charlie"
    ),
    UserProfile(
        6, "https://www.kasandbox.org/programming-images/avatars/primosaur-ultimate.png", "Olivia"
    ),
    UserProfile(
        7, "https://www.kasandbox.org/programming-images/avatars/primosaur-tree.png", "Liam"
    ),
    UserProfile(
        8, "https://www.kasandbox.org/programming-images/avatars/primosaur-sapling.png", "Sophia"
    ),
    UserProfile(
        9, "https://www.kasandbox.org/programming-images/avatars/orange-juice-squid.png", "Noah"
    ),
    UserProfile(
        10, "https://www.kasandbox.org/programming-images/avatars/old-spice-man.png", "Emma"
    ),
    UserProfile(
        11, "https://www.kasandbox.org/programming-images/avatars/old-spice-man-blue.png", "Mia"
    ),
    UserProfile(12, "https://www.kasandbox.org/programming-images/avatars/mr-pants.png", "Lucas"),
    UserProfile(
        13, "https://www.kasandbox.org/programming-images/avatars/mr-pants-purple.png", "Isabella"
    ),
    UserProfile(
        14, "https://www.kasandbox.org/programming-images/avatars/mr-pants-green.png", "Aiden"
    ),
    UserProfile(15, "https://www.kasandbox.org/programming-images/avatars/marcimus.png", "Ella"),
    UserProfile(
        16, "https://www.kasandbox.org/programming-images/avatars/marcimus-red.png", "Liam"
    ),
    UserProfile(
        17, "https://www.kasandbox.org/programming-images/avatars/marcimus-purple.png", "Ava"
    ),
    UserProfile(
        18, "https://www.kasandbox.org/programming-images/avatars/marcimus-orange.png", "Sophia"
    ),
    UserProfile(
        19, "https://www.kasandbox.org/programming-images/avatars/duskpin-ultimate.png", "Noah"
    ),
    UserProfile(
        20, "https://www.kasandbox.org/programming-images/avatars/duskpin-tree.png", "Charlotte"
    )
)
