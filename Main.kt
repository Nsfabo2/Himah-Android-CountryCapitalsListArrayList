
fun main(){
/**/

    //Create a list of 3 countries
    val Countries_List = listOf<String>("Japan","China","Korea")
    //Create an empty ArrayList
    val Empty_Array = arrayListOf<String>()

    //Ask the user to enter the capital of each country in the list
    var X = 0
    while (X<3){
        print("Do You Know the capital of ${Countries_List[X]} ? ")
        val User_Answer = readLine()!!.toString()
        //Add each capital to the ArrayList
        Empty_Array.add(User_Answer)
        X++
    }
for (i in 0..2){
    //Print all countries and their capitals by iterating through the list and the ArrayList
    println("${Countries_List[i]}'s capital is  ${Empty_Array[i]}")
}

}
