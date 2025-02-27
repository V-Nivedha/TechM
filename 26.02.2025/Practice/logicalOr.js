function FriendsForMe(props) {
  const friends = props.friends;
  return (
    <>
      <h1>About Friends!!</h1>
      {friends.length > 0 || <h3>You have no friends for you!!!</h3>}
      {friends.length == 0 || (
        <h2>You have {friends.length} friends for you!!!</h2>
      )}
    </>
  );
}
const friends = ["a", "b", "c", "d", "e", "f", "g"];
const friendss = [];
const root = ReactDOM.createRoot(document.getElementById("logicalor"));
root.render(<FriendsForMe friends={friends} />);
