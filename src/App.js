import React, { useState, useEffect } from "react";

function App() {
  const [message, setMessage] = useState("");

   //const API_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";

  useEffect(() => {
    fetch("https://diligent-passion-production.up.railway.app/hello")
      .then((res) => res.text())
      .then(setMessage)
      .catch((err) => setMessage("Failed to fetch message"));
  }, []);

  return (
    <div style={{ marginTop: "50px", textAlign: "center" }}>
      <h1>HelloWorld From React</h1>
      <h2>{message}</h2>
      <h2>By Robot 😎</h2>
    </div>
  );
}

export default App;

