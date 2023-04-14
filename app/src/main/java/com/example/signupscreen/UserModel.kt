package com.example.signupscreen

class UserModel {
    var id : String
    var name: String
    var firstname : String
    var lastname : String
    var genre : String
    var birthdate : String
    var adress : AdressModel
    var company : CompanyModel
    var note : String
    var avatar : String

constructor(id: String, name: String, firstname : String, lastname : String, genre : String, birthdate : String, adress : AdressModel, company : CompanyModel, note : String, avatar : String) {
    this.id = id
    this.name = name
    this.firstname = firstname
    this.lastname = lastname
    this.genre = genre
    this.birthdate = birthdate
    this.adress = AdressModel("", 0, "", "")
    this.company = CompanyModel("", "", "")
    this.note = note
    this.avatar = avatar

}
}