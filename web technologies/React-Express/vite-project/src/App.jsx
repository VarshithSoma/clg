import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

function App() {
  const [msg, setMsg] = useState("");

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get("http://localhost:3000/api/data");
        setMsg(response.data.message); // Update state with the response message
      } catch (error) {
        console.error("Error fetching data:", error);
        setMsg("Error fetching data.");
      }
    };

    fetchData(); // Call the async function
  }, []);

  return (
    <div>
      <h1>{msg}</h1>
    </div>
  );
}

export default App;
