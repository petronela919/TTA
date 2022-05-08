var fruits = ['Apple', 'Orange', 'Banana', 'Pear', 'Peach', 'Strawberry', 'Cherry', 'Acai'];

for (let fruit in fruits){
  let vowels = 0, consonants = 0;

  for(var i = 0; i < fruits[fruit].length; i++){
    switch(fruits[fruit][i].toLowerCase()){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        vowels++;
        break;
      default:
        consonants++;
        break;
    }
  }

  let first_letter = fruits[fruit][0].toLowerCase();
  switch(first_letter){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
      first_letter = "An";
      break;
    default:
      first_letter = "A";
      break;
  }

  let vowel = "vowel";
  if(vowels > 1)
    vowel = "vowels";
  
  let consonant = "consonant";
  if(consonants > 1)
    consonant = "consonants";
  

  console.log(`${first_letter} ${fruits[fruit]} has ${vowels} ${vowel} and ${consonants} ${consonant}.`);
}