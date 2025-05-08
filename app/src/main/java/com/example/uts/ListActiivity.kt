package com.example.uts

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uts.AdapterList
import com.example.uts.ItemList


class ListActiivity : AppCompatActivity() {
    //   private lateinit var binding: AdapterList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_actiivity)

        //Inisialisasi
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )
        //  recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList("Dani Olmo", "Nama lengkap: Daniel Olmo Carvajal\n" +
                    "Lahir: 7 Mei 1998 (Terrassa, Spanyol)\n" +
                    "Posisi: Gelandang serang / Sayap\n" +
                    "Dani Olmo adalah gelandang kreatif yang dikenal karena visi permainan, teknik tinggi, dan fleksibilitas di lini serang.\n"+
                    "Ia memulai karier juniornya di akademi Barcelona, kemudian berkembang pesat di Dinamo Zagreb sebelum bergabung dengan RB Leipzig.\n" +
                    "Ia juga menjadi pemain andalan timnas Spanyol sejak Euro 2020.",
                "https://www.fcbarcelona.com/photo-resources/2024/10/13/0d46bf0d-5149-4908-9187-35813907233d/20-Olmo-M.jpg?width=1200&height=750",
                "https://www.instagram.com/daniolmo?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw=="),


            ItemList("Pau Cubarsi", "Nama lengkap: Pau Cubarsí Paredes\n" +
                    "Lahir: 22 Januari 2007 (Estanyol, Girona, Spanyol)\n" +
                    "Posisi: Bek tengah\n" +
                    "Klub: FC Barcelona\n" +
                    "Pau Cubarsí adalah bek tengah muda berbakat lulusan akademi La Masia.\n" +
                    "Ia dikenal karena ketenangan, kecerdasan dalam membaca permainan, dan kemampuan distribusi bola dari belakang.\n"  +
                    "Meski masih remaja, ia mulai mencuri perhatian setelah tampil impresif bersama tim utama Barcelona musim 2024.",
                "https://pbs.twimg.com/media/GIgNdrDXYAEG4S7.jpg",
                "https://www.instagram.com/paucubarsi?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw=="),


            ItemList("Lamine Yamal", "Nama lengkap: Lamine Yamal Nasraoui Ebana\n" +
                    "Lahir: 13 Juli 2007 (Esplugues de Llobregat, Spanyol)\n" +
                    "Posisi: Winger kanan\n" +
                    "Klub: FC Barcelona\n" +
                    "Lamine Yamal adalah salah satu talenta muda paling menjanjikan di sepak bola dunia.\n"  +
                    "Lulusan La Masia ini dikenal dengan kecepatan, dribel tajam, dan kemampuan menciptakan peluang dari sisi sayap.\n" +
                    "Ia mencetak sejarah sebagai pemain termuda Barcelona dan juga telah dipanggil ke timnas senior Spanyol.",
                "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/p2/235/2025/03/08/Lamine-Yamal-22195169.jpg",
                "https://www.instagram.com/lamineyamal?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw=="),


            ItemList("Gavi", "Nama Lengkap: Pablo Martin Paez Gavira\n" +
                    "Lahir: 5 Agustus 2004\n" +
                    "Posisi: Gelandang Tengah\n" +
                    "avi adalah gelandang muda berbakat yang dikenal karena agresivitas, determinasi tinggi, dan kemampuan mengendalikan tempo permainan di lini tengah.\n" +
                    "Ia merupakan salah satu lulusan terbaik akademi La Masia, dan dengan cepat menembus tim utama Barcelona berkat kedewasaan bermain yang melebihi usianya.\n" +
                    "Gavi juga menjadi pemain penting di timnas Spanyol, mencetak sejarah sebagai pencetak gol termuda dalam sejarah tim nasional.\n" +
                    "Kemampuannya dalam bertahan maupun menyerang menjadikannya gelandang serba bisa yang sangat berharga bagi klub dan negara.",
                "https://gavi-pablo.com/wp-content/uploads/2025/03/Club-Career.webp",
                "https://www.instagram.com/pablogavi/?utm_source=ig_web_button_share_sheet")

        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}
