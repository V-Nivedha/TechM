function EvenNumber() {
  return <h1>EvenNumber!</h1>;
}

function OddNumber() {
  return <h1>OddNumber!</h1>;
}

function NumberComponent(props) {
  const isNum = props.num;



  let n = isNum % 2 == 0;
  switch (n) {
    case true:
      return <EvenNumber></EvenNumber>;
    // return <h1>Even Number!</h1>;
    case false:
      return <OddNumber></OddNumber>;
    //return <h1>Odd Number!</h1>;
  }
  
}

const root = ReactDOM.createRoot(document.getElementById("switchex"));
root.render(<NumberComponent num="14156" />);
