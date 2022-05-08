function weather(temperature, condition){
  let goToWork;
  
  if (temperature > 30){
  switch(condition){
    case "sunny":
    case "cloudy":
    case "raining":
    case "snowing":
    case "thunder":
      goToWork = false;
      break;
    default:
      console.log("I don't recognise your condition.");
    }
  } else if (temperature > 20){
    switch(condition){
      case "sunny":
      case "cloudy":
      case "raining":
        goToWork = true;
        break;
      case "snowing":
      case "thunder":
        goToWork = false;
        break;
      default:
        console.log("I don't recognise your condition.");
    }
  } else if (temperature >= 10){
    switch(condition){
      case "sunny":
      case "cloudy":
        goToWork = true;
        break;
      case "raining":
      case "snowing":
      case "thunder":
        goToWork = false;
        break;
      default:
        console.log("I don't recognise your condition.");
    }
  } else if (temperature < 10){
    switch(condition){
      case "sunny":
      case "cloudy":
      case "raining":
      case "snowing":
      case "thunder":
        goToWork = false;
        break;
      default:
        console.log("I don't recognise your condition.");
    }
  } else console.log("Your temperature is not a valid number.");

  return goToWork;
}

let not_terminate = false;

while (!not_terminate){
let temp = prompt("What is the temperature? ");

console.log("How does it look outside");
console.log("Choose one of the following:");

let cond = prompt("Sunny, Cloudy, Raining, Snowing, Thunder.     ").toLowerCase();

let weather_value = weather(temp, cond);
if (weather_value)
  console.log("The weather seems to be good enough. You have to go to work.");
else console.log("You are lucky today. The weather is terrible. You can stay at home");

let exit = prompt("If you want to exit type YES. ");
if (exit.toLowerCase() == "yes")
  not_terminate = true;
}

console.log("Have a good day.");

