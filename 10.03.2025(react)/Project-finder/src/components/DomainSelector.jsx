import { useEffect, useState } from "react";

const DomainSelector = ({ onSelectDomain }) => {
  const [domains, setDomains] = useState([]);

  useEffect(() => {
    fetch("/api.json")
      .then((response) => response.json())
      .then((data) => {
        setDomains(data.domains);
        if (data.domains.length > 0) {
          onSelectDomain(data.domains[0].domain); // Set default domain
        }
      })
      .catch((error) => console.error("Error fetching domains:", error));
  }, [onSelectDomain]);

  return (
    <div>
      <label>Select Domain: </label>
      <select onChange={(e) => onSelectDomain(e.target.value)}>
        {domains.map((d, index) => (
          <option key={index} value={d.domain}>
            {d.domain}
          </option>
        ))}
      </select>
    </div>
  );
};

export default DomainSelector;
