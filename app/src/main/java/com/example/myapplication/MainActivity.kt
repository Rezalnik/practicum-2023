package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Design()
        }
    }
}

@Composable
fun Photo() {
    Image(
        painter = painterResource(R.drawable.mask_groupupperdota),
        contentDescription = "Contact profile picture",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .size(342.5.dp)
    )
}

@Composable
fun Icon() {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Box(
            modifier = Modifier
                .size(size = 100.dp)
                .clip(shape = RoundedCornerShape(corner = CornerSize(size = 30f)))
                .background(color = Color.Black)


        ) {

        Image(
            painter = painterResource(R.drawable.pin),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(70.dp)
                .background(Color.Black)
                .absoluteOffset(15.dp, 15.dp)

        )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = "DoTA 2",
                fontSize = 24.sp

            )
            Spacer(modifier = Modifier.height(4.dp))
            Row() {
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(20.dp)
                )
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(20.dp)
                )
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(20.dp)
                )
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(20.dp)
                )
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(
                    text = "70М"
                )
            }
        }
    }
}

@Composable
fun Tags(){
    Row(modifier = Modifier
        .padding(all = 8.dp),
    ){
        Box(
            modifier = Modifier
                .size(40.dp,20.dp)
                .clip(shape = RoundedCornerShape(corner = CornerSize(size = 30f)))
                .background(color = Color.Green)


        ) {
            Text(
                text = "MOBA"
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(68.dp,20.dp)
                .clip(shape = RoundedCornerShape(corner = CornerSize(size = 30f)))
                .background(color = Color.Green)


        ) {
            Text(
                text = "Стратегия"
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(45.dp,20.dp)
                .clip(shape = RoundedCornerShape(corner = CornerSize(size = 30f)))
                .background(color = Color.Green)


        ) {
            Text(
                text = "Экшен"
            )
        }

    }

}


        @Composable
fun Information() {
    Text(modifier = Modifier.padding(all = 8.dp),
        text = "Ежедневно миллионы игроков по всему миру сражаются " +
                "от лица одного из более сотни героев Dota 2, и " +
                "даже после тысячи часов в ней есть чему научиться." +
                "Благодаря регулярным обновлениям игра живёт своей" +
                "жизнью: геймплей, возможности и герои постоянно" +
                "преображаются.",
        fontSize = 18.sp
    )
}

@Composable
fun Pictures_3(){
    LazyRow(modifier = Modifier.padding(all = 8.dp)) {
        item{Image(
            painter = painterResource(R.drawable.photo_1),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(250.dp)


        )
        Spacer(modifier = Modifier.width(8.dp))
        }



        item{Image(
            painter = painterResource(R.drawable.photo_2),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(250.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        }



        item{Image(
            painter = painterResource(R.drawable.photo_3),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(250.dp)
                .clip(shape = RoundedCornerShape(size = 60.dp))

        )}
    }
}

@Composable
fun Estimation(){

    Column() {
        Text(
            text = "Оценки и отзывы",
            fontSize = 24.sp

        )
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Text(
                text = "4.9",
                fontSize = 50.sp

            )
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Row() {
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(20.dp)
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "70М отзывов"
                )
            }
        }
    }

}

@Composable
fun MessageCard_1() {
    Column() {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.commentator_1),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = "kooblo")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "18 июня, 2023")
            }
        }
        Text(modifier = Modifier.padding(all = 8.dp),
            text = "\"Девушка сказала, если тут наберётся 150 пальцев вверх" +
                    "и 15 наград, то она купит мне аркану на пуджа," +
                    "помогите мужики!\"",
            fontSize = 18.sp
        )

    }
}




@Composable
fun MessageCard_2() {
    Column() {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.commentator_2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = "PAVA PEVA")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "8 июня, 2023")
            }

        }


        Text(modifier = Modifier.padding(all = 8.dp),
            text = "Если этот Билли получит 10 лайков я удаляю доту\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠠⠄⠄⠒⠂⢀⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⢀⡀⠄⣰⣶⣦⡈⠄⠄⠄⠄⠄\n" +
                    "⠄⠂⠄⠄⠄⠄⠄⠄⠄⣿⣖⣿⣷⣴⡄⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠁⠄⠄⠄⠄⣸⣿⣿⣿⠛⠩⠁⠄⠄⠄⠄⠄\n" +
                    "⠄⠄⠄⠄⠄⣀⣤⣾⣿⣿⡏⠉⠄⠁⠄⠄⠄⠄⠄⠄\n" +
                    "⠄⢀⣴⣶⣿⣿⣿⣿⣿⡟⠺⡇⠄⢵⣤⣀⠄⠄⠄⠄\n" +
                    "⢠⣿⣿⣿⣿⣿⣿⣿⡏⠁⠄⣷⣀⠈⠙⠛⠑⠄⠄⠄\n" +
                    "⣼⣿⣿⣿⡇⠹⣿⣿⣿⡦⠄⠹⢿⡇⠄⠄⠄⠄⠄⠄\n" +
                    "⣿⣿⣿⣿⠁⢰⣤⣀⣀⣠⣔⢰⠄⠄⠄⠄⢀⡈⠄⠄\n" +
                    "⣿⣿⠟⠄⠄⢸⣿⣿⣿⣿⠏⢸⡆⠄⠐⠄⢸⣿⣌⠄\n" +
                    "⣿⣿⡆⠄⠄⢸⣿⡿⢿⡤⠄⠈⠄⠄⢀⠄⢰⣿⣿⡄\n" +
                    "⢿⣿⣷⠄⠄⠄⣿⣷⣦⠄⠐⠄⠄⠄⠘⠄⠘⢿⣿⡇\n" +
                    "⠈⠻⣿⣇⠠⠄⢀⡉⠄⠄⠄⠄⠄⢀⡆⠄⠄⠘⣿⡇\n" +
                    "⠄⠄⠘⣿⣧⢀⣿⣿⢷⣶⣶⣶⣾⢟⣾⣄⠄⡴⣿⡀\n" +
                    "⠄⠄⠄⠘⣿⣧⣝⣿⣷⣝⢿⣿⠇⢸⣿⣿⡎⡡⠋⠄\n" +
                    "⠄⠄⠄⠄⣝⠛⠋⠁⣿⣿⡎⢠⣴⣾⣿⣿⣷⠄⠄⠄",
            fontSize = 18.sp

        )
    }

}

@Composable
fun Install(){
    Spacer(modifier = Modifier.height(50.dp))
    Row(
        modifier = Modifier,

    ) {
    Spacer(modifier = Modifier.width(120.dp))
    Text(
        "Установить",
        fontSize = 24.sp,
        modifier = Modifier
            .drawBehind {
                drawRoundRect(
                    Color(0xFFFFD700),
                    cornerRadius = CornerRadius(10.dp.toPx())
                )
            }
            .padding(4.dp)
            .size(140.dp,40.dp),


    )
    }
    Spacer(modifier = Modifier.height(50.dp))
}

@Preview(showBackground = true)
@Composable
fun Design() {
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)


    ) {
        item{ Photo() }
        item{ Icon() }
        item{ Tags() }
        item{ Information() }
        item{ Pictures_3() }
        item{ Estimation() }
        item{ MessageCard_1() }
        item{ MessageCard_2() }
        item{ Install() }

    }
}


