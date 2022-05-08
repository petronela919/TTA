function addition(x, y){
  return parseFloat(x) + parseFloat(y);
}

function substraction(x, y){
  return parseFloat(x) - parseFloat(y);
}

function division(x, y){
  return parseFloat(x) / parseFloat(y);
}

function multiplication(x, y){
  return parseFloat(x) * parseFloat(y);
}

function power(x, y){
  let new_x = 1;
  for (let i = 0; i < y; i++){
    new_x = new_x * x;
  }
  return new_x;
}


let terminate = false;

while(!terminate){
  let firstValue = prompt("x = ");
  let secondValue = prompt("y = ");
  
  console.log("What operation would you like to do:")
  console.log("a) +   addition");
  console.log("b) -   substraction");
  console.log("c) /  division");
  console.log("d) *  multiplication");
  console.log("e) ^  raised to the power of");
  
  let operation = prompt("");
  
  switch(operation.toLowerCase()){
    case '+':
    case 'addition':
    case 'a':
      console.log(`${firstValue} + ${secondValue} = ${addition(firstValue, secondValue)}`);
      break;
  
    case '-':
    case 'substraction':
    case 'b':
      console.log(`${firstValue} - ${secondValue} = ${substraction(firstValue, secondValue)}`);
      break;
  
    case '/':
    case 'division':
    case 'c':
      console.log(`${firstValue} / ${secondValue} = ${division(firstValue, secondValue)}`);
      break;
  
    case '*':
    case 'multiplication':
    case 'd':
      console.log(`${firstValue} * ${secondValue} = ${multiplication(firstValue, secondValue)}`);
      break;
  
    case '^':
    case 'raised':
    case 'raised to the power of':
    case 'raised to the power':
    case 'power':
    case 'e':
      console.log(`${firstValue} ^ ${secondValue} = ${power(firstValue, secondValue)}`);
      break;
  
  }

  let exit = prompt("Would you like to do another calculation? ('yes' / 'no') ");

  switch(exit.toLowerCase()){
    case 'no':
    case 'exit':
      terminate = true;
      break;
  }
}


