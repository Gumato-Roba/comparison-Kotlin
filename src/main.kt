fun main(){
    var school = "akirachix"
    var x = (school[0].toString() +school[2]+school[3])
    println(x)

    var b = sentence("Gumato",20)
    println(b)
    stmt()
    identity()
}
fun sentence(name:String,age:Int):String{
    var b= ("Hi, my name is $name and I am $age years old")
   return(b)
}
fun stmt(){
    var name = "Gumato"
    println(name.length)

}
fun identity(){
    var name = "Gumato Roba"
    if (name == "Gumato Roba")
    println("thats me")
    else("i dont know who that is")
    }


