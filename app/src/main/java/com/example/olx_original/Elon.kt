package com.example.olx_original

class Elon(
    var nomi: String,
    var narxi: Int,
    var valyuta: Valyuta,
    var tavsif: String,
    var elon_egasi: User,
    var images: ArrayList<String>
) {
    init {
        elon_egasi.elonlar.add(this)
    }

    companion object {

        var elonlar = arrayListOf<Elon>(
            Elon(
                "Samsung s 23 1",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 2",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 3",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 4",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 5",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 6",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 7",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
            Elon(
                "Samsung s 23 8",
                500,
                Valyuta.DOLLAR,
                "Lorem ipsum",
                User("Aliyev Ali", "Toshkent"),
                arrayListOf(
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.samsung.com%2Fbd%2Fsmartphones%2Fgalaxy-s23-ultra%2Fimages%2Fgalaxy-s23-ultra-highlights-design-end.jpg&tbnid=8jMPSfBdZXBpVM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ..i&imgrefurl=https%3A%2F%2Ffairelectronics.com.bd%2Fsamsung-galaxy-s23-ultra.html&docid=dadlMCy8-CjFAM&w=1214&h=590&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygDegUIARDmAQ",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage-us.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2Fimages%2Fgalaxy-s23-highlights-color-back-lavender-s.jpg&tbnid=MTtlhZetFaLXsM&vet=12ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ..i&imgrefurl=https%3A%2F%2Fwww.samsung.com%2Fus%2Fsmartphones%2Fgalaxy-s23%2F&docid=4a9tOO0fY5wDFM&w=720&h=600&q=s%2023&ved=2ahUKEwio08Sy3Jb-AhVBtioKHYgKC0QQMygCegUIARDkAQ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Ftechnology%2Fnews%2Fstory%2Fsamsung-galaxy-s23-s23-plus-and-s23-ultra-launched-in-india-price-specifications-and-more-2329452-2023-02-02&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAJ",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wired.com%2Fstory%2Fsamsung-galaxy-s23-phones-galaxy-book3-laptops%2F&psig=AOvVaw0wsdXG-bDO7F0aMUThwkaZ&ust=1680920883530000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKCFyLTclv4CFQAAAAAdAAAAABAR"
                )
            ),
        )

        fun elonBer(elon: Elon) {
            /*
                SHAREDPREFERENCES orqali elon qoshish
            */
        }

        fun getElonlar2(): ArrayList<Elon> {
            return elonlar
        }
    }
}