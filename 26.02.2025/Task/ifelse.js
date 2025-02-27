function Divisible(props) {
  const n = props.num;
  if (n % 16 == 0) {
    return (
      <p>
        {n} is <span style = {{color : "red"}} ><b>Divisible</b></span> by 16{" "}
      </p>
    );
  } else {
    return (
      <p>
        {n} is <span style = {{color:"red"}}><b>not Divisible</b> </span> by 16{" "}
      </p>
    );
  }
}
const root = ReactDOM.createRoot(document.getElementById("ifelse"));
root.render(
  <>
    <Divisible num={32} />
    <Divisible num={18} />{" "}
  </>
);
