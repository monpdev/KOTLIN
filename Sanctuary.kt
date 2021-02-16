fun main() {
  // Write your code below 🏞
// Declare a variable responsibilities
val responsibilities = mutableListOf("feed the chimps", "play a random game","conduct a health check on Foxie")

//Declare 3 variables to keep track of our time and 
//how many responsibilities we've completed
var responsibilitiesComplete = 0
var timeSpent = 0
// Value of totalShiftTime will remain unchanged.
val totalShiftTieme = 4

//Create 2 map collections
var foxiesHealthCheck = mutableMapOf<String, Any?>()

var chimpsHaveEaten = mutableMapOf("Bonnie" to false,"Jubilee" to false, "Frodo" to false, "Foxie" to false)

//Output the first responsibility
println("First, ${responsibilities[0]}")

//Feed the chimp one by one
println("Feeding Bonnie...")
chimpsHaveEaten["Bonnie"] = true

println("Feeding Jubilee...")
chimpsHaveEaten["Jubilee"] = true

println("Feeding Frodo...")
chimpsHaveEaten["Frodo"] = true

println("Feeding Foxie...")
chimpsHaveEaten["Foxie"] = true

//Track the time that it took and how many responsible we have completed thus far

timeSpent += 1
responsibilitiesComplete++

println("You've now completed $responsibilitiesComplete/${responsibilities.size} responsibilities")

//Output the second responsility
println("\nNext, ${responsibilities[1]}")

// The chimp will get to play a random game that's fun and stimulates their thinking

val games = mutableSetOf("tug-of-war with a blanket","catch and throw","number game")

val randomGame = games.random()
println(randomGame)


//Updating the time spent and the responsibilities we 've completed thus far
timeSpent += 1
responsibilitiesComplete++

println("Each animal has now played a game of $randomGame. $responsibilitiesComplete/${responsibilities.size} responsibilities")

//Third responsibilities, step 10: add a print statement
println("Next, ${responsibilities[2]}.")

//Step 11.: Update the foxiesHealthCheck map with info on how she is feeling today.
foxiesHealthCheck.put("temperature",37.2)
foxiesHealthCheck.put("Mood","Happy")
println("Foxie has a temperature of ${foxieHealthCheck["temperature"]} and is feeling ${foxieHealthcheck["mood"]}.")

timeSpent += 1
responsibilitiesComplete++
println("You've now completed $responsibilitiesComplete/${responsibilities.size} responsibilities")

 if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
        println("\nAwesome work! You've completed all of your responsibilites for the day, and you can clock out.")
    } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size){
        println("Great job today! You've completed all of your responsibilities but with over time.")
    } else {
        println("You went over time and did not complete all of your responsibilites.")
    }

}

















}