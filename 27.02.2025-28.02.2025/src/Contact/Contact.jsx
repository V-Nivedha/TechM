


import { useState } from "react";
 function Contact(){
    return(
        <div>
        <h2>Contact Us</h2>
        <form >
            <label>Name:</label>
            <input type="text" name="name"  required />
<br/>
<br/>
            <label>Email:</label>
            <input type="email" name="email" required />
<br/>
<br/>
            <label>Message:</label>
            <textarea name="message"  required />
<br/>
            <button type="submit"  >Submit</button>
        </form>
      </div>
    )
 }

export default Contact