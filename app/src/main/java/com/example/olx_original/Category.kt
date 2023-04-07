package com.example.olx_original

class Category(var nomi:String, var parent: Category?, var children:ArrayList<Category>?) {
    var bigParent:Category? = null
    init {
        if (parent != null){
            var i = this
            while (parent != null){
                i = i.parent!!
            }
            bigParent = i
        }
    }
}