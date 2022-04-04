package id.co.apprasyid.myapplication

object DataPantai {

    private val pantaiName = arrayOf(
        "Pantai Derawan",
        "Pantai Gili Trawangan",
        "Pantai Nihiwatu",
        "Pantai Ora",
        "Pantai Pandawa",
        "Pantai Pink",
        "Pantai Pulau Belitung",
        "Pantai Sawarna",
        "Pantai Tanjung Bira",
        "Pantai Tomini Bay"
    )

    private val pantaiDetails = arrayOf(
        "Pantai Derawan, Kalimantan Timur masuk dalam urutan ke-63 di CNN World’s 100 Best Beaches In The World. Soalnya, pantainya bersih banget dan hampir nggak ada sampah. Pasir pantainya juga putih, lembut, dan airnya jernih banget. Kamu bisa menikmati keindahan Pantai Derawan sambil menyelam atau snorkeling. Selain itu, kamu juga bisa berenang dengan gerombolan penyu, ikan pari, dan ubur-ubur.",
        "Pantai Gili Trawangan adalah pantai di Lombok yang sangat terkenal di kalangan wisatawan karena keeksotisannya. Aktivitas populer yang biasa dilakukan di Gili Trawangan adalah scuba diving. Untuk pemula pun juga bisa scuba diving karena di sana banyak instruktur berkualitas. Wisatawan juga bisa melakukan snorkeling di pantai sebelah timur laut, bermain kayak, berselancar, dan bermain bersama penyu. Ada juga fasilitas belajar berkuda sambil mengelilingi pulau.",
        "Pantai Nihiwatu masuk dalam urutan ke-17 di CNN World’s 100 Best Beaches In The World. Soalnya, pantai ini memiliki pasir yang putih, air laut super jernih, dan yang paling menarik perhatian wisatawan adalah pemandangan matahari terbenamnya yang super cantik. Beberapa kegiatan yang dapat Anda lakukan di sini di antaranya diving, berselancar, menikmati sunset, atau bergabung bersama penduduk lokal untuk menangkap gurita dan kepiting.",
        "Pantai Ora adalah surga yang tersembunyi di Maluku Tengah. Keindahan Pantai Ora serupa dengan Pantai Boracay di Filipina atau Pantai Bora-Bora di Samudera Pasifik. Pesona Pantai Ora adalah air laut super jernih, sehingga kamu bisa menikmati langsung keindahan karang dan dunia bawah laut dari perahu. Saat malam tiba, kamu bisa menikmati bintang-bintang indah di langit dari dermaga.",
        "Pantai Pandawa adalah salah satu pantai terpencil di Bali dan memiliki julukan The Secret Beach. Terletak di Desa Kutuh, sebelah selatan Bali, pantai ini tersembunyi di balik tebing-tebing tinggi dan semak-semak. Disebut secret  beach karena jalan untuk menuju pantai ini relatif sulit diakses. Pantai Pandawa memiliki pasir seputih salju dan air laut yang jernih. Di sini, kamu akan dimanjakan oleh olahraga air seperti kano dan paralayang. Kamu juga bisa berenang di air laut yang jernih. Jika kamu datang ke sini di bulan Maret, kamu bisa menikmati parade budaya yang diadakan oleh penganut Hindu dan Buddha.",
        "Pantai Pink adalah pantai yang terletak di Nusa Tenggara Timur yang bakal membuat kamu terpesona dengan jernihnya air laut dan pasir warna pink di sepanjang pantai. Pasir tersebut bisa berwarna pink karena warna tersebut berasal dari serpihan karang dan biota lain yang terbawa arus ke daratan dan bercampur dengan pasir pantai. Selain bisa menikmati keindahan Pantai Pink, kamu juga bisa snorkeling atau diving.",
        "Keindahan Pantai pada Pulau Belitung sudah terekspos sejak adanya film Laskar Pelangi. Meskipun pulau ini terkenal dengan lada putih dan pertambangan mineral jenis C, seperti timah putih, pasir kuarsa, tanah liat putih (kaolin), dan batu-batu granit, tapi pulau ini memiliki keindahan pantai yang super indah. Pantai di Pulau Belitung berciri khas memiliki batu granit yang besar pasir lembut seputih salju, dan air laut biru super jernih.",
        "Pantai Sawarna menyuguhkan keindahan pemandangan deretan pohon kelapa dan air laut Samudera Hindia yang jernih. Pantai Sawarna terletak di Desa Wisata Sawarna, Banten dan memiliki pasir putih yang kontras dengan langit dan laut biru. Ombak di pantai ini sangat cocok digunakan sebagai lokasi surfing. Ombak di Pantai Sawarna sudah dicicipi oleh para peselancar dari Amerika, Australia, Jepang, dan Korea.",
        "Pantai Tanjung Bira terletak di Kabupaten Bulukumba. Jarak dari Makassar sekitar 200 km atau berada di paling ujung selatan daratan Sulawesi Selatan. Tanjung Bira dikenal dengan pasir putihnya yang seperti tepung bedak. Alam bawah laut juga nggak kalah indah jika dibandingkan dengan tempat lain. Pemandangannya di kala senja juga nggak kalah indah. Gradasi warna langit dan cahaya redup matahari terbenam di sana mampu membuat wisatawan terbuai.",
        "Pantai Tomini Bay terletak di Sulawesi Utara. Karena lokasinya yang tak jauh dari garis ekuator atau khatulistiwa, pantai ini menjadi tempat yang tepat untuk menikmati waktu bersantai dengan cara berjemur. Pada pagi hari, kamu bisa menikmati matahari terbit kemudian melihat para nelayan yang pulang dari berlayar. Kamu juga bisa melakukan diving untuk melihat keragaman biota laut yang masih alami. Di sekitar sana juga banyak resto yang menyediakan hidangan seafood segar."
    )

    private val pantaiPhoto = intArrayOf(
        R.drawable.pantai_derawan,
        R.drawable.pantai_gili_trawangan,
        R.drawable.pantai_nihiwatu,
        R.drawable.pantai_ora,
        R.drawable.pantai_pandawa,
        R.drawable.pantai_pink,
        R.drawable.pantai_pulau_belitung,
        R.drawable.pantai_sawarna,
        R.drawable.pantai_tanjung_bira,
        R.drawable.pantai_tomini_bay
    )

    val listPantai: ArrayList<Pantai>
        get() {
            val list = arrayListOf<Pantai>()
            for (i in pantaiName.indices) {
                val objekPantai = Pantai()
                objekPantai.name = pantaiName[i]
                objekPantai.detail = pantaiDetails[i]
                objekPantai.photo = pantaiPhoto[i]
                list.add(objekPantai)
            }
            return list
        }

}