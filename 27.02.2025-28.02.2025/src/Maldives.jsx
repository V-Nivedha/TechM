


import './App.css'


import { useState } from "react";
import Contact from "./Contact/Contact"; // Import the Contact component

function Maldives() {
    const [showContact, setShowContact] = useState(false);

    return (
        <div>
            <h3>Explore Maldives!!!!!</h3>
            <img 
                src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQwSDDRS_MDsCCYQGfE7Sx76DTBLmeUf8KPKvrTjeHQi5q741T5uF9u73D9iVD-NeK1Gs&usqp=CAU" 
                alt="Maldives" 
                width="300" 
                height="300" 
            />
            <br />
            <a href="https://www.cia-france.com/french-adults-courses/paris-school/to-do-in-paris">Click here</a>
            <br />

            {/* Button to show Contact Form */}
            <button onClick={() => setShowContact(true)}>Contact Us</button>

            {/* Conditionally render Contact component */}
            {showContact && <Contact />}
        </div>
    );
}

export default Maldives;
