package com.example.indonesianfoodapp

object FoodsData {

    private val foodNames = arrayOf("Rendang",
        "Es Pisang Ijo",
        "Coto Makassar",
        "Karedok",
        "Kerak Telor",
        "Sate Madura",
        "Gudeg",
        "Soto Mie Bogor",
        "Soto Banjar",
        "Gulai",
        "Soto Betawi",
        "Rawon"

        )



    private val foodDetails = arrayOf(
            "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan.",
            "Salah satu sajian khas dari Makassar yaitu pisang hijau atau es pisang ijo. Dinamakan pisang hijau karena terbuat dari bahan utama pisang yang dibalut dengan adonan tepung berwarna hijau. Adonan tersebut dibuat dari tepung, air, dan pewarna hijau alami dari campuran daun pandan dan daun suji.",
             "Coto makassar atau coto mangkasara adalah makanan tradisional Makassar, Sulawesi Selatan.   Makanan ini terbuat dari jeroan sapi yang direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu yang diracik secara khusus. ",
            "Karedok atau keredok adalah salah satu makanan khas Sunda di Indonesia. Karedok dibuat dengan bahan-bahan sayuran mentah antara lain; mentimun, taoge, kol, kacang panjang, ubi, daun kemangi, dan terong atau leunca. Sedangkan sausnya adalah bumbu kacang yang dibuat dari cabai merah, bawang putih, kencur, kacang tanah, air asam, gula jawa, garam, dan terasi.",
            "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir",
            "Sate Madura adalah sate yang memiliki bumbu khas Madura. Sate Madura biasanya terbuat dari ayam. Madura selain terkenal sebagai pulau garam, juga terkenal dengan satenya. Sate madura sudah terkenal di seluruh Nusantara, Sate Madura dapat ditemukan hampir di semua daerah khususnya di kota besar seperti Medan, Jakarta, Bandung, dan Surabaya. Konon di Madura sendiri sate susah dicari.",
            "Gudeg adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            "Soto Mie Bogor merupakan campuran dari daging sapi, kikil, usus, urat, babat, risol, kentang atau lobak rebus, mi kuning, tomat, serta kol, yang dipadu dengan kuah, lalu ditaburi dengan daun bawang dan seledri. Semakin komplet dengan tambahan emping melinjo.",
            "Soto Banjar adalah soto ayam berempah yang lahir di tengah masyarakat suku Banjar di Kalimantan Selatan. Bisa dibilang juga bahkan hidangan ini adalah salah satu masakan terpopuler dari Kalimantan.",
        "Gulai adalah masakan berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan.",
        "Soto Betawi merupakan soto yang khas dari daerah Jakarta. Seperti halnya soto Madura dan soto sulung, soto Betawi juga menggunakan jeroan. Selain jeroan, sering kali organ-organ lain juga disertakan, seperti mata, terpedo, dan juga hati. Daging sapi juga menjadi bahan campuran dalam soto Betawi. Kuah soto Betawi merupakan campuran santan dan susu. Kedua campuran inilah yang membuat rasa soto Betawi begitu khas.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta)."

    )

    private val foodImages = intArrayOf(R.drawable.rendang,
        R.drawable.es_pisang_ijo,
        R.drawable.coto_makassar,
        R.drawable.karedok,
        R.drawable.kerak_telor,
        R.drawable.sate_madura,
        R.drawable.gudeg,
        R.drawable.soto_mie_bogor,
        R.drawable.soto_banjar,
        R.drawable.gulai,
        R.drawable.soto_betawi,
        R.drawable.rawon


        )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }


}