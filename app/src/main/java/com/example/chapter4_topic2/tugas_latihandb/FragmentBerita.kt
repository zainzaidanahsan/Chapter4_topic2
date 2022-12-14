package com.example.chapter4_topic2.tugas_latihandb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic2.R
import com.example.chapter4_topic2.databinding.FragmentBeritaBinding

class FragmentBerita : Fragment() {
    lateinit var binding : FragmentBeritaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeritaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var daftarBerita = arrayListOf(
            Berita("Ternyata Effendi Simbolon Dekat Dengan Mertua Jenderal TNI Dudung","Rifki Arsilan", R.drawable.dudung, "15 September 2022", "VIVA – Kepala Staf Angkatan Darat (KSAD) Jenderal TNI Dudung Abdurachman mengatakan, dirinya beserta seluruh jajaran prajurit TNI Angkatan Darat sudah memaafkan Anggota Komisi I DPR RI Effendi Simbolon yang sebelumnya telah memberikan pernyataan bahwa TNI seperti Gerombolan dan Ormas. Menurut Jenderal Dudung, pernyataan Effendi Simbolon itu sangat menyakiti hati serta prajurit TNI Angkatan Darat yang berkeringat setiap hari dalam menjalankan tugas hingga ke dalam hutan untuk menjaga keamanan dan kedaulatan Negara Kesatuan Republik Indonesia."),
            Berita("Profil dan Biodata Komjen Dharma Pongrekun, Mantan Wakil Kepala BSSN yang Disebut Lawan Seimbang Hacker Bjorka", "Tim TvONe", R.drawable.dharma, "15 September 2022", "Jakarta – Mendadak nama Komjen Dharma Pongrekun viral di media sosial. Pasalnya ia disebut sebagai lawan seimbang bagi hacker Bjorka. Sebagaimana diketahui, Jenderal bintang tiga itu kini menjabat sebagai Analis Kebijakan Utama Bidang Jianbang Lemdiklat Polri disebut-sebut netizen sebagai lawan seimbang hacker Bjorka. Selain itu, Komjen Dharman diketahui pernah menjadi Wakil Kepala Badan Siber dan Sandi Negara (BSSN) selama 2 tahun dari 2019 hingga 2021. Dikutip VIVA dari berbagai sumber, Dharma, yang merupakan lulusan akpol 1988 ini berpengalaman di bidang reserse.\n" +
            "Selama menjadi anggota Polri, Komjen Dharma menduduki sejumlah jabatan strategis, di antaranya:\n" +
                    "\n" +
                    "Pamen Polda Bengkulu Kasat II Dit Narkoba Polda Bengkulu Wadir Reskrimum Polda Metro Jaya Kasubbag Anevopswil Bag Anev Robinops Bareskrim Polri Kabagkerma Robinops Bareskrim Polri Dosen UtamaSTIK Lemdikpol\n" + "Menyusul kemudian data pribadi Ketua DPR Puan Maharani, Menteri BUMN Erick Thohir, Menkominfo Johnny G Plate, dan Mendagri Tito Karnavian. Terus merembet ke Gubernur DKI Jakarta Anies Baswedan, Menko Polhukam Mahfud MD, hingga Menko Marves Luhut Binsar Pandjaitan.  Data pribadi yang diungkap menurut pengakuan hacker Bjorka adalah NIK, nomor ponsel atau HP, alamat, pendidikan, vaksin dan lain-lain. Meski membuat tiga akun Twitter, yaitu @bjorkanism, @bjorxanism serta @bjorkanesian, namun ketiganya langsung 'dibungkus'.\n" +
                    "Akan tetapi, tak hanya Twitter, Bjorka juga punya akun di media sosial Telegram. Atas aksi Bjorka yang semakin membuat resah, Presiden Jokowi menginstruksikan membentuk tim khusus (timsus) yang terdiri dari Badan Siber dan Sandi Negara (BSSN), Kementerian Komunikasi dan Informatika (Kominfo), Kepolisian Negara Republik Indonesia (Polri) hingga Badan Intelijen Negara (BIN), di bawah koordinasi Menko Polhukam. (viva/rem)"),
            Berita("Demo Tolak BBM, Mahasiswa Bongkar Kawat Berduri Menuju Istana", "CNN Indonesia", R.drawable.demo, "15 September 2022", "Jakarta, CNN Indonesia -- Aksi mahasiswa yang tergabung dalam Badan Eksekutif Mahasiswa Seluruh Indonesia (BEM SI) di Patung Kuda Arjuna Wijaya, Jakarta, Kamis (15/9) memanas. Mereka mendesak Presiden Joko Widodo (Jokowi) membatalkan kenaikan harga BBM.\n" +
                    "Mereka memulai aksi unjuk rasa sejak pukul 13.15 WIB. Mahasiswa memadati satu jalur Jalan Medan Merdeka Barat sehingga lalu lintas dari Patung Kuda menuju Istana ditutup.\n")
        )

        binding.rvBerita.adapter = BeritaAdapter(daftarBerita)
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }


}