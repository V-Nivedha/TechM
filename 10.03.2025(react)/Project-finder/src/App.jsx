import { useState } from "react";
import DomainSelector from "./components/DomainSelector";
import ProjectList from "./components/ProjectList";
import "./styles/style.css"; // Import styles

const App = () => {
  const [selectedDomain, setSelectedDomain] = useState("");

  return (
    <div className="container">
      <h1>Final Year Project Suggestor</h1>
      <DomainSelector onSelectDomain={setSelectedDomain} />
      {selectedDomain && <ProjectList domain={selectedDomain} />}
    </div>
  );
};

export default App;
