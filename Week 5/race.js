var early = true;
var runner_age = 50;
let raceNumber = Math.floor(Math.random()*1000);

if (early && runner_age >= 18){
  raceNumber += 1000;
}

if (early && runner_age > 18){
  console.log("Your race number is: " + raceNumber + "\n" + "Your race starts at 9:30am");
}  else if (early == false && runner_age > 18){
  console.log("Your race number is: " + raceNumber + "\n" + "Late adults start at 11:00am");
} else if (runner_age < 18){
  console.log("Your race number is: " + raceNumber + "\n" + "Youth registrants run at 12:30pm"); 
} else  console.log("You need to go to the registration desk");