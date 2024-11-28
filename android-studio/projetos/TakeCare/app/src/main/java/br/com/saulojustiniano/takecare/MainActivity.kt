package br.com.saulojustiniano.takecare

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.saulojustiniano.takecare.ui.theme.TakeCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            TakeCareTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF35ABA4))
                .alpha(0.2f)
        )
        Row {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .border(1.dp, Color.Black)
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp),
                ) {
                    Text(
                        text = "Tutor",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .background(
                                color = Color(0xFF215954),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(
                                horizontal = 83.dp,
                                vertical = 8.dp
                            )
                    )
                }
                TextFieldWithLabel("Email")
                TextFieldWithLabel("Senha")
                TextFieldWithLabel("Nome")
                TextFieldWithLabel("Currículo")
                TextFieldWithLabel("Telefone")
                TextFieldWithLabel("Cidade")
                TextFieldWithLabel("Endereço")
                TextFieldWithLabel("Idade")
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)

                ) {
                    ElevatedButton(
                        onClick = {},
                        colors = ButtonDefaults
                            .elevatedButtonColors(
                                containerColor = Color(0xFFF76D45),
                                contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Cadastrar",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 50.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TextFieldWithLabel(label: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
    ) {
        Text(
            text = label,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 6.dp)
        )
        androidx.compose.material3.TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(20.dp)
                )
                .alpha(0.5f)
                .fillMaxWidth()
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(){
    TakeCareTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}