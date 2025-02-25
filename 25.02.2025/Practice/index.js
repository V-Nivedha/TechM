function Football() {
  const shoot = () => {
    alert("good shot");
  };
  return <button onClick={shoot}>tap for shoot</button>;
}
const root = ReactDOM.createRoot(document.getElementById("root1"));
root.render(<Football />);
