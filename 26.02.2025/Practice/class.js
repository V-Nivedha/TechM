class List extends React.Component {
  render() {
    return <h1> [{this.props.list1.join(", ")}]</h1>;
  }
}
const list = [5, 2, 3];
const root = ReactDOM.createRoot(document.getElementById("list"));
root.render(<List list1={list.sort()} />);
