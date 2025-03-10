import { useEffect, useState } from "react";

const ProjectList = ({ domain }) => {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    fetch("/api.json")
      .then((response) => response.json())
      .then((data) => {
        const selectedDomain = data.domains.find((d) => d.domain === domain);
        setProjects(selectedDomain ? selectedDomain.projects : []);
      })
      .catch((error) => console.error("Error fetching projects:", error));
  }, [domain]);

  return (
    <div>
      <h2>{domain}</h2>
      <div className="project-grid">
        {projects.map((project, idx) => (
          <div key={idx} className="project-card">
            <img src={project.image} alt={project.name} className="project-image" />
            <h3>{project.name}</h3>
          </div>
        ))}
      </div>
    </div>
  );
};

export default ProjectList;
