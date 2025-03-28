// Task 1: Check divisibility by 13
function Divisibility(props) {
  const num = props.no;
  return (
    <h1>
      {num} {num % 13 === 0 ? "is divisible by 13" : "is not divisible by 13"}
    </h1>
  );
}

const multiples = ReactDOM.createRoot(document.getElementById("multiples"));
multiples.render(
  <>
    <Divisibility no={26} />
    <Divisibility no={27} />
  </>
);

// Task 2: Check if string length is even or odd
function StringLength(props) {
  const stringLength = props.str.length;
  return (
    <h3>
      Length of the word {props.str} : {stringLength}{" "}
      {stringLength % 2 === 0 ? "is even" : "is odd"}
    </h3>
  );
}

const stringlength1 = ReactDOM.createRoot(
  document.getElementById("stringlength")
);
stringlength1.render(<StringLength str="nivedha" />);

// Task 3: Check if array length is divisible by 3
function Arraylength(props) {
  const length2 = props.array.length;
  return (
    <p>
      The number of elements in the array [{props.array.join(", ")}]{" "}
      {length2 % 3 === 0 ? "is divisible by 3" : "is not divisible by 3"}
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

// Task 4: Check if a string contains vowels (without regex)
function VowelCheck(props) {
  const str = props.str.toLowerCase();
  const vowels = ["a", "e", "i", "o", "u"];
  const hasVowel = [...str].some((char) => vowels.includes(char));
  return (
    <p>
      {hasVowel
        ? "The string has a vowel"
        : "The string does not contain a vowel"}
    </p>
  );
}

const root = ReactDOM.createRoot(document.getElementById("Vowelcheck"));
root.render(
  <>
    <VowelCheck str="hello" />
    <VowelCheck str="sky" />
  </>
);

// Task 5: Check if the input is a flower (without .includes)
function FlowerCheck(props) {
  const flowers = ["Rose", "Jasmine", "Lotus"];
  const isFlower = flowers.some((flower) => flower === props.name);
  return (
    <h3>
      {isFlower
        ? `${props.name} is a flower.`
        : `${props.name} is not a flower.`}
    </h3>
  );
}

const root1 = ReactDOM.createRoot(document.getElementById("flowerCheck"));
root1.render(
  <>
    <FlowerCheck name="Rose" />
    <FlowerCheck name="Lily" />
  </>
);
