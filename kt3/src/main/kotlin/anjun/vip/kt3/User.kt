package anjun.vip.kt3

data class User(var i:Int,var name:String)
fun main( args: Array< out String>){
    val h = User(3, "h")
    System.out.printf(h.toString())
}