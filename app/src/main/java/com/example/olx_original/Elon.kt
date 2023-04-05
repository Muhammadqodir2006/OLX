package com.example.olx_original

class Elon (var nomi:String, var narxi:Int, var valyuta: Valyuta, var tavsif:String, var elon_egasi:User){
    init {
        elonlar.add(this)
        elon_egasi.elonlar.add(this)
    }
    companion object{

        var elonlar = ArrayList<Elon>()

        fun elonBer(elon: Elon){
            /*
                SHAREDPREFERENCES orqali elon qoshish
            */
        }
    }
}