package com.example.signupscreen

import android.widget.ImageView

class ListitemModel {
    var Prenom : String
    var Nom : String
    var image : ImageView


constructor(Prenom: String, Nom :String, image : ImageView) {
    this.Prenom = Prenom
    this.Nom = Nom
    this.image = image

}
}