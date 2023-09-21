package com.napa.foodstorechallengechapter3.data

import com.napa.foodstorechallengechapter3.model.Menu

interface MenuDataSource {
    fun getMenus(): List<Menu>
}

class MenuDataSourceImpl() : MenuDataSource {

    override fun getMenus(): List<Menu> = listOf(
        Menu(
            name = "Triple Burger",
            price = 30000.0,
            img = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/img_triple_burger.png",
            detail = "Menu paket Triple Burger cocok untuk dimakan bersama dengan keluarga tercinta",
            location = "Jl. H. Agus Salim No.60, RT.8/RW.4, Gondangdia, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10230"
        ),
        Menu(
            name = "Spicy Burger",
            price = 25000.0,
            img = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/img_spicy_burger.png",
            detail = "Daging gurih dengan saus pedas, sajikan dengan saunan segar dan keju leleh dalam roti burger yang meledakkan rasa pedas. Panasnya memabukkan!",
            location = "Jl. Bumi No.58 A, Gunung, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12120"
        ),
        Menu(
            name = "Cheese Burger",
            price = 20000.0,
            img = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/img_cheese_burger.png",
            detail = "Daging sapi panggang sempurna yang juicy dan lembut, diselimuti oleh lapisan keju cheddar premium yang meleleh, ditemani dengan saus rahasia kami yang kaya rasa. Semua ini diapit dalam roti burger yang lembut dan garing. Kesempurnaan dalam setiap gigitan!",
            location = "Ps. Cipete, jl.Pangeran antasari raya PD. Pasar Jaya No 10 Cilandak Barat, di, RT.9/RW.11, Cipete Sel., Kec. Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12430"
        ),
        Menu(
            name = "Chicken Burger",
            price = 35000.0,
            img = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/img_chicken_burger.png",
            detail = "Daging ayam renyah, saus spesial, dan sayuran segar dalam roti burger lembut. Kesempurnaan burger!",
            location = "Jl. Kemang V No.6F, Bangka, Kec. Mampang Prpt., Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12730"
        ),
        )
}