//Task1

function Divisibility(props) {
  const num = props.no;
  if (num % 13 == 0) {
    return <h1>{num} is divisible by 13</h1>;
  }
  return <h1>{num} is not divisible by 13</h1>;
}

const multiples = ReactDOM.createRoot(document.getElementById("multiples"));
multiples.render(
  <>
    <Divisibility no={26} /> <Divisibility no={27} />
  </>
);

//Task2

function StringLength(props) {
  const stringLength = props.str.length;
  if (stringLength % 2 == 0) {
    return (
      <h3>
        length of the word {props.str} : {stringLength} is even
      </h3>
    );
  }
  {
    return (
      <h3>
        length of the word {props.str} : {stringLength} is odd
      </h3>
    );
  }
}
const stringlength1 = ReactDOM.createRoot(
  document.getElementById("stringlength")
);
stringlength1.render(<StringLength str="nivedha" />);

// Task3

function Arraylength(props) {
  const length2 = props.array.length;
  if (length2 % 3 === 0) {
    return (
      <p>
        the number of element in the array[{props.array.join(", ")}] is
        divisible by 3
      </p>
    );
  }
  return (
    <p>
      the number of element in the array [{props.array.join(", ")}] is not
      divisible by 3
    </p>
  );
}

const arraylength = ReactDOM.createRoot(document.getElementById("Arraylength"));
arraylength.render(
  <>
    <Arraylength array={[12, 45, 67]} />
    <Arraylength array={[27, 78]} />
  </>
);

//Task4

function VowelCheck(props) {
  const vowels = /[aeiouAEIOU]/;
  const hasVowel = vowels.test(props.str);
  if (hasVowel) {
    return <p> the string has vowel </p>;
  }
  return <p>the string does not contain vowel</p>;
}

const root = ReactDOM.createRoot(document.getElementById("Vowelcheck"));
root.render(
  <>
    <VowelCheck str="hello" />
    <VowelCheck str="sky" />
  </>
);

//task5

function FlowerCheck(props) {
  const flowers = ["Rose", "Jasmine", "Lotus"];
  let message = `${props.name} is not a flower.`;

  for (let i = 0; i < flowers.length; i++) {
    if (props.name === flowers[i]) {
      message = `${props.name} is a flower.`;
      break;
    }
  }

  return <h3>{message}</h3>;
}

const root1 = ReactDOM.createRoot(document.getElementById("flowerCheck"));
root1.render(
  <>
    <FlowerCheck name="Rose" />
    <FlowerCheck name="Lily" />
  </>
);
