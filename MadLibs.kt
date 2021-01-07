fun main () {
  
  val costOfGas = 2.28
  val mileage = 25

// Declare the variable distance below
//How many miles you and your friend will be traveling
//Declare a constant variable called distance of data type Int

  val distance : Int


  println("What's your name?")
  var name = readLine()
  // Write your code below
  //Prompt the user to enter a frend's name
  println("What's your friend's name?")
  var friendsName = readLine()
  
  //Prompt the user to enter the nature of the trip
  println("What's the nature of your trip?")
  var adjective = readLine()


// Prompt the user to enter a city to drive to
  println("What's the name of city you would like to drive to?")
  var city = readLine()

//Prompt the user to enter which band they would like to see
  println("What is the name of the band you would like to see?")
  var bandName = readLine()

  //Prompt the user to enter what kind of job they and 
  //friendsName will do in order to save money
  println("What job you and $friendsName will do in order to save money?")
  var work = readLine()



println("Enter the distance to be traveled.")

//Initialize the variable named distance below
distance = Integer.valueOf(readLine())

//Calculate the total cost of gas and store
//it in a variable called totalForGas

var totalForGas = (costOfGas/mileage)*distance
totalForGas = Math.round(totalForGas*100)/100.00

//Create the variable named totalMoneySaved below
var totalMoneySaved = totalForGas+200



  print("""
      A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
  The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.
  Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
  To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}