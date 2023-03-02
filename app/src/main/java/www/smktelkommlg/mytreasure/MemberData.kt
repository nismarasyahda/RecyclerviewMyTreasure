package www.smktelkommlg.mytreasure

object MemberData {
    private val data = arrayOf(
        arrayOf(
            "Choi Hyunsuk",
            "Choi Hyun-suk (최현석; lahir 21 April 1999) adalah seorang artis asal Korea Selatan yang berada di bawah asuhan YG Entertainment. Ia adalah anggota grup vokal laki-laki Korea Selatan TREASURE dan berposisi sebagai penyanyi rap, penari, dan bersama Park Jihoon berbagi peran sebagai pemimpin kelompok.",
            "https://tse4.mm.bing.net/th?id=OIP.okG1dQw-3m9yXThnmtsWwgHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Park Jihoon",
            "Park Ji-hoon (bahasa Korea: 박지훈; lahir 14 Maret 2000 di Busan, Korea Selatan) adalah artis yang berada di bawah naungan YG Entertainment. Ia adalah anggota grup vokal pria asal Korea Selatan, TREASURE, berposisi sebagai vokalis dan bersama Choi Hyun-suk ia berbagi peran sebagai pemimpin dalam grup. Ia pertama kali dikenal publik sebagai trainee YG yang menjadi lawan Stray Kids di acara survival Mnet Stray Kids pada 2017.",
            "https://i.pinimg.com/originals/64/02/20/640220d8fcb78a2d5c0b6c32947f2cfd.jpg"
        ),
        arrayOf(
            "Kanemoto Yoshi",
            "Kanemoto Yoshinori (bahasa Jepang: 金本 芳典) atau Kim Bang-jeon (bahasa Korea: 김방전) lebih dikenal sebagai YOSHI (요시; ヨシ; lahir 15 Mei 2000 di Kobe, Jepang) adalah penyanyi rap berdarah Korea-Jepang yang tergabung sebagai anggota grup vokal TREASURE. Dia pertama kali diperkenalkan sebagai anggota Tim Jepang pada acara survival YG TREASURE BOX.",
            "https://0.soompi.io/wp-content/uploads/2020/07/25021114/TREASURE-Yoshi.jpeg"
        ),
        arrayOf(
            "Kim Junkyu",
            "Kim Junkyu Lahir pada tanggal  9 September 2000 Tinggi badan 178cm Berat badan 65Kg Golongan darah 0",
            "https://tse3.mm.bing.net/th?id=OIP.CZ3eOlOydJFOzsSsg7lCwAHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Yoon Jaehyuk",
            "Yoon Jaehyuk (윤재혁; lahir 23 Juli 2001 di Yongin, Korea Selatan) adalah anggota grup musik asuhan YG Entertainment, TREASURE, yang berposisi sebagai vokalis dan dancer.",
            "https://tse2.mm.bing.net/th?id=OIP.g8q968uMeevI6bVZfP_KSAHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Hamada Asahi",
            "Hamada Asahi (Kanji: 浜田朝光; lahir 20 Agustus 2001 di Osaka, Jepang) adalah penyanyi dan penulis lagu asal Jepang yang juga anggota grup musik asal Korea Selatan, TREASURE, dibawah naungan YG Entertainment.",
            "https://tse1.mm.bing.net/th?id=OIP.NhyHFBcnormeWuu7j_bZrAHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Kim Doyoung",
            "Kim Doyoung (김도영; lahir 4 Desember 2003 di Seoul, Korea Selatan) adalah anggota grup musik TREASURE asuhan YG Entertainment yang berposisi sebagai vokalis dan penari.",
            "https://tse3.mm.bing.net/th?id=OIP.ovE5tKHO4DKEJDi_9bkaVwHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Watanabe Haruto",
            "Watanabe Haruto atau lebih dikenal dengan nama Haruto (Hangul:하루토, Kana:ハルト, Kanji: 渡辺温斗; lahir 5 April 2004) adalah seorang penyanyi asal Jepang yang aktif melalui grup vokal asal Korea Selatan, Treasure di bawah asuhan YG Entertainment. Dia dikenal publik pertama kali sebagai trainee di YG Entertainment melalui program survival YG Treasure Box.",
            "https://tse3.mm.bing.net/th?id=OIP.Lr8z9mfTMD1ODU6qw8Df0QHaLH&pid=Api&P=0"
        ),
        arrayOf(
            "Park Jeongwoo",
            "Park Jeong-woo (bahasa Korea: 박정우; lahir 28 September 2004) adalah penyanyi asal Korea Selatan dan juga anggota grup vokal pria Treasure, di bawah asuhan YG Entertainment. Ia pertama kali dikenal publik sebagai trainee YG Entertainment melalui program survival YG Treasure Box pada tahun 2018.",
            "https://i.imgur.com/2k38552.jpg"
        ),
        arrayOf(
            "So Junghwan",
            "So Jung-hwan (bahasa Korea: 소정환 lahir 18 Februari 2005 di Iksan, Korea Selatan) adalah penyanyi dan penari serta anggota termuda grup TREASURE yang terpilih sebagai anggota ketiga dan mendapat posisi pertama dalam posisi tari melalui acara survival YG TREASURE BOX.",
            "https://tse4.mm.bing.net/th?id=OIP.YPs-PE24_wObChaoKAbiPQHaLH&pid=Api&P=0"
        )
    )
    val listData: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (aData in data) {
                val member = Member()
                member.name = aData[0]
                member.from = aData[1]
                member.photo = aData[2]


                list.add(member)


            }
            return list
        }
}