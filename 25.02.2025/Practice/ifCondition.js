function Even() {
  return <h1>EvenNumber</h1>;
}
function Odd() {
  return <h2>OddNumber</h2>;
}
function CheckNumber(props) {
  const isNum = props.num;
  if (isNum % 2 == 0) {
    return <Even />;
  }
  return <Odd />;
}
const root1 = ReactDOM.createRoot(document.getElementById("root"));
root1.render(<CheckNumber num={58} />);

//logical And

function FriendsForMe(props) {
  const friends = props.friends;
  return (
    <>
      <h1>About Friends!!</h1>
      {friends.length > 0 && (
        <h2>You have {friends.length} friends for you!!!</h2>
      )}
      <h3>You have no friends for you!!!</h3>
    </>
  );
}
const friends = ["ABCD", "MDA", "SP", "ABR"];
const friendss = [];
const root = ReactDOM.createRoot(document.getElementById("root1"));
root.render(<FriendsForMe friends={friendss} />);

// Ternary condition

function EvenNumber() {
  return <h1>EvenNumber!</h1>;
}

function OddNumber() {
  return <h1>OddNumber!</h1>;
}
function CheckNumber2(props) {
  const isNum = props.num;
  return <>{isNum % 2 == 0 ? <EvenNumber /> : <OddNumber />}</>;
}

const root2 = ReactDOM.createRoot(document.getElementById("root2"));
root2.render(<CheckNumber2 num="90" />);
