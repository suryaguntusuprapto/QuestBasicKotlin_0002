package com.example.a20220140002_praktikum1_pam

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("== WithParameter ==")
    println("Hello, $name!")
}

//name argument merupakan cara untuk memangiil fungsi dengan menyebutkan nama parameter
fun withNameArgument(name: String, age: Int){
    println()
    println("== WithNameArgument ==")
    println("Hello, $name! you are $age years old.")
}
